package com.springbootproject.example.controller.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import com.springbootproject.example.entity.web.UserEntity;
import com.springbootproject.example.service.web.UserInterface;


public class UserController {
	
	@Autowired
	private UserInterface userInterface;
	
	
	public UserEntity registerNewUser(@RequestBody UserEntity theUser) {
		
		
		return userInterface.registerNewUser(theUser);
		
	}

}
