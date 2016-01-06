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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.Maps;
import com.woo.wisper.domain.Member;
import com.woo.wisper.domain.Subject;
import com.woo.wisper.domain.SubjectPlanDetail;
import com.woo.wisper.repository.MemberRepository;
import com.woo.wisper.repository.SubjectPlanRepository;
import com.woo.wisper.repository.SubjectRepository;

import edu.hunter.modules.web.springmvc.JsonResult;

/**
 * @author Woo Cupid
 * @date 2014年10月23日
 * @version $Revision$
 */
@RestController
@RequestMapping(value = "/api")
public class SubjectApiController {

	@Autowired
	MemberRepository memberRep;

	@Autowired
	private SubjectRepository subjectRepository;

	@Autowired
	private SubjectPlanRepository subjectPlanRepository;

	@RequestMapping("/student/{studentId}/subject")
	public JsonResult getStudentSubject(@PathVariable(value = "studentId") Long studentId) {
		Subject subject = subjectRepository.findByStudentId(studentId);
		return JsonResult.success(subject);
	}

	@RequestMapping("/student/{studentId}/subject/plan")
	public JsonResult getStudentSubjectPlan(@PathVariable(value = "studentId") Long studentId) {
		List<SubjectPlanDetail> details = subjectPlanRepository.findSubjectPlanDetailsByStudentId(studentId);
		return JsonResult.success(details);
	}

	@RequestMapping("/member")
	public JsonResult saveMember() {
		Member member = new Member();
		member.setIsAdmin(true);
		member.setName("Woo");
		member.setRegistIp("10.10.1.1");
		HashMap<String, Object> newHashMap = Maps.newHashMap();
		newHashMap.put("age", 11);
		member.setProfile(newHashMap);
		memberRep.save(member);
		return JsonResult.success();
	}
}
