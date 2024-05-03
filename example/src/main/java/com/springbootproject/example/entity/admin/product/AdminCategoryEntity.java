package com.springbootproject.example.entity.admin.product;

import java.io.Serializable;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "a_category")
public class AdminCategoryEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "category_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long categoryId;

	@Column(name = "category_code")
	private String categoryCode;

	@Column(name = "category_name")
	private String categoryName;

	@Column(name = "description")
	private String description;

	@Column(name = "images")
	private String images;

	@Column(name = "active")
	private Boolean active;

	// tao ket noi 1 to many vs product
	@OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
	private Set<AdminProductsEntity> products;

	public AdminCategoryEntity() {

	}

	public AdminCategoryEntity(Long categoryId, String categoryCode, String categoryName, String description, String images,
			 Boolean active, Set<AdminProductsEntity> products) {
		this.categoryId = categoryId;
		this.categoryCode = categoryCode;
		this.categoryName = categoryName;
		this.description = description;
		this.images = images;
		this.active = active;
		this.products = products;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getCategotyName() {
		return categoryName;
	}

	public void setCategotyName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Set<AdminProductsEntity> getProducts() {
		return products;
	}

	public void setProducts(Set<AdminProductsEntity> products) {
		this.products = products;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
