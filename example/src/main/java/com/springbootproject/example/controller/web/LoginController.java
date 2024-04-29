package com.springbootproject.example.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springbootproject.example.entity.web.user.UserEntity;

@Controller
@RequestMapping ("/web/account")
public class LoginController {
	
	@GetMapping ("/login")
	public ModelAndView homePage(@ModelAttribute("user") UserEntity theUserEntity) {
		ModelAndView mav = new ModelAndView("login/login");
		mav.addObject("user", theUserEntity);
		return mav;
	}
	
	@PostMapping ("loginProcess")
	public UserEntity findUserByName (@ModelAttribute("user") UserEntity theUserEntity) {
		/*
		 * ModelAttribute pav = new Mo mav.addObject("user", theUserEntity);
		 */
		return null;
	}

}
