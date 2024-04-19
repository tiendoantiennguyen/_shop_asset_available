package com.springbootproject.example.entity.web;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table (name="roles")
public class RoleEntity {
	
	@Id
	@Column(name= "role_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@ManyToMany(mappedBy="roles")
	private  List<UserEntity> user;
	
	public RoleEntity() {
		
	}

	public RoleEntity(Long id, String name, List<UserEntity> user) {
		this.id = id;
		this.name = name;
		this.user = user;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<UserEntity> getUser() {
		return user;
	}

	public void setUserDes(List<UserEntity> user) {
		this.user = user;
	}
	
}
