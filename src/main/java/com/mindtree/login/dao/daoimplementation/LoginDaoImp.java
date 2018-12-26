package com.mindtree.login.dao.daoimplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.mindtree.login.dao.LoginDao;
import com.mindtree.login.model.Login;

@Repository
public class LoginDaoImp implements LoginDao{

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	public String insertLogin(Login login) {
		
	      hibernateTemplate.save(login);
	      return"inserted";

		
	}

	public Login retrieveLogin(String username) {
		return hibernateTemplate.get(Login.class, username);
	}
	
}
