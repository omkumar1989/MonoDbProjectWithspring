package com.manage.account.service;

import com.manage.account.entity.CustomerDetails;
import com.manage.account.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;

	public CustomerDetails createCustomer (CustomerDetails customerDetails) {
		return customerRepository.save(customerDetails);
	}
	
	public List<CustomerDetails> getAllCustomers() {
		return customerRepository.findAll();
	}

	public List<CustomerDetails> accountBalance() {
		return customerRepository.findCustomerDetailsByCustomerAccountDetailsAccBalGreaterThan(100000);
	}
	boolean flag=false;
	public String updateAccountBalanceCustomers() {

		List<CustomerDetails> custDetails=new ArrayList<>();
		custDetails=customerRepository.findAll();

		custDetails.forEach(i->{

			System.out.println("here "+i.getCustomerAccountDetails().getAccType() + i.getCustomerAccountDetails().getAccBal());
			if(i.getCustomerAccountDetails().getAccType().equals("saving") && i.getCustomerAccountDetails().getAccBal()>100000)
				{
					BigDecimal value=new BigDecimal(i.getCustomerAccountDetails().getAccBal()+i.getCustomerAccountDetails().getAccBal()*0.05);
					i.getCustomerAccountDetails().setAccBal(value.intValue());
					customerRepository.save(i);
					flag=true;
				}else if(i.getCustomerAccountDetails().getAccType().equals("current") && i.getCustomerAccountDetails().getAccBal()>10000000){
				BigDecimal value=new BigDecimal(i.getCustomerAccountDetails().getAccBal()+i.getCustomerAccountDetails().getAccBal()*0.1);
				i.getCustomerAccountDetails().setAccBal(value.intValue());
				customerRepository.save(i);
				flag=true;

			}


		});
		if(flag==true)
		return "Record Updated interest  successfully";
		else
		return "Record interest not updated ";
	}
}
