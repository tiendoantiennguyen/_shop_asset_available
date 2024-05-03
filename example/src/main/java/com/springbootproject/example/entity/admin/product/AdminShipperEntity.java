package com.springbootproject.example.entity.admin.product;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "a_shipper")
public class AdminShipperEntity {

	@Id
	@Column(name = "shipper_id")
	private String shipperId;

	@Column(name = "company_name")
	private String companyName;

	@Column(name = "phone")
	private String phone;
	
	@OneToMany(mappedBy = "adorders_adshiper", cascade = CascadeType.ALL)
	private Set<AdminOrderEntity> orders;
	

	public AdminShipperEntity() {

	}


	public AdminShipperEntity(String shipperId, String companyName, String phone, Set<AdminOrderEntity> orders) {
		this.shipperId = shipperId;
		this.companyName = companyName;
		this.phone = phone;
		this.orders = orders;
	}


	public String getShipperId() {
		return shipperId;
	}


	public void setShipperId(String shipperId) {
		this.shipperId = shipperId;
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


	public Set<AdminOrderEntity> getOrders() {
		return orders;
	}


	public void setOrders(Set<AdminOrderEntity> orders) {
		this.orders = orders;
	}
	
}
