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

import org.hibernate.validator.constraints.*;

/**
 * 
 * @author Woo Cupid
 * @date 2014年10月28日
 * @version $Revision$
 */
public class Feedback extends Domain implements Serializable {

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

	@NotEmpty
	private String place;

	@NotEmpty
	private String teacher;

	@NotNull
	private Date classTime;

	@NotEmpty
	private String num;

	@NotEmpty
	private String reason;

	private Date feedbackOn = new Date();

	private Integer status;

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

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public Date getClassTime() {
		return classTime;
	}

	public void setClassTime(Date classTime) {
		this.classTime = classTime;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Date getFeedbackOn() {
		return feedbackOn;
	}

	public void setFeedbackOn(Date feedbackOn) {
		this.feedbackOn = feedbackOn;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}
