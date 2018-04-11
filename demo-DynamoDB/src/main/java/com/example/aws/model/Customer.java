package com.example.aws.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
 
@DynamoDBTable(tableName = "Customer")
public class Customer {
 
	private String Customer_ID;
	private String firstName;
	private String lastName;
 
	public Customer() {
	}
 
	public Customer(String Customer_ID, String firstName, String lastName) {
		this.Customer_ID = Customer_ID;
		this.firstName = firstName;
		this.lastName = lastName;
	}
 
	@DynamoDBHashKey(attributeName = "Customer_ID")
	public String getCustomer_ID() {
		return Customer_ID;
	}
 
	public void setID(String Customer_ID) {
		this.Customer_ID = Customer_ID;
	}
 
	@DynamoDBAttribute(attributeName = "FirstName")
	public String getFirstName() {
		return firstName;
	}
 
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
 
	@DynamoDBAttribute(attributeName = "LastName")
	public String getLastName() {
		return lastName;
	}
 
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
 
	@Override
	public String toString() { 	 	
		return String.format("Customer[Customer_ID=%s, firstName='%s', lastName='%s']", Customer_ID, firstName, lastName);
	}
}
