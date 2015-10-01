package com.mf.web.domain;

import java.util.Date;

public class UserAccount {

	private String userId;
	private String password;
	private String username;
	private String manager;
	private String idNo;
	private String salesCode;
	private String sex;
	private String telephone1;
	private String telephone2;
	private String email;
	private Date birthday;
	private Date joinDate;
	private Date expiryDate;
	private boolean neverExpire;
	private int status;
	private String userRole;
	private boolean allowOverride;
	private double overrideAmount;
	private boolean allowManualhedge;
	private boolean enabled;
	private String role;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getIdNo() {
		return idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public String getSalesCode() {
		return salesCode;
	}

	public void setSalesCode(String salesCode) {
		this.salesCode = salesCode;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getTelephone1() {
		return telephone1;
	}

	public void setTelephone1(String telephone1) {
		this.telephone1 = telephone1;
	}

	public String getTelephone2() {
		return telephone2;
	}

	public void setTelephone2(String telephone2) {
		this.telephone2 = telephone2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public boolean isNeverExpire() {
		return neverExpire;
	}

	public void setNeverExpire(boolean neverExpire) {
		this.neverExpire = neverExpire;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public boolean isAllowOverride() {
		return allowOverride;
	}

	public void setAllowOverride(boolean allowOverride) {
		this.allowOverride = allowOverride;
	}

	public double getOverrideAmount() {
		return overrideAmount;
	}

	public void setOverrideAmount(double overrideAmount) {
		this.overrideAmount = overrideAmount;
	}

	public boolean isAllowManualhedge() {
		return allowManualhedge;
	}

	public void setAllowManualhedge(boolean allowManualhedge) {
		this.allowManualhedge = allowManualhedge;
	}

}
