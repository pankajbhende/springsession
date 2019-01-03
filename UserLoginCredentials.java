package com.manoj.training.spring.springsessiondemo.controller;
/**
 *
 */

import java.io.Serializable;

/****************************************************************
 *
 * Header File: UserLoginCredentials
 *
 * Description: Contains Username and password
 *
 *
 *
 *
 *
 * Copyright (c) Skillsalpha, 2016
 *
 *
 *
 * This unpublished material is proprietary to Skillsalpha.
 *
 * All rights reserved. The methods and
 *
 * techniques described herein are considered trade secrets
 *
 * and/or confidential. Reproduction or distribution, in whole
 *
 * or in part, is forbidden except by express written permission
 *
 * of Skillsalpha.
 *
 ****************************************************************/

public class UserLoginCredentials implements Serializable{
	private String userName;
	private String password;
	private String subDomainName;
	private String deviceId;
	private String federatedToken;
	private String reloginToken;

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the subDomainName
	 */
	public String getSubDomainName() {
		return subDomainName;
	}

	/**
	 * @param subDomainName
	 *            the subDomainName to set
	 */
	public void setSubDomainName(String subDomainName) {
		this.subDomainName = subDomainName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserLoginCredentials [userName=" + userName + ", password=" + password + ", subDomainName="
				+ subDomainName + "]";
	}

	/**
	 * @return the deviceId
	 */
	public String getDeviceId() {
		return deviceId;
	}

	/**
	 * @param deviceId
	 *            the deviceId to set
	 */
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	/**
	 * @return the federatedToken
	 */
	public String getFederatedToken() {
		return federatedToken;
	}

	/**
	 * @param federatedToken
	 *            the federatedToken to set
	 */
	public void setFederatedToken(String federatedToken) {
		this.federatedToken = federatedToken;
	}

	/**
	 * @return the reloginToken
	 */
	public String getReloginToken() {
		return reloginToken;
	}

	/**
	 * @param reloginToken
	 *            the reloginToken to set
	 */
	public void setReloginToken(String reloginToken) {
		this.reloginToken = reloginToken;
	}

}
