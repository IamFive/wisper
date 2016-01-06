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

import javax.validation.constraints.*;

/**
 * 
 * @author Woo Cupid
 * @date 2014年10月28日
 * @version $Revision$
 */
public class Checkin extends Domain implements Serializable {

	private static final long serialVersionUID = -7182667989234579122L;

	@NotNull
	private Integer semesterId;

	@NotNull
	private Integer courseId;

	@NotNull
	private Integer studentId;

	@NotNull
	private Integer scheduleId;

	@NotNull
	private Integer week;

	private Date checkinOn = new Date();

	public Integer getSemesterId() {
		return semesterId;
	}

	public void setSemesterId(Integer semesterId) {
		this.semesterId = semesterId;
	}

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public Integer getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(Integer scheduleId) {
		this.scheduleId = scheduleId;
	}

	public Integer getWeek() {
		return week;
	}

	public void setWeek(Integer week) {
		this.week = week;
	}

	public Date getCheckinOn() {
		return checkinOn;
	}

	public void setCheckinOn(Date checkinOn) {
		this.checkinOn = checkinOn;
	}

}
