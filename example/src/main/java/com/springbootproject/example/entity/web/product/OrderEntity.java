package com.springbootproject.example.entity.web.product;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "order")
public class OrderEntity {

	@Id
	@Column(name = "order_id")
	private String orderId;

	@Column(name = "customer_id")
	private String customerId;

	@Column(name = "order_number")
	private String orderNumber;

	@Column(name = "payment_id")
	private String paymentId;

	@Column(name = "order_date")
	private String orderDate;

	@Column(name = "ship_date")
	private String shipDate;

	@Column(name = "required_date")
	private String requiredDate;

	@Column(name = "shipper_id")
	private String shipperId;

	@Column(name = "freight")
	private String freight;

	@Column(name = "sale_tax")
	private String saleTax;

	@Column(name = "timestample")
	private String timestample;

	@Column(name = "transaction_status")
	private String transactionStatus;

	@Column(name = "errLog")
	private String errLog;

	@Column(name = "errMsg")
	private String errMsg;

	@Column(name = "fulFiled")
	private String fulFiled;

	@Column(name = "deleted")
	private String deleted;

	@Column(name = "paid")
	private String paid;

	@Column(name = "payment_date")
	private String paymentDate;

	public OrderEntity() {

	}

	public OrderEntity(String orderId, String customerId, String orderNumber, String paymentId, String orderDate,
			String shipDate, String requiredDate, String shipperId, String freight, String saleTax, String timestample,
			String transactionStatus, String errLog, String errMsg, String fulFiled, String deleted, String paid,
			String paymentDate) {
		this.orderId = orderId;
		this.customerId = customerId;
		this.orderNumber = orderNumber;
		this.paymentId = paymentId;
		this.orderDate = orderDate;
		this.shipDate = shipDate;
		this.requiredDate = requiredDate;
		this.shipperId = shipperId;
		this.freight = freight;
		this.saleTax = saleTax;
		this.timestample = timestample;
		this.transactionStatus = transactionStatus;
		this.errLog = errLog;
		this.errMsg = errMsg;
		this.fulFiled = fulFiled;
		this.deleted = deleted;
		this.paid = paid;
		this.paymentDate = paymentDate;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getShipDate() {
		return shipDate;
	}

	public void setShipDate(String shipDate) {
		this.shipDate = shipDate;
	}

	public String getRequiredDate() {
		return requiredDate;
	}

	public void setRequiredDate(String requiredDate) {
		this.requiredDate = requiredDate;
	}

	public String getShipperId() {
		return shipperId;
	}

	public void setShipperId(String shipperId) {
		this.shipperId = shipperId;
	}

	public String getFreight() {
		return freight;
	}

	public void setFreight(String freight) {
		this.freight = freight;
	}

	public String getSaleTax() {
		return saleTax;
	}

	public void setSaleTax(String saleTax) {
		this.saleTax = saleTax;
	}

	public String getTimestample() {
		return timestample;
	}

	public void setTimestample(String timestample) {
		this.timestample = timestample;
	}

	public String getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	public String getErrLog() {
		return errLog;
	}

	public void setErrLog(String errLog) {
		this.errLog = errLog;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public String getFulFiled() {
		return fulFiled;
	}

	public void setFulFiled(String fulFiled) {
		this.fulFiled = fulFiled;
	}

	public String getDeleted() {
		return deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public String getPaid() {
		return paid;
	}

	public void setPaid(String paid) {
		this.paid = paid;
	}

	public String getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}

}
