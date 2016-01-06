/**
 * @(#)CourseApiController.java 2014年10月23日
 *
 * Copyright 2008-2014 by Woo Cupid.
 * All rights reserved.
 * 
 */
package com.woo.wisper.web;

import java.util.*;

import javax.validation.*;

import org.apache.http.util.*;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.validation.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.*;

import com.google.common.collect.*;
import com.woo.wisper.domain.*;
import com.woo.wisper.repository.*;
import com.woo.wisper.service.*;

import edu.hunter.modules.web.springmvc.*;
import edu.hunter.modules.web.springmvc.ex.*;

/**
 * @author Woo Cupid
 * @date 2014年10月23日
 * @version $Revision$
 */
@RestController
@RequestMapping(value = "/api")
public class DiscussApiController {

	private static final Logger logger = LoggerFactory.getLogger(DiscussApiController.class);

	@Autowired
	private DiscussRepository discussRepository;

	@Autowired
	private DiscussService discussService;

	@Autowired
	private UploadService uploadService;

	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public JsonResult postFile(@RequestParam("file") MultipartFile file) {
		try {
			String upload = uploadService.upload(file, "topic", "uploads");
			return JsonResult.success(upload);
		} catch (Exception e) {
			return JsonResult.failed(e.getMessage());
		}
	}

	/**
	 * 发帖子
	 * 
	 * @param studentId
	 * @return
	 */
	@RequestMapping(value = "/semester/{semesterId}/course/{courseId}/topic", method = RequestMethod.POST)
	public JsonResult postTopic(@PathVariable(value = "courseId") Long courseId,
			@PathVariable(value = "semesterId") Long semesterId, Discuss discuss) {
		try {
			Asserts.notEmpty(discuss.getTopic(), "topic");
			Asserts.notEmpty(discuss.getContent(), "content");
			Asserts.notNull(discuss.getCreateBy(), "createBy");

			discuss.setIsTopic(true);
			discuss.setCourseId(courseId);
			discuss.setSemesterId(semesterId);
			discuss.setReplyTo(null);
			discuss.setOwner(discuss.getCreateBy());
			discussRepository.doPostDiscuss(discuss);
			return JsonResult.success(discuss);
		} catch (Exception e) {
			throw new ApiException(e.getMessage());
		}
	}

	/**
	 * 回复
	 * 
	 * @param courseId
	 * @param semesterId
	 * @param discuss
	 * @return
	 */
	@RequestMapping(value = "/semester/{semesterId}/course/{courseId}/topic/{topicId}", method = RequestMethod.POST)
	public JsonResult replyTopic(@PathVariable(value = "courseId") Long courseId,
			@PathVariable(value = "semesterId") Long semesterId, @PathVariable(value = "topicId") Long topicId,
			@Valid Discuss discuss, BindingResult br) {
		try {
			if (!br.hasErrors()) {
				discuss.setTopicId(topicId);
				discuss.setCourseId(courseId);
				discuss.setSemesterId(semesterId);
				discussService.postReply(discuss);
				return JsonResult.success(discuss);
			} else {
				return JsonResult.failed("illegal form filed", FormValidator.extractErros(br));
			}
		} catch (Exception e) {
			throw new ApiException(e.getMessage());
		}
	}

	@RequestMapping(value = "/semester/{semesterId}/course/{courseId}/topic", method = RequestMethod.GET)
	public JsonResult getTopics(@PathVariable(value = "courseId") Long courseId,
			@PathVariable(value = "semesterId") Long semesterId, @RequestParam(required = false) Date submitOn) {
		try {
			HashMap<String, Object> params = Maps.newHashMap();
			params.put("courseId", courseId);
			params.put("semesterId", semesterId);
			params.put("submitOn", submitOn == null ? new Date() : submitOn);
			List<Discuss> topics = discussRepository.getTopics(params);
			return JsonResult.success(topics);
		} catch (Exception e) {
			throw new ApiException(e.getMessage());
		}
	}

	@RequestMapping(value = "/semester/{semesterId}/course/{courseId}/topic/{topicId}", method = RequestMethod.GET)
	public JsonResult getTopic(@PathVariable(value = "courseId") Long courseId,
			@PathVariable(value = "semesterId") Long semesterId, @PathVariable(value = "topicId") Long topicId,
			@RequestParam(required = false) Date submitOn) {
		try {
			HashMap<String, Object> params = Maps.newHashMap();
			params.put("topicId", topicId);
			params.put("courseId", courseId);
			params.put("semesterId", semesterId);
			params.put("submitOn", submitOn == null ? new Date() : submitOn);
			List<Discuss> topics = discussRepository.getTopicWithReply(params);
			return JsonResult.success(topics);
		} catch (Exception e) {
			throw new ApiException(e.getMessage());
		}
	}
}
