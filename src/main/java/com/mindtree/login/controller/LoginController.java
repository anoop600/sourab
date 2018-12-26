package com.mindtree.login.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mindtree.login.Configuration.ConfigClass;
import com.mindtree.login.model.Login;
import com.mindtree.login.service.LoginService;
import com.mindtree.login.service.serviceImplementation.LoginService2;

@Controller
public class LoginController {
	
	@RequestMapping("/login")
	public ModelAndView validate(HttpServletRequest request,HttpServletResponse response)
	{
		/*ApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
	   	 Login log=context.getBean(Login.class);
	  	LoginService lser=context.getBean(LoginService.class);
		LoginService2 v=new LoginService2();
		ModelAndView mv= new ModelAndView();
		String name=request.getParameter("username");
		String pass=request.getParameter("password");
		log.setName(name);
	 	log.setPassword(pass);
	 	lser.insertLogin(log);*/
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
	   //	 Login log=context.getBean(Login.class);
	  	LoginService lser=context.getBean(LoginService.class);
		LoginService2 v=new LoginService2();
		ModelAndView mv= new ModelAndView();
		/*log=lser.retrieveLogin(request.getParameter("username"));
		String name=log.getName();
		String pass=log.getPassword();
		*/
		String name= request.getParameter("username");
		String pass= request.getParameter("password");
		if(v.validateLogin(name, pass))
			mv.setViewName("success");
		else
			mv.setViewName("fail");
		return mv;
	}
	
	@RequestMapping("/signup")
	public ModelAndView signups(HttpServletRequest request,HttpServletResponse response) {
/*		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
	   	 Login log=context.getBean(Login.class);
	  	LoginService lser=context.getBean(LoginService.class);
		ModelAndView mv= new ModelAndView();
		String name=request.getParameter("username");
		String pass=request.getParameter("password");
		log.setName(name);
	 	log.setPassword(pass);
	 	lser.insertLogin(log);*/
	ModelAndView mv= new ModelAndView();
		
		mv.setViewName("signup");

		return mv;
	}
	
	@RequestMapping("/sign")
	public ModelAndView sign(HttpServletRequest request, HttpServletResponse response) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
	   	 Login log=context.getBean(Login.class);
	  	LoginService lser=context.getBean(LoginService.class);
		ModelAndView mv= new ModelAndView();
		String name=request.getParameter("username");
		String pass=request.getParameter("password");
		log.setName(name);
	 	log.setPassword(pass);
	 	lser.insertLogin(log);
		mv.setViewName("success");
	 	return mv;
	}
	
	
	
	
	
	
	
	
	
}
