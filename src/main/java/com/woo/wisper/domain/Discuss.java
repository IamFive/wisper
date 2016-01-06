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
 * @author Woo Cupid
 * @date 2014年10月23日
 * @version $Revision$
 */
public class Discuss extends Domain implements Serializable {

	private static final long serialVersionUID = -7182667989234579122L;

	private String topic;

	@NotEmpty
	private String content;
	private String attachments;

	private Long courseId;
	private Long semesterId;

	@NotNull
	private Long createBy;

	private Long owner;

	private Boolean isTopic = false;

	private Long replyTo;
	private Long topicId; // 所属Topic

	private Integer replyNum;

	private Date submitOn = new Date();

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAttachments() {
		return attachments;
	}

	public void setAttachments(String attachments) {
		this.attachments = attachments;
	}

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public Long getSemesterId() {
		return semesterId;
	}

	public void setSemesterId(Long semesterId) {
		this.semesterId = semesterId;
	}

	public Long getCreateBy() {
		return createBy;
	}

	public void setCreateBy(Long createBy) {
		this.createBy = createBy;
	}

	public Long getOwner() {
		return owner;
	}

	public void setOwner(Long owner) {
		this.owner = owner;
	}

	public Boolean getIsTopic() {
		return isTopic;
	}

	public void setIsTopic(Boolean isTopic) {
		this.isTopic = isTopic;
	}

	public Long getReplyTo() {
		return replyTo;
	}

	public void setReplyTo(Long replyTo) {
		this.replyTo = replyTo;
	}

	public Long getTopicId() {
		return topicId;
	}

	public void setTopicId(Long topicId) {
		this.topicId = topicId;
	}

	public Integer getReplyNum() {
		return replyNum;
	}

	public void setReplyNum(Integer replyNum) {
		this.replyNum = replyNum;
	}

	public Date getSubmitOn() {
		return submitOn;
	}

	public void setSubmitOn(Date submitOn) {
		this.submitOn = submitOn;
	}

}
