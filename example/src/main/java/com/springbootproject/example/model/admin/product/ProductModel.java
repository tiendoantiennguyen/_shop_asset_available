package com.springbootproject.example.model.admin.product;

import org.springframework.web.multipart.MultipartFile;

public class ProductModel {
	
	private String productId;
	private String SKU;
	private String IDSKU;
	private String vendorProductId;
	private String productName;
	private String productDescription;
	private String SupplierId;
	private Long categoryId;
	private Long quantityPerUnit;
	private Long unitPrice;
	private String MSRP;
	private String availableSize;
	private String availableColor;
	private String size;
	private String color;
	private String discount;
	private String unitWeight;
	private String unitsInStock;
	private String unitOnOrder;
	private String reOrderLevel;
	private String productAvailable;
	private String discountAvailable;
	private String currentOrder;
	private String images;
	private MultipartFile imageFile;
	private String ranking;
	private String note;
	private Boolean isEdit = false;
	
	public ProductModel() {
		
	}

	public ProductModel(String productId, String sKU, String iDSKU, String vendorProductId, String productName,
			String productDescription, String supplierId, Long categoryId, Long quantityPerUnit, Long unitPrice,
			String mSRP, String availableSize, String availableColor, String size, String color, String discount,
			String unitWeight, String unitsInStock, String unitOnOrder, String reOrderLevel, String productAvailable,
			String discountAvailable, String currentOrder, String images, MultipartFile imageFile, String ranking,
			String note, Boolean isEdit) {
		super();
		this.productId = productId;
		SKU = sKU;
		IDSKU = iDSKU;
		this.vendorProductId = vendorProductId;
		this.productName = productName;
		this.productDescription = productDescription;
		SupplierId = supplierId;
		this.categoryId = categoryId;
		this.quantityPerUnit = quantityPerUnit;
		this.unitPrice = unitPrice;
		MSRP = mSRP;
		this.availableSize = availableSize;
		this.availableColor = availableColor;
		this.size = size;
		this.color = color;
		this.discount = discount;
		this.unitWeight = unitWeight;
		this.unitsInStock = unitsInStock;
		this.unitOnOrder = unitOnOrder;
		this.reOrderLevel = reOrderLevel;
		this.productAvailable = productAvailable;
		this.discountAvailable = discountAvailable;
		this.currentOrder = currentOrder;
		this.images = images;
		this.imageFile = imageFile;
		this.ranking = ranking;
		this.note = note;
		this.isEdit = isEdit;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getSKU() {
		return SKU;
	}

	public void setSKU(String sKU) {
		SKU = sKU;
	}

	public String getIDSKU() {
		return IDSKU;
	}

	public void setIDSKU(String iDSKU) {
		IDSKU = iDSKU;
	}

	public String getVendorProductId() {
		return vendorProductId;
	}

	public void setVendorProductId(String vendorProductId) {
		this.vendorProductId = vendorProductId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getSupplierId() {
		return SupplierId;
	}

	public void setSupplierId(String supplierId) {
		SupplierId = supplierId;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public Long getQuantityPerUnit() {
		return quantityPerUnit;
	}

	public void setQuantityPerUnit(Long quantityPerUnit) {
		this.quantityPerUnit = quantityPerUnit;
	}

	public Long getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Long unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getMSRP() {
		return MSRP;
	}

	public void setMSRP(String mSRP) {
		MSRP = mSRP;
	}

	public String getAvailableSize() {
		return availableSize;
	}

	public void setAvailableSize(String availableSize) {
		this.availableSize = availableSize;
	}

	public String getAvailableColor() {
		return availableColor;
	}

	public void setAvailableColor(String availableColor) {
		this.availableColor = availableColor;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getUnitWeight() {
		return unitWeight;
	}

	public void setUnitWeight(String unitWeight) {
		this.unitWeight = unitWeight;
	}

	public String getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(String unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	public String getUnitOnOrder() {
		return unitOnOrder;
	}

	public void setUnitOnOrder(String unitOnOrder) {
		this.unitOnOrder = unitOnOrder;
	}

	public String getReOrderLevel() {
		return reOrderLevel;
	}

	public void setReOrderLevel(String reOrderLevel) {
		this.reOrderLevel = reOrderLevel;
	}

	public String getProductAvailable() {
		return productAvailable;
	}

	public void setProductAvailable(String productAvailable) {
		this.productAvailable = productAvailable;
	}

	public String getDiscountAvailable() {
		return discountAvailable;
	}

	public void setDiscountAvailable(String discountAvailable) {
		this.discountAvailable = discountAvailable;
	}

	public String getCurrentOrder() {
		return currentOrder;
	}

	public void setCurrentOrder(String currentOrder) {
		this.currentOrder = currentOrder;
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

	public String getRanking() {
		return ranking;
	}

	public void setRanking(String ranking) {
		this.ranking = ranking;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Boolean getIsEdit() {
		return isEdit;
	}

	public void setIsEdit(Boolean isEdit) {
		this.isEdit = isEdit;
	}

}
