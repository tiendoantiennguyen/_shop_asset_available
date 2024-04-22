package com.springbootproject.example.controller.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.springbootproject.example.entity.web.UserEntity;
import com.springbootproject.example.service.web.UserInterface;

@RestController
@RequestMapping("/web/account")
public class UserRegisterController {

	@Autowired
	private UserInterface userInterface;
	
	@GetMapping ("/registerPage")
	public ModelAndView homePage(@ModelAttribute("user") UserEntity theUserEntity) {
		ModelAndView mav = new ModelAndView("login/register");
		mav.addObject("user", theUserEntity);
		return mav;
	}

	@PostMapping("/register")
	public String registerNewUser(@ModelAttribute("user") UserEntity theUserEntity) {
		userInterface.registerNewUser(theUserEntity);
	
	    return "redirect:/web/account/login"; 
	}
}
