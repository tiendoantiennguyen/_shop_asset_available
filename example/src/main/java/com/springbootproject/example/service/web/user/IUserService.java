package com.springbootproject.example.service.web.user;

import com.springbootproject.example.entity.web.user.UserEntity;

public interface IUserService {
	
	public UserEntity registerNewUser (UserEntity user);

	UserEntity findByName(String name);

}
