package com.springbootproject.example.repository.web;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootproject.example.entity.web.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
