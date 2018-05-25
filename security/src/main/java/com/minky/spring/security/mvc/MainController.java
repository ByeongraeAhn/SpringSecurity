package com.minky.spring.security.mvc;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public ModelAndView visitHome() {
		return new ModelAndView("index");
	}
		
	@RequestMapping(value="/admin", method = RequestMethod.GET)
	public ModelAndView visitAdmin() {
		ModelAndView model = new ModelAndView("admin");
		model.addObject("title", "Admministrator Control Panel");
		model.addObject("message", "This page demonstrates how to use Spring security.");
		
		return model;
	}
	
	@RequestMapping(value="/user", method = RequestMethod.GET)
	public ModelAndView visitUser() {
		ModelAndView model = new ModelAndView("user");
		model.addObject("title", "Admministrator Control Panel");
		model.addObject("message", "This page demonstrates how to use Spring security.");
		
		return model;
	}
	
	@RequestMapping(value="/anonymous", method = RequestMethod.GET)
	public ModelAndView visitAny() {
		ModelAndView model = new ModelAndView("anonymous");
		model.addObject("title", "anonymous Control Panel");
		model.addObject("message", "This page demonstrates how to use Spring security.");
		
		return model;
	}
}
