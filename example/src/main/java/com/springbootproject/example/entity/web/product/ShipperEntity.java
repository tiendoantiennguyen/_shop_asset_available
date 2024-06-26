package com.springbootproject.example.entity.web.product;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "shipper")
public class ShipperEntity {

	@Id
	@Column(name = "shiperId")
	private String shiperId;

	@Column(name = "company_name")
	private String companyName;

	@Column(name = "phone")
	private String phone;
	
	//one to many table shipper to order
	@OneToMany(mappedBy = "shippers", cascade = CascadeType.ALL)
	private Set<OrderEntity> orders;
	
	public ShipperEntity() {

	}

	public ShipperEntity(String shiperId, String companyName, String phone, Set<OrderEntity> orders) {
		this.shiperId = shiperId;
		this.companyName = companyName;
		this.phone = phone;
		this.orders = orders;
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

	public Set<OrderEntity> getOrders() {
		return orders;
	}

	public void setOrders(Set<OrderEntity> orders) {
		this.orders = orders;
	}

}
