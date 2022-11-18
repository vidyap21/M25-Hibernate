package org.tnsindia.dao;

import javax.persistence.EntityManager;

import org.tnsindia.entities.Customer;

public class CustomerDaoImplementation implements CustomerDao {

	
	private EntityManager em;
	
	
	
	public CustomerDaoImplementation() {
		super();
		em=JPAUtil.getEntityManager();
	}

	@Override
	public void addCustomer(Customer customer) {
		em.persist(customer);
		
	}

	@Override
	public void updateCustomer(Customer customer) {
		em.merge(customer);
		
	}

	@Override
	public void deleteCustomer(Customer customer) {
		em.remove(customer);
		
	}

	@Override
	public Customer getCustomerById(int cust_ID) {
		Customer customer=em.find(Customer.class, cust_ID);
		return customer;
	}

	@Override
	public void beginTransaction() {
		em.getTransaction().begin();		
	}

	@Override
	public void CommitTransaction() {
		em.getTransaction().commit();
		
	}

}
