package com.springbootproject.example.service.web.user;

import com.springbootproject.example.entity.web.user.RoleEntity;

public interface IRoleService  {
	
	public RoleEntity findRoleByName (String name);

}
