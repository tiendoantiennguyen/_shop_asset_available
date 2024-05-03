package com.springbootproject.example.entity.web.product;

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
@Table(name = "category")
public class CategoryEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "category_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long categoryId;

	@Column(name = "category_code")
	private String categoryCode;

	@Column(name = "category_name")
	private String categotyName;

	@Column(name = "description")
	private String description;

	@Column(name = "images")
	private String images;

	@Column(name = "active")
	private Boolean active;

	// tao ket noi 1 to many vs product
	@OneToMany(mappedBy = "categorys", cascade = CascadeType.ALL)
	private Set<ProductsEntity> products;

	public CategoryEntity() {

	}

	public CategoryEntity(Long categoryId, String categoryCode, String categotyName, String description, String images,
			 Boolean active, Set<ProductsEntity> products) {
		this.categoryId = categoryId;
		this.categoryCode = categoryCode;
		this.categotyName = categotyName;
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

	public Set<ProductsEntity> getProducts() {
		return products;
	}

	public void setProducts(Set<ProductsEntity> products) {
		this.products = products;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
