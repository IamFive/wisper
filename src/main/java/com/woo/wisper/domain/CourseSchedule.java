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
 * 
 * @author Woo Cupid
 * @date 2014年10月28日
 * @version $Revision$
 */
public class CourseSchedule extends Domain implements Serializable {

	private static final long serialVersionUID = -7182667989234579122L;

	private Integer semesterCourseId;
	private Integer semesterId;
	private Integer courseId;

	private Integer days;
	private String classes;

	private Boolean forOdd;
	private Boolean forEven;
	private Integer startWeek;
	private Integer endWeek;
	private String place;

	private Boolean checkin = false;

	public Integer getSemesterCourseId() {
		return semesterCourseId;
	}

	public void setSemesterCourseId(Integer semesterCourseId) {
		this.semesterCourseId = semesterCourseId;
	}

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

	public Integer getDays() {
		return days;
	}

	public void setDays(Integer days) {
		this.days = days;
	}

	public String getClasses() {
		return classes;
	}

	public void setClasses(String classes) {
		this.classes = classes;
	}

	public Boolean getForOdd() {
		return forOdd;
	}

	public void setForOdd(Boolean forOdd) {
		this.forOdd = forOdd;
	}

	public Boolean getForEven() {
		return forEven;
	}

	public void setForEven(Boolean forEven) {
		this.forEven = forEven;
	}

	public Integer getStartWeek() {
		return startWeek;
	}

	public void setStartWeek(Integer startWeek) {
		this.startWeek = startWeek;
	}

	public Integer getEndWeek() {
		return endWeek;
	}

	public void setEndWeek(Integer endWeek) {
		this.endWeek = endWeek;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public Boolean getCheckin() {
		return checkin;
	}

	public void setCheckin(Boolean checkin) {
		this.checkin = checkin;
	}

}
