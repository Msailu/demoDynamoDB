package com.example.aws.repository;


import java.util.List;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
 
import com.example.aws.model.Customer;
 
@EnableScan
public interface CustomerRepository extends CrudRepository<Customer, String> {
 
	List<Customer> findByLastName(String lastName);
}