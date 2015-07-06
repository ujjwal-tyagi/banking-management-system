package com.magic.bms.beans;

import java.util.Date;

public class Transactions {

	private String transactionType;
	private double amount;
	private Date madeOn;
	
	
	
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getMadeOn() {
		return madeOn;
	}
	public void setMadeOn(Date madeOn) {
		this.madeOn = madeOn;
	}
    
}
