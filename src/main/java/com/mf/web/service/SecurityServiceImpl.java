package com.mf.web.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mf.web.dao.SecurityDAO;
import com.mf.web.domain.CustomerAccount;

@Service("securityService")
public class SecurityServiceImpl extends GenericServiceImpl<Object, Integer> implements SecurityService {

	@Autowired
	private SecurityDAO securityDAO;

	@Override
	public Collection login(CustomerAccount customerAccount) {
		return securityDAO.login(customerAccount);
	}
}
