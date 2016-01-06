/**
 * @(#)CourseApiController.java 2014年10月23日
 *
 * Copyright 2008-2014 by Woo Cupid.
 * All rights reserved.
 * 
 */
package com.woo.wisper.web;

import javax.validation.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.validation.*;
import org.springframework.web.bind.annotation.*;

import com.woo.wisper.*;
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
public class FeedbackApiController {

	@Autowired
	private FeedbackRepository feedbackRepository;

	@RequestMapping(value = "/student/{studentId}/semester/{semesterId}/course/{courseId}/feedback", method = RequestMethod.POST)
	public JsonResult feedback(@Valid Feedback feedback, BindingResult br) {
		// TODO add validation
		if (!br.hasErrors()) {
			feedback.setStatus(Constants.Feedback_TO_AUDIT);
			feedbackRepository.feedback(feedback);
			return JsonResult.success();
		} else {
			return JsonResult.failed("illegal form filed", FormValidator.extractErros(br));
		}
	}

	@RequestMapping(value = "/student/{studentId}/semester/{semesterId}/course/{courseId}/feedback", method = RequestMethod.GET)
	public JsonResult getFeedback(Feedback feedback) {
		Feedback result = feedbackRepository.getFeedback(feedback);
		return JsonResult.success(result);
	}
}
