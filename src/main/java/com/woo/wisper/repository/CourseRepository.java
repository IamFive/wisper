/**
 * @(#)CourseRepository.java 2014年10月24日
 *
 * Copyright 2008-2014 by Woo Cupid.
 * All rights reserved.
 * 
 */
package com.woo.wisper.repository;

import java.util.*;

import com.woo.wisper.domain.*;

import edu.hunter.modules.persistence.mybatis.*;

/**
 * @author Woo Cupid
 * @date 2014年10月24日
 * @version $Revision$
 */
@MyBatis
public interface CourseRepository {

	/**
	 * 
	 * @param courseId
	 * @return
	 */
	Course get(Long courseId);

	/**
	 * 查询某个学期下的所有课程的详情（包括课表信息）
	 * 
	 * @param semesterId
	 * @return
	 */
	List<Course> findBySemesterId(Long semesterId);

	/**
	 * 查询某个学期下的所有课程（仅返回Id列表）
	 * 
	 * @param semesterId
	 * @return
	 */
	List<Long> findCourseIdsBySemesterId(Long semesterId);

	/**
	 * 选课
	 * 
	 * @param params map contains {"semesterId", "courses", "studentId"}
	 */
	void doElective(HashMap<String, Object> params);

	/**
	 * 获取学生在某个学期下选的所有课程的详情
	 * 
	 * @param studentId
	 * @param semesterId
	 */
	List<Course> findChoosedCourses(HashMap<String, Object> map);

	/**
	 * 签到
	 * 
	 * @param checkin
	 */
	void checkin(Checkin checkin);

}
