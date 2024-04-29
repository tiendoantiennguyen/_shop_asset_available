package com.springbootproject.example.controller.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import com.springbootproject.example.entity.web.user.UserEntity;
import com.springbootproject.example.service.web.user.IUserService;


public class UserController {
	
	@Autowired
	private IUserService userInterface;
	
	
	public UserEntity registerNewUser(@RequestBody UserEntity theUser) {
		
		
		return userInterface.registerNewUser(theUser);
		
	}

}
