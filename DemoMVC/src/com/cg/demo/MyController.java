package com.cg.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class MyController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {

		////////////////////////////////////ACT AS SERVICE METHOD//////////////////////////////////////////////
		String message="Welcome to Spring MVC.";
		return new ModelAndView("Hello","message",message);       //Model,Model name,view
		////////////////////////////////////////////END////////////////////////////////////////////////////////
	}
	
	

}
