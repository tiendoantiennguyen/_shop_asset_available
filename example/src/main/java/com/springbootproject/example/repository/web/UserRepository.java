package com.springbootproject.example.repository.web;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.springbootproject.example.entity.web.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
	
	@Query("select u from UserEntity u where u.name =:name")
	public UserEntity getUserbyUsername (@Param("name") String name);
	
	public UserEntity findByEmail(String email);
	public UserEntity findByName(String name);
	public UserEntity findByNameOrEmail(String emalOrname ,String emalOrname1);
	
	
//	  Boolean existByEmail(String email); 
//	  Boolean existsByName(String name);
		 


}
