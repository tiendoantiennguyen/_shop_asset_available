package com.springbootproject.example.entity.web.user;

import java.util.HashSet;
import java.util.Set;

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
	@Column(name = "name",length = 60, columnDefinition = "nvarchar(50) not null")
	private String name;
	@Column (name = "email")
	private String email;
	@Column (name = "password")
	private String password;
	@Column (name = "active")
	private boolean active;
	
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName="user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName="role_id")
            )
    private Set<RoleEntity> roles = new HashSet<>();

	
	public UserEntity () {
		
	}

	public UserEntity(Long id, String name, String email, String password, boolean active, Set<RoleEntity> roles) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.active = active;
		this.roles = roles;
	}
	
	public void addRole(RoleEntity role) {
		this.roles.add(role);
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


	public boolean isActive() {
		return active;
	}


	public void setActive(boolean active) {
		this.active = active;
	}


	public Set<RoleEntity> getRoles() {
		return roles;
	}


	public void setRoles(Set<RoleEntity> roles) {
		this.roles = roles;
	}
	
}
