package com.springbootproject.example.entity.web.product;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "category")
public class CategoryEntity {
	
	@Id
	@Column (name = "category_id")
	private String categoryId;
	
	@Column (name = "category_name")
	private String categotyName;
	
	@Column (name = "description")
	private String description;
	
	@Column (name = "active")
	private String active;
	
	public CategoryEntity() {
		
	}

	public CategoryEntity(String categoryId, String categotyName, String description, String active) {
		this.categoryId = categoryId;
		this.categotyName = categotyName;
		this.description = description;
		this.active = active;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategotyName() {
		return categotyName;
	}

	public void setCategotyName(String categotyName) {
		this.categotyName = categotyName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

}
