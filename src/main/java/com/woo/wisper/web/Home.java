/**
 * @(#)CourseApiController.java 2014年10月23日
 *
 * Copyright 2008-2014 by Woo Cupid.
 * All rights reserved.
 * 
 */
package com.woo.wisper.web;

import java.util.Properties;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woo.wisper.repository.MemberRepository;

/**
 * @author Woo Cupid
 * @date 2014年10月23日
 * @version $Revision$
 */
@Controller
@RequestMapping(value = "")
public class Home {

	@Autowired
	MemberRepository memberRep;

	@Resource(name = "properties")
	Properties properties;


	@RequestMapping("/")
	public String home() {
		return "index";
	}

}
