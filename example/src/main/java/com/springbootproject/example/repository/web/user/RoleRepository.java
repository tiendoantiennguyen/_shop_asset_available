package com.springbootproject.example.repository.web.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.springbootproject.example.entity.web.user.RoleEntity;

@Repository
public interface RoleRepository extends JpaRepository<RoleEntity, Long> {
	public RoleEntity findRoleByName(String name);
	public RoleEntity getUserByName(@Param("name") String name);
	RoleEntity findByName(String name);	
}
