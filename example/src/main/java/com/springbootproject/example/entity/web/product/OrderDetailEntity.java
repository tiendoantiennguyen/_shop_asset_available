package com.springbootproject.example.entity.web.product;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Order_detail")
public class OrderDetailEntity {
	
	@Id
	@Column (name = "order_id")
	private String orderId;
	
	@Column (name = "product_id")
	private String productID;
	
	@Column (name = "order_number")
	private String orderNumber;
	
	@Column (name = "price")
	private Long price;
	
	@Column (name = "quantity")
	private Integer quantity;
	
	@Column (name = "discount")
	private String discount;
	
	@Column (name = "total")
	private Long total;
	
	@Column (name = "idsku")
	private String IDSKU;
	
	@Column (name = "size")
	private String size;
	
	@Column (name = "color")
	private String color;
	
	@Column (name = "fulfilled")
	private String fulfilled;
	
	@Column (name = "shipDate")
	private String shipDate;
	
	@Column (name = "orderDetailId")
	private String orderDetailId;
	
	@Column (name = "BillDate")
	private String BillDate;
	
	public OrderDetailEntity() {
		
	}

	public OrderDetailEntity(String orderId, String productID, String orderNumber, Long price, Integer quantity,
			String discount, Long total, String iDSKU, String size, String color, String fulfilled, String shipDate,
			String orderDetailId, String billDate) {
		this.orderId = orderId;
		this.productID = productID;
		this.orderNumber = orderNumber;
		this.price = price;
		this.quantity = quantity;
		this.discount = discount;
		this.total = total;
		IDSKU = iDSKU;
		this.size = size;
		this.color = color;
		this.fulfilled = fulfilled;
		this.shipDate = shipDate;
		this.orderDetailId = orderDetailId;
		BillDate = billDate;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public String getIDSKU() {
		return IDSKU;
	}

	public void setIDSKU(String iDSKU) {
		IDSKU = iDSKU;
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

	public String getFulfilled() {
		return fulfilled;
	}

	public void setFulfilled(String fulfilled) {
		this.fulfilled = fulfilled;
	}

	public String getShipDate() {
		return shipDate;
	}

	public void setShipDate(String shipDate) {
		this.shipDate = shipDate;
	}

	public String getOrderDetailId() {
		return orderDetailId;
	}

	public void setOrderDetailId(String orderDetailId) {
		this.orderDetailId = orderDetailId;
	}

	public String getBillDate() {
		return BillDate;
	}

	public void setBillDate(String billDate) {
		BillDate = billDate;
	}

}
