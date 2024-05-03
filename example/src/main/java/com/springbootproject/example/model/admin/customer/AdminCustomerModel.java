package com.springbootproject.example.model.admin.customer;

import java.util.Date;

public class AdminCustomerModel {

	private String customerId;
	private String firstName;
	private String lastName;
	private String classId;
	private String room;
	private String building;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private Long postalCode;
	private String country;
	private String phone;
	private String email;
	private String voiceMail;
	private String password;
	private String creditCard;
	private String creditCardTypeId;
	private String cardExpMo;
	private String cardExpiredYear;
	private String billingAddress;
	private String billingCity;
	private String billingRegion;
	private String billingPostalCode;
	private String billingCountry;
	private String shipAddress;
	private String shipCity;
	private String shipRegion;
	private String shipPostalCode;
	private String shipCountry;
	private Date dateEntry;

	public AdminCustomerModel() {

	}

	public AdminCustomerModel(String customerId, String firstName, String lastName, String classId, String room,
			String building, String address1, String address2, String city, String state, Long postalCode,
			String country, String phone, String email, String voiceMail, String password, String creditCard,
			String creditCardTypeId, String cardExpMo, String cardExpiredYear, String billingAddress,
			String billingCity, String billingRegion, String billingPostalCode, String billingCountry,
			String shipAddress, String shipCity, String shipRegion, String shipPostalCode, String shipCountry,
			Date dateEntry) {
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

}
