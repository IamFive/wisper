/**
 * @(#)Course.java 2014年10月23日
 *
 * Copyright 2008-2014 by Woo Cupid.
 * All rights reserved.
 * 
 */
package com.woo.wisper.domain;

import java.io.*;
import java.util.*;

import com.google.common.collect.*;

/**
 * @author Woo Cupid
 * @date 2014年10月23日
 * @version $Revision$
 */
public class Semester extends Domain implements Serializable {

	private static final long serialVersionUID = 4417127257713321767L;

	private Integer subjectPlanId;
	private String name;
	private Boolean isCurrent;
	private Date startDate;
	private Date endDate;

	private List<Course> courses = Lists.newArrayList();

	public Integer getSubjectPlanId() {
		return subjectPlanId;
	}

	public void setSubjectPlanId(Integer subjectPlanId) {
		this.subjectPlanId = subjectPlanId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getIsCurrent() {
		return isCurrent;
	}

	public void setIsCurrent(Boolean isCurrent) {
		this.isCurrent = isCurrent;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

}
