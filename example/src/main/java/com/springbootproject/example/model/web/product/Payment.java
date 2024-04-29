package com.springbootproject.example.model.web.product;

public class Payment {
	
	private String paymentId;
	private String paymentType;
	private String allowed;
	
	public Payment() {
		
	}

	public Payment(String paymentId, String paymentType, String allowed) {
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
