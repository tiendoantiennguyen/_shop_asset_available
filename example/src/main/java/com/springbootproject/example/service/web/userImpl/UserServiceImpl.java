package com.springbootproject.example.service.web.userImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springbootproject.example.entity.web.UserEntity;
import com.springbootproject.example.repository.web.UserRepository;

@Service
public class UserServiceImpl implements UserDetailsService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserEntity user = userRepository.getUserbyUsername(username);
		if(user == null) {
			throw new UsernameNotFoundException("Could not find user");
			
		}
		return new MyUserService(user);
	}

}
