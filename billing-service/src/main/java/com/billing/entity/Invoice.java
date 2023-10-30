package com.billing.entity;

public class Invoice {
	
	
	private int invoiceId;
	private int amount;
	private String custName;
	
	public int getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public Invoice(int invoiceId, int amount, String custName) {
		super();
		this.invoiceId = invoiceId;
		this.amount = amount;
		this.custName = custName;
	}
	public Invoice() {
		super();
	}
	@Override
	public String toString() {
		return "Invoice [invoiceId=" + invoiceId + ", amount=" + amount + ", custName=" + custName + "]";
	}
	

}
