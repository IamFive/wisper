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

/**
 * @author Woo Cupid
 * @date 2014年10月23日
 * @version $Revision$
 */
public class Course extends Domain implements Serializable {

	private static final long serialVersionUID = -7182667989234579122L;

	private String name;

	private Boolean isOptional;
	private Integer maxAllowed; // 最多允许参与人数
	private Integer hasJoined; // 已参与人数

	private Double credit;
	private Integer totalClasses;
	private Integer stars;
	private String teacher;

	private Double cost;
	private Date startTime;
	private Date endTime;
	private String serialNum;
	private String bio;

	private Integer status;

	private List<CourseSchedule> schedules = new ArrayList<CourseSchedule>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getIsOptional() {
		return isOptional;
	}

	public void setIsOptional(Boolean isOptional) {
		this.isOptional = isOptional;
	}

	public Integer getMaxAllowed() {
		return maxAllowed;
	}

	public void setMaxAllowed(Integer maxAllowed) {
		this.maxAllowed = maxAllowed;
	}

	public Integer getHasJoined() {
		return hasJoined;
	}

	public void setHasJoined(Integer hasJoined) {
		this.hasJoined = hasJoined;
	}

	public Double getCredit() {
		return credit;
	}

	public void setCredit(Double credit) {
		this.credit = credit;
	}

	public Integer getTotalClasses() {
		return totalClasses;
	}

	public void setTotalClasses(Integer totalClasses) {
		this.totalClasses = totalClasses;
	}

	public Integer getStars() {
		return stars;
	}

	public void setStars(Integer stars) {
		this.stars = stars;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public List<CourseSchedule> getSchedules() {
		return schedules;
	}

	public void setSchedules(List<CourseSchedule> schedules) {
		this.schedules = schedules;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}
