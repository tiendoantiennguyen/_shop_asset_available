package com.springbootproject.example.model.admin.product;

import org.hibernate.validator.constraints.Length;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.NotEmpty;

public class CategoryModel {
	private Long categoryId;
	private String categoryCode;
	@NotEmpty
	@Length(min=5)
	private String categoryName;
	private String images;
	private MultipartFile imageFile;
	private String description;
	private Boolean active;
	private Boolean isEdit = false;

	public CategoryModel() {

	}

	public CategoryModel(Long categoryId, String categoryCode, String categoryName, String images, MultipartFile imageFile,
			String description, Boolean active, Boolean isEdit) {
		this.categoryId = categoryId;
		this.categoryCode = categoryCode;
		this.categoryName = categoryName;
		this.images = images;
		this.imageFile = imageFile;
		this.description = description;
		this.active = active;
		this.isEdit = isEdit;
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

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public MultipartFile getImageFile() {
		return imageFile;
	}

	public void setImageFile(MultipartFile imageFile) {
		this.imageFile = imageFile;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Boolean getIsEdit() {
		return isEdit;
	}

	public void setIsEdit(Boolean isEdit) {
		this.isEdit = isEdit;
	}

}
