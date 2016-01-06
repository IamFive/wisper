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
public interface DiscussRepository {

	/**
	 * @param discuss
	 */
	void doPostDiscuss(Discuss discuss);

	/**
	 * 获取话题列表
	 * 
	 * @param params
	 */
	List<Discuss> getTopics(HashMap<String, Object> params);

	/**
	 * @param topicId
	 */
	void increaseReplyCount(Long topicId);

	/**
	 * 获取话题以及回复列表
	 * 
	 * @param params
	 * @return
	 */
	List<Discuss> getTopicWithReply(HashMap<String, Object> params);

	/**
	 * 获取单个主题
	 * 
	 * @param topicId
	 * @return
	 */
	Discuss getTopic(Long topicId);

}
