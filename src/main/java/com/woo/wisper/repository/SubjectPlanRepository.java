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
 * Include operations with subject_plan & subject_plan_detail
 * 
 * @author Woo Cupid
 * @date 2014年10月24日
 * @version $Revision$
 */
@MyBatis
public interface SubjectPlanRepository {

	/**
	 * get single student's subject plan
	 * 
	 * @param studentId
	 * @return
	 */
	SubjectPlan findByStudentId(Long studentId);

	/**
	 * get single student's subject plan detail list
	 * 
	 * @param studentId
	 * @return
	 */
	List<SubjectPlanDetail> findSubjectPlanDetailsByStudentId(Long studentId);

}
