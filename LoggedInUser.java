package com.manoj.training.spring.springsessiondemo.controller;

import java.io.Serializable;
import java.util.List;

/***************************************************************
 * Header File: LoggedInUser.java Description: LoggedInUser stores logged in
 * user details
 * 
 *
 * Copyright (c) SkillsAlpha, 2016
 *
 * This unpublished material is proprietary to SkillsAlpha. All rights reserved.
 * The methods and techniques described herein are considered trade secrets
 * and/or confidential. Reproduction or distribution, in whole or in part, is
 * forbidden except by express written permission of SkillsAlpha.
 ****************************************************************/

public class LoggedInUser implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private String userName;
	private String firstName;
	private String lastName;
	private long userID;
	private String sessionId;
	private String locale;
	private List<String> systemRoleList;
	private String photoURL;
	private String domainName;
	private String email;

	public List<String> getSystemRoleList() {
		return systemRoleList;
	}

	public void setSystemRoleList(List<String> systemRoleList) {
		this.systemRoleList = systemRoleList;
	}

	/**
	 * @return the sessionId
	 */
	public String getSessionId() {
		return sessionId;
	}

	/**
	 * @param sessionId
	 *            the sessionId to set
	 */
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getUserID() {
		return userID;
	}

	public void setUserID(long userID) {
		this.userID = userID;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	/**
	 * @return the photoURL
	 */
	public String getPhotoURL() {
		return photoURL;
	}

	/**
	 * @param photoURL
	 *            the photoURL to set
	 */
	public void setPhotoURL(String photoURL) {
		this.photoURL = photoURL;
	}

	/**
	 * @return the domainName
	 */
	public String getDomainName() {
		return domainName;
	}

	/**
	 * @param domainName
	 *            the domainName to set
	 */
	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

}
