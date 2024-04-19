package com.springbootproject.example.service.web.userImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootproject.example.entity.web.RoleEntity;
import com.springbootproject.example.repository.web.RoleRepository;
import com.springbootproject.example.service.web.RoleInterface;

@Service
public class RoleImpl implements RoleInterface {

	@Autowired
	
	private RoleRepository roleRepository;
	@Override
	public RoleEntity findRoleByName(String name) {
		
		return roleRepository.findRoleByName(name);
	}

}
