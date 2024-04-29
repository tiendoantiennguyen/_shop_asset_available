package com.springbootproject.example.service.web.user.userImpl;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootproject.example.entity.web.user.RoleEntity;
import com.springbootproject.example.repository.web.user.RoleRepository;
import com.springbootproject.example.service.web.user.IRoleService;

@Service
public class RoleImpl implements IRoleService {

	@Autowired
	
	private RoleRepository roleRepository;
	@Override
	public RoleEntity findRoleByName(String name) {
		
		return roleRepository.findRoleByName(name);
	}

}
