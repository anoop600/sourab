package com.mindtree.login.dao;

import com.mindtree.login.model.Login;

public interface LoginDao {
	
	String insertLogin(Login login);
	Login retrieveLogin(String username);

}
