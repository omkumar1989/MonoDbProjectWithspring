package com.manage.account.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "customerdetails")

public class CustomerDetails {

	@Id
	@Field(name = "customer_id")
	private String customerId;

	private String name;

	private String gender;

	private String designation;

	private CustomerAddress customerAddress;

	private CustomerAccountDetails customerAccountDetails;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public CustomerAddress getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(CustomerAddress customerAddress) {
		this.customerAddress = customerAddress;
	}

	public CustomerAccountDetails getCustomerAccountDetails() {
		return customerAccountDetails;
	}

	public void setCustomerAccountDetails(CustomerAccountDetails customerAccountDetails) {
		this.customerAccountDetails = customerAccountDetails;
	}
}
