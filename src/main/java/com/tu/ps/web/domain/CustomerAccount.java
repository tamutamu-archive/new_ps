package com.mf.web.domain;

import java.util.Date;

import org.hibernate.validator.constraints.NotEmpty;

public class CustomerAccount {

	private String id;
	@NotEmpty(message = "login.error.username")
	private String name;
	private Date birthday;

	@NotEmpty(message = "login.error.password")
	private String password;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
