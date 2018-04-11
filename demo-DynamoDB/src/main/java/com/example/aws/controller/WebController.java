package com.example.aws.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
import com.example.aws.model.Customer;
import com.example.aws.repository.CustomerRepository;
 
@RestController
public class WebController {
 
	@Autowired
	CustomerRepository repository;
 
	@RequestMapping("/delete")
	public String delete() {
		repository.deleteAll();
		return "Done";
	}
 
	@RequestMapping("/save")
	public String save() {
		// save a single Customer
		repository.save(new Customer("10000", "Jack", "Smith"));
	//	repository.save();
 
		// save a list of Customers
		/*repository.save(Arrays.asList(new Customer("JSA-2", "Adam", "Johnson"), new Customer("JSA-3", "Kim", "Smith"),
				new Customer("JSA-4", "David", "Williams"), new Customer("JSA-5", "Peter", "Davis")));
 */
		return "Done";
	}
 
	@RequestMapping("/findall")
	public String findAll() {
		String result = "";
		Iterable<Customer> customers = repository.findAll();
 
		for (Customer cust : customers) {
			result += cust.toString() + "<br>";
		}
 
		return result;
	}
 
	
 
	
}