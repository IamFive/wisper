/**
 * @(#)CourseRepository.java 2014年10月24日
 *
 * Copyright 2008-2014 by Woo Cupid.
 * All rights reserved.
 * 
 */
package com.woo.wisper.repository;

import com.woo.wisper.domain.Member;

import edu.hunter.modules.persistence.mybatis.MyBatis;

/**
 * @author Woo Cupid
 * @date 2014年10月24日
 * @version $Revision$
 */
@MyBatis
public interface MemberRepository {

	public void save(Member m);

}
