package com.springbootproject.example.entity.web.product;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name= "payment")
public class PaymentEntity {
	
	@Id
	@Column (name = "payment_id")
	private String paymentId;
	
	@Column (name = "payment_type")
	private String paymentType;
	
	@Column (name = "allowed")
	private String allowed;
	
	public PaymentEntity() {
		
	}

	public PaymentEntity(String paymentId, String paymentType, String allowed) {
		this.paymentId = paymentId;
		this.paymentType = paymentType;
		this.allowed = allowed;
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

}
