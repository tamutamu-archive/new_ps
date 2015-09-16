package com.mf.web.dao;

import java.util.Collection;

import com.mf.web.domain.CustomerAccount;

public interface SecurityDAO extends GenericDao<Object, Integer> {

	public Collection login(CustomerAccount customerAccount);
}
