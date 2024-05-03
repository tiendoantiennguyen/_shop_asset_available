package com.springbootproject.example.model.admin.customer;

public class AdminSupplierModel {
	private String supplierId;
	private String companyName;
	private String contactFName;
	private String contactLName;
	private String contactTitle;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String postalCode;
	private String country;
	private String phone;
	private String fax;
	private String email;
	private String url;
	private String paymentMethod;
	private String discountType;
	private String typeGoods;
	private String notes;
	private String discountAvailable;
	private String currentOrder;
	private String logo;
	private String customerId;
	private String sizeUrl;
	
	public AdminSupplierModel() {
		
	}

	public AdminSupplierModel(String supplierId, String companyName, String contactFName, String contactLName,
			String contactTitle, String address1, String address2, String city, String state, String postalCode,
			String country, String phone, String fax, String email, String url, String paymentMethod,
			String discountType, String typeGoods, String notes, String discountAvailable, String currentOrder,
			String logo, String customerId, String sizeUrl) {
		this.supplierId = supplierId;
		this.companyName = companyName;
		this.contactFName = contactFName;
		this.contactLName = contactLName;
		this.contactTitle = contactTitle;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.country = country;
		this.phone = phone;
		this.fax = fax;
		this.email = email;
		this.url = url;
		this.paymentMethod = paymentMethod;
		this.discountType = discountType;
		this.typeGoods = typeGoods;
		this.notes = notes;
		this.discountAvailable = discountAvailable;
		this.currentOrder = currentOrder;
		this.logo = logo;
		this.customerId = customerId;
		this.sizeUrl = sizeUrl;
	}

	public String getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getContactFName() {
		return contactFName;
	}

	public void setContactFName(String contactFName) {
		this.contactFName = contactFName;
	}

	public String getContactLName() {
		return contactLName;
	}

	public void setContactLName(String contactLName) {
		this.contactLName = contactLName;
	}

	public String getContactTitle() {
		return contactTitle;
	}

	public void setContactTitle(String contactTitle) {
		this.contactTitle = contactTitle;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getDiscountType() {
		return discountType;
	}

	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}

	public String getTypeGoods() {
		return typeGoods;
	}

	public void setTypeGoods(String typeGoods) {
		this.typeGoods = typeGoods;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
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

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getSizeUrl() {
		return sizeUrl;
	}

	public void setSizeUrl(String sizeUrl) {
		this.sizeUrl = sizeUrl;
	}

}
