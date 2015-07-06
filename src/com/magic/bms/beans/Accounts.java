package com.magic.bms.beans;


public class Accounts  implements java.io.Serializable {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int accountNo;
	private String accountName;
	private double accountBalance;
	private String createdOn;
	private String accountType;
	
	
	
	
	
	
	
	public Accounts() {
		// TODO Auto-generated constructor stub
	}



	public double getAccountBalance() {
		return accountBalance;
	}
	
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	public int getAccountNo() {
		return accountNo;
	}
	
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	
	public String getCreatedOn() {
		return createdOn;
	}
	
	public void setCreatedOn(String string) {
		this.createdOn = string;
	}
	
	public String getAccountType() {
		return accountType;
	}
	
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	public String getAccountName() {
		return accountName;
	}
	
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	
	
	
	}


