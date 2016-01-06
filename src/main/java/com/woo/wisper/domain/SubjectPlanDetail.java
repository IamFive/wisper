/**
 * @(#)Course.java 2014年10月23日
 *
 * Copyright 2008-2014 by Woo Cupid.
 * All rights reserved.
 * 
 */
package com.woo.wisper.domain;

import java.io.*;

/**
 * @author Woo Cupid
 * @date 2014年10月23日
 * @version $Revision$
 */
public class SubjectPlanDetail extends Domain implements Serializable {

	private static final long serialVersionUID = 7991588979620990608L;

	private Long subjectPlanId;
	private Integer moduleId;
	private String module;
	private Integer requiredCredit;

	public Long getSubjectPlanId() {
		return subjectPlanId;
	}

	public void setSubjectPlanId(Long subjectPlanId) {
		this.subjectPlanId = subjectPlanId;
	}

	public Integer getModuleId() {
		return moduleId;
	}

	public void setModuleId(Integer moduleId) {
		this.moduleId = moduleId;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public Integer getRequiredCredit() {
		return requiredCredit;
	}

	public void setRequiredCredit(Integer requiredCredit) {
		this.requiredCredit = requiredCredit;
	}

}
