package com.manage.account.repository;

import com.manage.account.entity.CustomerDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends MongoRepository<CustomerDetails, String> {

    List<CustomerDetails>  findCustomerDetailsByCustomerAccountDetails_AccBal( int accBal);

    List<CustomerDetails> findCustomerDetailsByCustomerAccountDetailsAccBalGreaterThan(int accBal);


}
