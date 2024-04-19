package com.springbootproject.example.repository.web;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootproject.example.entity.web.RoleEntity;

public interface RoleRepository extends JpaRepository<RoleEntity, Long> {
	public RoleEntity findRoleByName(String name);
}
