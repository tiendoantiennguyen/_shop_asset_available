package com.springbootproject.example.model.admin.product;

public class AdminOrderDetailModel {
	private String orderId;
	private String productID;
	private String orderNumber;
	private Long price;
	private Integer quantity;
	private String discount;
	private Long total;
	private String IDSKU;
	private String size;
	private String color;
	private String fulfilled;
	private String shipDate;
	private String orderDetailId;
	private String BillDate;
	
	public AdminOrderDetailModel() {
		
	}

	public AdminOrderDetailModel(String orderId, String productID, String orderNumber, Long price, Integer quantity,
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
