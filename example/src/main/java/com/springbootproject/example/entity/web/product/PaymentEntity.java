package com.springbootproject.example.entity.web.product;

import com.springbootproject.example.entity.admin.product.AdminOrderEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "payment")
public class PaymentEntity {

	@Id
	@Column(name = "paymentId")
	private String paymentId;

	@Column(name = "payment_type")
	private String paymentType;

	@Column(name = "allowed")
	private String allowed;

	// one to many order and payment method.
	@OneToOne(mappedBy = "payments", cascade = CascadeType.ALL)
	private OrderEntity orders;

	public PaymentEntity() {

	}

	public PaymentEntity(String paymentId, String paymentType, String allowed, OrderEntity orders) {
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

	public OrderEntity getOrders() {
		return orders;
	}

	public void setOrders(OrderEntity orders) {
		this.orders = orders;
	}

}
