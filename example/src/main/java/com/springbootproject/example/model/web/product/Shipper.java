package com.springbootproject.example.model.web.product;

public class Shipper {
	
	private String shiperId;
	private String companyName;
	private String phone;
	
	public Shipper() {
		
	}

	public Shipper(String shiperId, String companyName, String phone) {
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
