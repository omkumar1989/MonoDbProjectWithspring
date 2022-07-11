package com.manage.account.controller;

import com.manage.account.entity.CustomerDetails;
import com.manage.account.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class ManageAccountController {
	
	@Autowired
	CustomerService customerService;

	@PostMapping("/create")
	public CustomerDetails createCustomer(@RequestBody CustomerDetails customerDetails) {
		return customerService.createCustomer(customerDetails);
	}
	
	@GetMapping("/all")
	public List<CustomerDetails> getAllCustomer() {
		return customerService.getAllCustomers();
	}

	@GetMapping("/balance")
	public List<CustomerDetails> getAccountBalance() {
		return customerService.accountBalance();
	}

	@GetMapping("/update/intrest")
	public String getUpdateIntrest() {
		return customerService.updateAccountBalanceCustomers();
	}

}
