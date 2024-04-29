package com.springbootproject.example.service.web.user.userImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.springbootproject.example.entity.web.user.RoleEntity;
import com.springbootproject.example.entity.web.user.UserEntity;
import com.springbootproject.example.repository.web.user.RoleRepository;
import com.springbootproject.example.repository.web.user.UserRepository;
import com.springbootproject.example.service.web.user.IUserService;

@Service
public class UserImpl implements IUserService {

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
	public UserEntity findByName(String name) {
		return userRepository.findByName(name);
	}


	@Override
	public UserEntity registerNewUser(UserEntity theUser) {

		UserEntity user = new UserEntity();
		user.setName(theUser.getName());
		user.setEmail(theUser.getEmail());
		user.setPassword(passwordEncoder.encode(theUser.getPassword()));
		user.setActive(true);
		RoleEntity role = roleRepository.findRoleByName("USER");

		if (role == null) {
			role = checkRoleExist();
		}
		user.addRole(role);

		return userRepository.save(user);

	}

	private RoleEntity checkRoleExist() {
		RoleEntity role = new RoleEntity();
		role.setName("USER");
		return roleRepository.save(role);
	}
	

}
