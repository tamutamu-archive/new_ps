package com.mf.web.dao;

import java.util.Collection;
import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mf.web.domain.CustomerAccount;

@Repository
public class SecurityDAOImpl extends GenericDaoImpl<Object, Integer> implements SecurityDAO {

	@Override
	@Transactional
	public Collection login(CustomerAccount customerAccount) {
		// TODO Auto-generated method stub
		Query query = currentSession().createSQLQuery(
				"EXEC fx_check_login :UserType, :LoginId, :Password")
				.setInteger("UserType", 2)
				.setString("LoginId", customerAccount.getName())
				.setString("Password", customerAccount.getPassword());
		List result = query.list();
		/*System.out.println("length1: " + query.getReturnAliases().length);
		System.out.println("length2: " + query.getReturnTypes().length);
		System.out.println("length3: " + query.getNamedParameters().length);*/
		/*for(int i=0; i<result.size(); i++){
			ReturnResult returnResult = (ReturnResult)result.get(i);
			System.out.println(returnResult.getStatus());
		}*/

		return null;
	}

	@Override
	public void add(Object entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveOrUpdate(Object entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Object entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Object entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object find(Integer key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
