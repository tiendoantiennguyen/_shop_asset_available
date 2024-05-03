package com.springbootproject.example.entity.admin.product;

import java.util.Set;

import com.springbootproject.example.entity.admin.customer.AdminCustomerEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "a_order")
public class AdminOrderEntity {

	@Id
	@Column(name = "order_id")
	private String orderId;

	@Column(name = "order_number")
	private String orderNumber;

	@Column(name = "order_date")
	private String orderDate;

	@Column(name = "ship_date")
	private String shipDate;

	@Column(name = "required_date")
	private String requiredDate;

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

	// many to one customer and order table.
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private AdminCustomerEntity adorders_adcustomer;

	// many to one order and payment table.
	@ManyToOne
	@JoinColumn(name = "payment_id")
	private AdminPaymentEntity adorders_adpayment;

	// many to one order and shipper table.
	@ManyToOne
	@JoinColumn(name = "shipper_id")
	private AdminShipperEntity adorders_adshiper;

	// one to many order and order detail table
	@OneToMany(mappedBy = "adOrder_adOrderDetail", cascade = CascadeType.ALL)
	private Set<AdminOrderDetailEntity> orderDetails;
	

	public AdminOrderEntity() {

	}


	public AdminOrderEntity(String orderId, String orderNumber, String orderDate, String shipDate, String requiredDate,
			String freight, String saleTax, String timestample, String transactionStatus, String errLog, String errMsg,
			String fulFiled, String deleted, String paid, String paymentDate, AdminCustomerEntity adorders_adcustomer,
			AdminPaymentEntity adorders_adpayment, AdminShipperEntity adorders_adshiper,
			Set<AdminOrderDetailEntity> orderDetails) {
		this.orderId = orderId;
		this.orderNumber = orderNumber;
		this.orderDate = orderDate;
		this.shipDate = shipDate;
		this.requiredDate = requiredDate;
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
		this.adorders_adcustomer = adorders_adcustomer;
		this.adorders_adpayment = adorders_adpayment;
		this.adorders_adshiper = adorders_adshiper;
		this.orderDetails = orderDetails;
	}


	public String getOrderId() {
		return orderId;
	}


	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}


	public String getOrderNumber() {
		return orderNumber;
	}


	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
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


	public AdminCustomerEntity getAdorders_adcustomer() {
		return adorders_adcustomer;
	}


	public void setAdorders_adcustomer(AdminCustomerEntity adorders_adcustomer) {
		this.adorders_adcustomer = adorders_adcustomer;
	}


	public AdminPaymentEntity getAdorders_adpayment() {
		return adorders_adpayment;
	}


	public void setAdorders_adpayment(AdminPaymentEntity adorders_adpayment) {
		this.adorders_adpayment = adorders_adpayment;
	}


	public AdminShipperEntity getAdorders_adshiper() {
		return adorders_adshiper;
	}


	public void setAdorders_adshiper(AdminShipperEntity adorders_adshiper) {
		this.adorders_adshiper = adorders_adshiper;
	}


	public Set<AdminOrderDetailEntity> getOrderDetails() {
		return orderDetails;
	}


	public void setOrderDetails(Set<AdminOrderDetailEntity> orderDetails) {
		this.orderDetails = orderDetails;
	}
	
}
