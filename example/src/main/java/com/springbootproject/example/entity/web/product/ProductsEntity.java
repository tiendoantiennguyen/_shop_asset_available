package com.springbootproject.example.entity.web.product;

import java.io.Serializable;
import java.util.Set;

import com.springbootproject.example.entity.admin.customer.AdminSuppliersEntity;
import com.springbootproject.example.entity.admin.product.AdminCategoryEntity;
import com.springbootproject.example.entity.admin.product.AdminOrderDetailEntity;
import com.springbootproject.example.entity.web.customer.SuppliersEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class ProductsEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "product_id")
	private String productId;

	@Column(name = "sku")
	private String SKU;

	@Column(name = "id_sku")
	private String IDSKU;

	@Column(name = "vendor_product_id")
	private String vendorProductId;

	@Column(name = "product_name")
	private String productName;

	@Column(name = "product_description")
	private String productDescription;

	@Column(name = "Supplier_id")
	private String SupplierId;

	@Column(name = "quantity_per_unit")
	private Long quantityPerUnit;

	@Column(name = "unit_price")
	private Long unitPrice;

	@Column(name = "msrp")
	private String MSRP;

	@Column(name = "available_size")
	private String availableSize;

	@Column(name = "available_color")
	private String availableColor;

	@Column(name = "size")
	private String size;

	@Column(name = "color")
	private String color;

	@Column(name = "discount")
	private String discount;

	@Column(name = "unit_weight")
	private String unitWeight;

	@Column(name = "units_in_stock")
	private String unitsInStock;

	@Column(name = "unit_on_order")
	private String unitOnOrder;

	@Column(name = "re_order_level")
	private String reOrderLevel;

	@Column(name = "product_available")
	private String productAvailable;

	@Column(name = "discount_available")
	private String discountAvailable;

	@Column(name = "current_order")
	private String currentOrder;

	@Column(name = "picture")
	private String picture;

	@Column(name = "ranking")
	private String ranking;

	@Column(name = "note")
	private String note;

	// Ket noi many to 1 vs categories.
	@ManyToOne
	@JoinColumn(name = "category_id")
	private CategoryEntity categorys;
	
	// Ket noi many to one vs supplier.
	@ManyToOne
	@JoinColumn(name = "supplier_id")
	private SuppliersEntity suppliers;

	// tao ket noi 1 to many vs product
	@OneToMany(mappedBy = "products", cascade = CascadeType.ALL)
	private Set<OrderDetailEntity> orderDetail;


	public ProductsEntity() {

	}


	public ProductsEntity(String productId, String sKU, String iDSKU, String vendorProductId, String productName,
			String productDescription, String supplierId, Long quantityPerUnit, Long unitPrice, String mSRP,
			String availableSize, String availableColor, String size, String color, String discount, String unitWeight,
			String unitsInStock, String unitOnOrder, String reOrderLevel, String productAvailable,
			String discountAvailable, String currentOrder, String picture, String ranking, String note,
			CategoryEntity categorys, SuppliersEntity suppliers, Set<OrderDetailEntity> orderDetail) {
		this.productId = productId;
		SKU = sKU;
		IDSKU = iDSKU;
		this.vendorProductId = vendorProductId;
		this.productName = productName;
		this.productDescription = productDescription;
		SupplierId = supplierId;
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
		this.picture = picture;
		this.ranking = ranking;
		this.note = note;
		this.categorys = categorys;
		this.suppliers = suppliers;
		this.orderDetail = orderDetail;
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


	public String getPicture() {
		return picture;
	}


	public void setPicture(String picture) {
		this.picture = picture;
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


	public CategoryEntity getCategorys() {
		return categorys;
	}


	public void setCategorys(CategoryEntity categorys) {
		this.categorys = categorys;
	}


	public SuppliersEntity getSuppliers() {
		return suppliers;
	}


	public void setSuppliers(SuppliersEntity suppliers) {
		this.suppliers = suppliers;
	}


	public Set<OrderDetailEntity> getOrderDetail() {
		return orderDetail;
	}


	public void setOrderDetail(Set<OrderDetailEntity> orderDetail) {
		this.orderDetail = orderDetail;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
