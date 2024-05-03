package com.springbootproject.example.entity.admin.product;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "a_payment")
public class AdminPaymentEntity {

	@Id
	@Column(name = "payment_id")
	private String paymentId;

	@Column(name = "payment_type")
	private String paymentType;

	@Column(name = "allowed")
	private String allowed;

	// one to many order and payment method.
	@OneToOne(mappedBy = "adorders_adpayment", cascade = CascadeType.ALL)
	private AdminOrderEntity orders;

	public AdminPaymentEntity() {

	}

	public AdminPaymentEntity(String paymentId, String paymentType, String allowed, AdminOrderEntity orders) {
		this.paymentId = paymentId;
		this.paymentType = paymentType;
		this.allowed = allowed;
		this.orders = orders;
	}

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getAllowed() {
		return allowed;
	}

	public void setAllowed(String allowed) {
		this.allowed = allowed;
	}

	public AdminOrderEntity getOrders() {
		return orders;
	}

	public void setOrders(AdminOrderEntity orders) {
		this.orders = orders;
	}

}
