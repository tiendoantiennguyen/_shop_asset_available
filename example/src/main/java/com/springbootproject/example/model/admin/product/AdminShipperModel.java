package com.springbootproject.example.model.admin.product;

public class AdminShipperModel {
	
	private String shiperId;
	private String companyName;
	private String phone;
	
	public AdminShipperModel() {
		
	}

	public AdminShipperModel(String shiperId, String companyName, String phone) {
		this.shiperId = shiperId;
		this.companyName = companyName;
		this.phone = phone;
	}

	public String getShiperId() {
		return shiperId;
	}

	public void setShiperId(String shiperId) {
		this.shiperId = shiperId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
