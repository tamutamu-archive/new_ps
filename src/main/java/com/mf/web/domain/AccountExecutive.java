package com.mf.web.domain;

import java.math.BigDecimal;
import java.sql.Date;

public class AccountExecutive {
	private String space;
    private String ae;
    private String showName;
    private String name;
    private String manager;
    private String manager_show;
    private String password;
    private Date expiryDate;
    private String hkid;
    private String salesCode;
    private String addr;
    private String tel1;
    private String tel2;
    private Date joinDate;
    private Date birthday;
    private String sex;
    private String role;
    private int perm1;
    private int perm2;
    private String hierarchy;
    private BigDecimal overrideAmount;
    private BigDecimal overridePercentage;
    private byte allowOverride;
    private int userStatus;
    private String roleGroup;
    private byte allowManualHedge;
	public String getSpace() {
		return space;
	}
	public void setSpace(String space) {
		this.space = space;
	}
	public String getAe() {
		return ae;
	}
	public void setAe(String ae) {
		this.ae = ae;
	}
	public String getShowName() {
		return showName;
	}
	public void setShowName(String showName) {
		this.showName = showName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public String getManager_show() {
		return manager_show;
	}
	public void setManager_show(String manager_show) {
		this.manager_show = manager_show;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getHkid() {
		return hkid;
	}
	public void setHkid(String hkid) {
		this.hkid = hkid;
	}
	public String getSalesCode() {
		return salesCode;
	}
	public void setSalesCode(String salesCode) {
		this.salesCode = salesCode;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getTel1() {
		return tel1;
	}
	public void setTel1(String tel1) {
		this.tel1 = tel1;
	}
	public String getTel2() {
		return tel2;
	}
	public void setTel2(String tel2) {
		this.tel2 = tel2;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getPerm1() {
		return perm1;
	}
	public void setPerm1(int perm1) {
		this.perm1 = perm1;
	}
	public int getPerm2() {
		return perm2;
	}
	public void setPerm2(int perm2) {
		this.perm2 = perm2;
	}
	public String getHierarchy() {
		return hierarchy;
	}
	public void setHierarchy(String hierarchy) {
		this.hierarchy = hierarchy;
	}
	public BigDecimal getOverrideAmount() {
		return overrideAmount;
	}
	public void setOverrideAmount(BigDecimal overrideAmount) {
		this.overrideAmount = overrideAmount;
	}
	public BigDecimal getOverridePercentage() {
		return overridePercentage;
	}
	public void setOverridePercentage(BigDecimal overridePercentage) {
		this.overridePercentage = overridePercentage;
	}
	public byte getAllowOverride() {
		return allowOverride;
	}
	public void setAllowOverride(byte allowOverride) {
		this.allowOverride = allowOverride;
	}
	public int getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(int userStatus) {
		this.userStatus = userStatus;
	}
	public String getRoleGroup() {
		return roleGroup;
	}
	public void setRoleGroup(String roleGroup) {
		this.roleGroup = roleGroup;
	}
	public byte getAllowManualHedge() {
		return allowManualHedge;
	}
	public void setAllowManualHedge(byte allowManualHedge) {
		this.allowManualHedge = allowManualHedge;
	}

}
