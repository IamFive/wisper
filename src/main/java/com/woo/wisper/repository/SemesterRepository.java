/**
 * @(#)CourseRepository.java 2014年10月24日
 *
 * Copyright 2008-2014 by Woo Cupid.
 * All rights reserved.
 * 
 */
package com.woo.wisper.repository;

import java.util.*;

import org.apache.ibatis.annotations.*;

import com.woo.wisper.domain.*;

import edu.hunter.modules.persistence.mybatis.*;

/**
 * @author Woo Cupid
 * @date 2014年10月24日
 * @version $Revision$
 */
@MyBatis
public interface SemesterRepository {

	/**
	 * 查询所有学期和该学期的课程列表信息
	 * 
	 * @param subjectPlanId
	 * @return
	 */
	List<Semester> findBySubjectPlanId(Long subjectPlanId);

	/**
	 * 查询一个学生的所有学期Id
	 * 
	 * @param studentId
	 * @return
	 */
	List<Long> findSemesterIdsByStudentId(Long studentId);

	/**
	 * 查询一个学生的所有学期Id
	 * 
	 * @param studentId
	 * @return
	 */
	@Select("SELECT id FROM e_elective where student_id = #{0} and semester_id = #{1}")
	List<Long> findChoosedCourses(Long studentId, Long semesterId);

}
