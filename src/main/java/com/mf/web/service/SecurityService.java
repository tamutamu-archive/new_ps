package com.mf.web.service;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.mf.web.domain.CustomerAccount;

public interface SecurityService extends GenericService<Object,Integer>{
	public Collection login(CustomerAccount customerAccount);
}
