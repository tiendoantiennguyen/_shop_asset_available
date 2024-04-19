package com.springbootproject.example.entity.web;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table (name = "users")
public class UserEntity {
	
	@Id
	@Column(name= "user_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "name")
	private String name;
	@Column (name = "email")
	private String email;
	@Column (name = "password")
	private String password;
	@Column (name = "active")
	private Integer active;
	
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName="user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName="role_id")
            )
    private List<RoleEntity> roles = new ArrayList<>();

	
	public UserEntity () {
		
	}


	public UserEntity(Long id, String name, String email, String password, Integer active,
			List<RoleEntity> roles) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.active = active;
		this.roles = roles;
	}


	public Long getUser_id() {
		return id;
	}


	public void setUser_id(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Integer getActive() {
		return active;
	}


	public void setActive(Integer active) {
		this.active = active;
	}


	public List<RoleEntity> getRoles() {
		return roles;
	}


	public void setRoles(List<RoleEntity> roles) {
		this.roles = roles;
	}
		
}
