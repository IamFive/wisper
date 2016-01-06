/**
 * @(#)CourseApiController.java 2014年10月23日
 *
 * Copyright 2008-2014 by Woo Cupid.
 * All rights reserved.
 * 
 */
package com.woo.wisper.web;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

import javax.validation.Valid;

import org.apache.commons.collections.ListUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.woo.wisper.domain.Checkin;
import com.woo.wisper.domain.Course;
import com.woo.wisper.repository.CourseRepository;
import com.woo.wisper.repository.SemesterRepository;

import edu.hunter.modules.web.springmvc.FormValidator;
import edu.hunter.modules.web.springmvc.JsonResult;
import edu.hunter.modules.web.springmvc.ex.ApiException;

/**
 * @author Woo Cupid
 * @date 2014年10月23日
 * @version $Revision$
 */
@RestController
@RequestMapping(value = "/api")
public class CourseApiController {

	@Autowired
	private CourseRepository courseRepository;

	@Autowired
	private SemesterRepository semesterRepository;

	@RequestMapping(value = "/course/{id}", method = RequestMethod.GET)
	public JsonResult get(@PathVariable(value = "id") Long id) {
		Course course = courseRepository.get(id);
		return JsonResult.success(course);
	}

	/**
	 * 获取学期选修课程列表
	 * 
	 * @param semesterId 学期ID
	 * @return
	 */
	@RequestMapping(value = "/semester/{semesterId}/course", method = RequestMethod.GET)
	public JsonResult getSemesterCourses(@PathVariable(value = "semesterId") Long semesterId) {
		List<Course> courses = courseRepository.findBySemesterId(semesterId);
		// TODO join num & time & place
		return JsonResult.success(courses);
	}

	/**
	 * 选课
	 * 
	 * @param studentId
	 * @return
	 */
	@RequestMapping(value = "/student/{studentId}/semester/{semesterId}/course", method = RequestMethod.POST)
	public JsonResult doElective(@PathVariable(value = "studentId") Long studentId,
			@PathVariable("semesterId") Long semesterId, @RequestParam("courses") Set<Long> courses) {

		// TODO validate whether elective time has expired

		// validate whether user belong to this semester
		List<Long> semesterIds = semesterRepository.findSemesterIdsByStudentId(studentId);
		if (CollectionUtils.isEmpty(semesterIds) || !semesterIds.contains(semesterId)) {
			throw new ApiException("The student {0} doesn''t belong to semester {1}", studentId, semesterId);
		}

		// validate whether all posted courses belong to the semester
		List<Long> courseIds = courseRepository.findCourseIdsBySemesterId(semesterId);
		if (!courseIds.containsAll(courses)) {
			throw new ApiException("the semester `{0}` doesn''t contains posted courses {1}", semesterId,
					ListUtils.subtract(Lists.newArrayList(courses), courseIds));
		}

		// validate whether user has choose any course in posted list
		List<Long> choosedCourses = semesterRepository.findChoosedCourses(studentId, semesterId);
		if (CollectionUtils.containsAny(choosedCourses, courses)) {
			throw new ApiException("the user {0} has picked up course {1}", studentId, ListUtils.intersection(
					choosedCourses, Lists.newArrayList(courses)));
		}

		// build parameters
		HashMap<String, Object> map = Maps.newHashMap();
		map.put("studentId", studentId);
		map.put("semesterId", semesterId);
		map.put("courses", courses);
		courseRepository.doElective(map);
		return JsonResult.success();
	}

	@RequestMapping(value = "/student/{studentId}/semester/{semesterId}/course", method = RequestMethod.GET)
	public JsonResult getChoosedCourses(@PathVariable(value = "studentId") Long studentId,
			@PathVariable("semesterId") Long semesterId, @RequestParam Integer week) {
		HashMap<String, Object> map = Maps.newHashMap();
		map.put("studentId", studentId);
		map.put("semesterId", semesterId);
		map.put("week", week);
		List<Course> findChoosedCourses = courseRepository.findChoosedCourses(map);
		return JsonResult.success(findChoosedCourses);
	}

	@RequestMapping(value = "/student/{studentId}/semester/{semesterId}/course/{courseId}/checkin", method = RequestMethod.POST)
	public JsonResult checkin(@Valid Checkin checkin, BindingResult br) {
		// TODO add validation
		if (!br.hasErrors()) {
			courseRepository.checkin(checkin);
			return JsonResult.success();
		} else {
			return JsonResult.failed("illegal form filed", FormValidator.extractErros(br));
		}
	}

}
