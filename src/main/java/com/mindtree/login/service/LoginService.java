package com.mindtree.login.service;

import com.mindtree.login.model.Login;

public interface LoginService {
/*	public boolean validateLogin(String name,String pass){
		if(name.equals("abc")&&pass.equals("123"))
			return true;
		else
			return false;	
	}*/
	
	String insertLogin(Login login);
	Login retrieveLogin(String username);

}
