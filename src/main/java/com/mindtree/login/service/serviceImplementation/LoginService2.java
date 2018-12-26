package com.mindtree.login.service.serviceImplementation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mindtree.login.Configuration.ConfigClass;
import com.mindtree.login.model.Login;
import com.mindtree.login.service.LoginService;


public class LoginService2 {

	
	
		public boolean validateLogin(String name,String pass){
			
	
	//validatehttp(request, response);
	ApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
  	 Login log=context.getBean(Login.class);
 	LoginService lser=context.getBean(LoginService.class);
	LoginService2 v=new LoginService2();
	log=lser.retrieveLogin(name);
	String namew=log.getName();
	String passw=log.getPassword();
	if(name.equals(namew)&&pass.equals(passw))
		return true;
	else
		return false;	
}
}
