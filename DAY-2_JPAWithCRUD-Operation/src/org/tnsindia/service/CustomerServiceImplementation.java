package org.tnsindia.service;

import org.tnsindia.dao.CustomerDao;
import org.tnsindia.dao.CustomerDaoImplementation;
import org.tnsindia.entities.Customer;

public class CustomerServiceImplementation implements CustomerService {

	
	private CustomerDao dao;
	
	
	public CustomerServiceImplementation() {
		super();
		dao=new CustomerDaoImplementation();
	}

	@Override
	public void addCustomer(Customer customer) {
	    dao.beginTransaction();
	    dao.addCustomer(customer);
	    dao.CommitTransaction();
		
	}

	@Override
	public void updateCustomer(Customer customer) {
		dao.beginTransaction();
		dao.updateCustomer(customer);
		dao.CommitTransaction();
		
	}

	@Override
	public void deleteCustomer(Customer customer) {
		dao.beginTransaction();
		dao.deleteCustomer(customer);
		dao.CommitTransaction();
	}

	@Override
	public Customer getCustomerById(int cust_ID) {
		Customer customer=dao.getCustomerById(cust_ID);
		return customer;
	}

}
