/**
 * @(#)DiscussService.java 2014年10月31日
 *
 * Copyright 2008-2014 by Woo Cupid.
 * All rights reserved.
 * 
 */
package com.woo.wisper.service;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;

import com.woo.wisper.domain.*;
import com.woo.wisper.repository.*;

/**
 * @author Woo Cupid
 * @date 2014年10月31日
 * @version $Revision$
 */
@Service
public class DiscussService {

	@Autowired
	private DiscussRepository discussRepository;

	@Transactional
	public void postReply(Discuss reply) {

		Discuss topic = discussRepository.getTopic(reply.getTopicId());

		// post reply
		reply.setTopic(null);
		reply.setIsTopic(false);
		reply.setOwner(topic.getCreateBy());
		reply.setReplyTo(reply.getReplyTo() == null ? topic.getId() : reply.getReplyTo());
		discussRepository.doPostDiscuss(reply);

		// increase reply num
		discussRepository.increaseReplyCount(reply.getTopicId());
	}
}
