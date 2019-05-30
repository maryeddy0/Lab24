package com.jdbcdemo.JBDCDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JavaBeanController {
	
	
	@Autowired
	UserJdbcDao dao;
	
	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index");
	}
	
	
	
	
	@RequestMapping("reg")
	public ModelAndView link(@RequestParam ("register") String link) {
		return new ModelAndView("register");
	}
	
	
	
	
	
}
