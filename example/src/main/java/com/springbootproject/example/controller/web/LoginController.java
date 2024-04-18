package com.springbootproject.example.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping ("/account")
public class LoginController {
	
	@GetMapping ("/login")
	public ModelAndView homePage() {
		ModelAndView mav = new ModelAndView("login/login");
		return mav;
	}
	
}