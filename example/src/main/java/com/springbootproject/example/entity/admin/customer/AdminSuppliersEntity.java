package com.springbootproject.example.entity.admin.customer;

import java.util.Set;

import com.springbootproject.example.entity.admin.product.AdminProductsEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "a_supplier")
public class AdminSuppliersEntity {

	@Id
	@Column(name = "supplier_id")
	private String supplierId;

	@Column(name = "company_name")
	private String companyName;

	@Column(name = "contact_first_name")
	private String contactFirstName;

	@Column(name = "contact_last_name")
	private String contactLastName;

	@Column(name = "contact_title")
	private String contactTitle;

	@Column(name = "address1")
	private String address1;

	@Column(name = "address2")
	private String address2;

	@Column(name = "city")
	private String city;

	@Column(name = "state")
	private String state;

	@Column(name = "postal_code")
	private String postalCode;

	@Column(name = "country")
	private String country;

	@Column(name = "phone")
	private String phone;

	@Column(name = "fax")
	private String fax;

	@Column(name = "email")
	private String email;

	@Column(name = "url")
	private String url;

	@Column(name = "payment_method")
	private String paymentMethod;

	@Column(name = "discount_type")
	private String discountType;

	@Column(name = "type_goods")
	private String typeGoods;

	@Column(name = "notes")
	private String notes;

	@Column(name = "discount_available")
	private String discountAvailable;

	@Column(name = "current_order")
	private String currentOrder;

	@Column(name = "logo")
	private String logo;

	@Column(name = "customer_id")
	private String customerId;

	@Column(name = "size_url")
	private String sizeUrl;

	@OneToMany(mappedBy = "suppliers_Products", cascade = CascadeType.ALL)
	private Set<AdminProductsEntity> products;

	public AdminSuppliersEntity() {

	}

	public AdminSuppliersEntity(String supplierId, String companyName, String contactFirstName, String contactLastName,
			String contactTitle, String address1, String address2, String city, String state, String postalCode,
			String country, String phone, String fax, String email, String url, String paymentMethod,
			String discountType, String typeGoods, String notes, String discountAvailable, String currentOrder,
			String logo, String customerId, String sizeUrl, Set<AdminProductsEntity> products) {
		this.supplierId = supplierId;
		this.companyName = companyName;
		this.contactFirstName = contactFirstName;
		this.contactLastName = contactLastName;
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
		this.products = products;
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

	public String getContactFirstName() {
		return contactFirstName;
	}

	public void setContactFirstName(String contactFirstName) {
		this.contactFirstName = contactFirstName;
	}

	public String getContactLastName() {
		return contactLastName;
	}

	public void setContactLastName(String contactLastName) {
		this.contactLastName = contactLastName;
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

	public Set<AdminProductsEntity> getProducts() {
		return products;
	}

	public void setProducts(Set<AdminProductsEntity> products) {
		this.products = products;
	}

}
