package com.springbootproject.example.model.web.product;

public class Category {
	private String categoryId;
	private String categotyName;
	private String description;
	private String active;
	
	public Category() {		
		
	}

	public Category(String categoryId, String categotyName, String description, String active) {
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
