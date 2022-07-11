package com.manage.account.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;


public class CustomerAccountDetails {


	@Field(name = "customer_id")
	private String customerId;

	private String accType;
	@Field(name = "acc_no")
	private String accNo;

	private int accBal;

	private String transHist;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public int getAccBal() {
		return accBal;
	}

	public void setAccBal(int accBal) {
		this.accBal = accBal;
	}

	public String getTransHist() {
		return transHist;
	}

	public void setTransHist(String transHist) {
		this.transHist = transHist;
	}
}
