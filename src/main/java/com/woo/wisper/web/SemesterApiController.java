/**
 * @(#)CourseApiController.java 2014年10月23日
 *
 * Copyright 2008-2014 by Woo Cupid.
 * All rights reserved.
 * 
 */
package com.woo.wisper.web;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.woo.wisper.domain.*;
import com.woo.wisper.repository.*;

import edu.hunter.modules.web.springmvc.*;

/**
 * @author Woo Cupid
 * @date 2014年10月23日
 * @version $Revision$
 */
@RestController
@RequestMapping(value = "/api")
public class SemesterApiController {

	@Autowired
	private SemesterRepository semesterRepository;

	@Autowired
	private CourseRepository courseRepository;

	/**
	 * get semesters along with courses of the subject plan
	 * 
	 * @param planId
	 * @return
	 */
	@RequestMapping("/plan/{planId}/semester")
	public JsonResult getSemestersByPlanId(@PathVariable(value = "planId") Long planId) {
		List<Semester> findBySubjectPlanId = semesterRepository.findBySubjectPlanId(planId);
		return JsonResult.success(findBySubjectPlanId);
	}

}
