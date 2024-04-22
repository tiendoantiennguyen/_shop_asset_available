package com.springbootproject.example.service.web.userImpl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.springbootproject.example.entity.web.RoleEntity;
import com.springbootproject.example.entity.web.UserEntity;
import com.springbootproject.example.repository.web.RoleRepository;
import com.springbootproject.example.repository.web.UserRepository;
import com.springbootproject.example.service.web.UserInterface;

@Service
public class UserImpl implements UserInterface {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	private RoleRepository roleRepository;

	public UserImpl(UserRepository userRepository, PasswordEncoder passwordEncoder) {
		this.userRepository = userRepository;
		this.passwordEncoder = passwordEncoder;
	}

	@Override
	public UserEntity registerNewUser(UserEntity theUser) {

		UserEntity user = new UserEntity();
		user.setName(theUser.getName());
		user.setEmail(theUser.getEmail());
		user.setPassword(passwordEncoder.encode(theUser.getPassword()));
		user.setActive(true);
		RoleEntity role = roleRepository.findRoleByName("USER");
		
		/*
		 * if (role == null) { role = checkRoleExist(); } user.setRoles(role.getName());
		 */
		return userRepository.save(user);

	}

	private RoleEntity checkRoleExist() {
		RoleEntity role = new RoleEntity();
		role.setName("USER");
		return roleRepository.save(role);
	}

}
