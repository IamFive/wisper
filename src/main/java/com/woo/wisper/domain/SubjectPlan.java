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
public class SubjectPlan extends Domain implements Serializable {

	private static final long serialVersionUID = 7991588979620990608L;

	private Long subjectId;
	private Integer grade;
	private Integer years;
	private Integer requiredCredit;

	public Long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}

	public Integer getGrade() {
		return grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

	public Integer getYears() {
		return years;
	}

	public void setYears(Integer years) {
		this.years = years;
	}

	public Integer getRequiredCredit() {
		return requiredCredit;
	}

	public void setRequiredCredit(Integer requiredCredit) {
		this.requiredCredit = requiredCredit;
	}

}
