package com.mindtree.login.service.serviceImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mindtree.login.dao.LoginDao;
import com.mindtree.login.model.Login;
import com.mindtree.login.service.LoginService;

@Service
public class LoginServiceImp implements LoginService{
	
	@Autowired
	private LoginDao ldao;

	@Transactional
	public String insertLogin(Login login) {
		return ldao.insertLogin(login);
	}

	public Login retrieveLogin(String username) {
		return ldao.retrieveLogin(username);
	}

	


}
