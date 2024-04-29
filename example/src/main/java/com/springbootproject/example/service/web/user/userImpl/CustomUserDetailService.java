package com.springbootproject.example.service.web.user.userImpl;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springbootproject.example.entity.web.user.RoleEntity;
import com.springbootproject.example.entity.web.user.UserEntity;
import com.springbootproject.example.repository.web.user.UserRepository;

@Service
public class CustomUserDetailService implements UserDetailsService {
	
	private UserRepository userRepository;
	
	public CustomUserDetailService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserEntity user = userRepository.findByNameOrEmail(username, username);
		
		if(user == null) {
			throw new UsernameNotFoundException("User could not found with username or mail: " + username);
		}
				/*.orElseThrow(() ->new UsernameNotFoundException("User could not found with username or mail: " + username));*/ 
		return new User(user.getEmail(), user.getPassword(), mapRoAuthorities(user.getRoles()));
	}
	
	private Collection<? extends GrantedAuthority> mapRoAuthorities(Set<RoleEntity> roles){
		return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
	}

}
