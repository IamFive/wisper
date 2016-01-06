package com.woo.wisper.domain;

import java.io.Serializable;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "public.member")
public class Member extends Domain implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7585351518141988002L;

	private String name;

	private String registIp;

	private Boolean isAdmin;
	
	private Map<String, Object> profile;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the registIp
	 */
	public String getRegistIp() {
		return registIp;
	}

	/**
	 * @param registIp the registIp to set
	 */
	public void setRegistIp(String registIp) {
		this.registIp = registIp;
	}

	/**
	 * @return the isAdmin
	 */
	public Boolean getIsAdmin() {
		return isAdmin;
	}

	/**
	 * @param isAdmin the isAdmin to set
	 */
	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	/**
	 * @return the profile
	 */
	public Map<String, Object> getProfile() {
		return profile;
	}

	/**
	 * @param profile the profile to set
	 */
	public void setProfile(Map<String, Object> profile) {
		this.profile = profile;
	}

	
	
}
