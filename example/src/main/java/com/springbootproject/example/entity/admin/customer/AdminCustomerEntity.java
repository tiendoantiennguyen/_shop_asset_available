package com.springbootproject.example.entity.admin.customer;

import java.util.Date;
import java.util.Set;

import com.springbootproject.example.entity.admin.product.AdminOrderEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "a_customer")
public class AdminCustomerEntity {

	@Id
	@Column(name = "customer_id")
	private String customerId;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "class_id")
	private String classId;

	@Column(name = "room")
	private String room;

	@Column(name = "building")
	private String building;

	@Column(name = "address1")
	private String address1;

	@Column(name = "address2")
	private String address2;

	@Column(name = "city")
	private String city;

	@Column(name = "state")
	private String state;

	@Column(name = "postal_code")
	private Long postalCode;

	@Column(name = "country")
	private String country;

	@Column(name = "phone")
	private String phone;

	@Column(name = "email")
	private String email;

	@Column(name = "voice_mail")
	private String voiceMail;

	@Column(name = "password")
	private String password;

	@Column(name = "credit_card")
	private String creditCard;

	@Column(name = "credit_card_type_id")
	private String creditCardTypeId;

	@Column(name = "card_exp_mo")
	private String cardExpMo;

	@Column(name = "card_expired_year")
	private String cardExpiredYear;

	@Column(name = "billing_address")
	private String billingAddress;

	@Column(name = "billing_city")
	private String billingCity;

	@Column(name = "billing_region")
	private String billingRegion;

	@Column(name = "billing_postal_code")
	private String billingPostalCode;

	@Column(name = "billing_country")
	private String billingCountry;

	@Column(name = "ship_address")
	private String shipAddress;

	@Column(name = "ship_city")
	private String shipCity;

	@Column(name = "ship_region")
	private String shipRegion;

	@Column(name = "ship_postal_code")
	private String shipPostalCode;

	@Column(name = "ship_country")
	private String shipCountry;

	@Column(name = "date_entry")
	private Date dateEntry;


	@OneToMany(mappedBy = "adorders_adcustomer", cascade = CascadeType.ALL)
	private Set<AdminOrderEntity> orders;
	

	public AdminCustomerEntity() {

	}


	public AdminCustomerEntity(String customerId, String firstName, String lastName, String classId, String room,
			String building, String address1, String address2, String city, String state, Long postalCode,
			String country, String phone, String email, String voiceMail, String password, String creditCard,
			String creditCardTypeId, String cardExpMo, String cardExpiredYear, String billingAddress,
			String billingCity, String billingRegion, String billingPostalCode, String billingCountry,
			String shipAddress, String shipCity, String shipRegion, String shipPostalCode, String shipCountry,
			Date dateEntry, Set<AdminOrderEntity> orders) {
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.classId = classId;
		this.room = room;
		this.building = building;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.country = country;
		this.phone = phone;
		this.email = email;
		this.voiceMail = voiceMail;
		this.password = password;
		this.creditCard = creditCard;
		this.creditCardTypeId = creditCardTypeId;
		this.cardExpMo = cardExpMo;
		this.cardExpiredYear = cardExpiredYear;
		this.billingAddress = billingAddress;
		this.billingCity = billingCity;
		this.billingRegion = billingRegion;
		this.billingPostalCode = billingPostalCode;
		this.billingCountry = billingCountry;
		this.shipAddress = shipAddress;
		this.shipCity = shipCity;
		this.shipRegion = shipRegion;
		this.shipPostalCode = shipPostalCode;
		this.shipCountry = shipCountry;
		this.dateEntry = dateEntry;
		this.orders = orders;
	}


	public String getCustomerId() {
		return customerId;
	}


	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getClassId() {
		return classId;
	}


	public void setClassId(String classId) {
		this.classId = classId;
	}


	public String getRoom() {
		return room;
	}


	public void setRoom(String room) {
		this.room = room;
	}


	public String getBuilding() {
		return building;
	}


	public void setBuilding(String building) {
		this.building = building;
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


	public Long getPostalCode() {
		return postalCode;
	}


	public void setPostalCode(Long postalCode) {
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getVoiceMail() {
		return voiceMail;
	}


	public void setVoiceMail(String voiceMail) {
		this.voiceMail = voiceMail;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getCreditCard() {
		return creditCard;
	}


	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}


	public String getCreditCardTypeId() {
		return creditCardTypeId;
	}


	public void setCreditCardTypeId(String creditCardTypeId) {
		this.creditCardTypeId = creditCardTypeId;
	}


	public String getCardExpMo() {
		return cardExpMo;
	}


	public void setCardExpMo(String cardExpMo) {
		this.cardExpMo = cardExpMo;
	}


	public String getCardExpiredYear() {
		return cardExpiredYear;
	}


	public void setCardExpiredYear(String cardExpiredYear) {
		this.cardExpiredYear = cardExpiredYear;
	}


	public String getBillingAddress() {
		return billingAddress;
	}


	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}


	public String getBillingCity() {
		return billingCity;
	}


	public void setBillingCity(String billingCity) {
		this.billingCity = billingCity;
	}


	public String getBillingRegion() {
		return billingRegion;
	}


	public void setBillingRegion(String billingRegion) {
		this.billingRegion = billingRegion;
	}


	public String getBillingPostalCode() {
		return billingPostalCode;
	}


	public void setBillingPostalCode(String billingPostalCode) {
		this.billingPostalCode = billingPostalCode;
	}


	public String getBillingCountry() {
		return billingCountry;
	}


	public void setBillingCountry(String billingCountry) {
		this.billingCountry = billingCountry;
	}


	public String getShipAddress() {
		return shipAddress;
	}


	public void setShipAddress(String shipAddress) {
		this.shipAddress = shipAddress;
	}


	public String getShipCity() {
		return shipCity;
	}


	public void setShipCity(String shipCity) {
		this.shipCity = shipCity;
	}


	public String getShipRegion() {
		return shipRegion;
	}


	public void setShipRegion(String shipRegion) {
		this.shipRegion = shipRegion;
	}


	public String getShipPostalCode() {
		return shipPostalCode;
	}


	public void setShipPostalCode(String shipPostalCode) {
		this.shipPostalCode = shipPostalCode;
	}


	public String getShipCountry() {
		return shipCountry;
	}


	public void setShipCountry(String shipCountry) {
		this.shipCountry = shipCountry;
	}


	public Date getDateEntry() {
		return dateEntry;
	}


	public void setDateEntry(Date dateEntry) {
		this.dateEntry = dateEntry;
	}


	public Set<AdminOrderEntity> getOrders() {
		return orders;
	}


	public void setOrders(Set<AdminOrderEntity> orders) {
		this.orders = orders;
	}

}
