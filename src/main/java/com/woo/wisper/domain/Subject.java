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
public class Subject extends Domain implements Serializable {

	private static final long serialVersionUID = 4417127257713321767L;

	private String name;
	private Integer degree;
	private Integer years;
	private Integer requiredCredit;
	private String trainPlan;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getDegree() {
		return degree;
	}

	public void setDegree(Integer degree) {
		this.degree = degree;
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

	public String getTrainPlan() {
		return trainPlan;
	}

	public void setTrainPlan(String trainPlan) {
		this.trainPlan = trainPlan;
	}

}
