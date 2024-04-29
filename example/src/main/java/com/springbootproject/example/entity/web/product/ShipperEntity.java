package com.springbootproject.example.entity.web.product;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "shipper")
public class ShipperEntity {

	@Id
	@Column(name = "shipper_id")
	private String shiperId;

	@Column(name = "company_name")
	private String companyName;

	@Column(name = "phone")
	private String phone;

	public ShipperEntity() {

	}

	public ShipperEntity(String shiperId, String companyName, String phone) {
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
