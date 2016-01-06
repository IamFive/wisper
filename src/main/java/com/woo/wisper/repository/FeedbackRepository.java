/**
 * @(#)CourseRepository.java 2014年10月24日
 *
 * Copyright 2008-2014 by Woo Cupid.
 * All rights reserved.
 * 
 */
package com.woo.wisper.repository;

import com.woo.wisper.domain.*;

import edu.hunter.modules.persistence.mybatis.*;

/**
 * @author Woo Cupid
 * @date 2014年10月24日
 * @version $Revision$
 */
@MyBatis
public interface FeedbackRepository {

	/**
	 * feedback a schedule
	 * 
	 * @param feedback
	 */
	void feedback(Feedback feedback);

	Feedback getFeedback(Feedback example);

}
