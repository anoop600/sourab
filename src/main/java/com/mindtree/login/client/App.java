package com.mindtree.login.client;

import java.util.Scanner;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mindtree.login.Configuration.ConfigClass;
import com.mindtree.login.model.Login;
import com.mindtree.login.service.LoginService;


public class App {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
   	 ApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
   	 Login log=context.getBean(Login.class);
 	LoginService lser=context.getBean(LoginService.class);
 /*	log.setName("tam");
 	log.setPassword("tam123");
 	lser.insertLogin(log);*/
 	System.out.println("enter the username of the user whom you wanna retrieve");
 	String username=sc.next();
 	System.out.println(lser.retrieveLogin(username));
 	//System.out.println(l);

	}

}
