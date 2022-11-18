package org.tnsindia.client;

import java.util.Scanner;

import org.tnsindia.entities.Customer;
import org.tnsindia.service.CustomerService;
import org.tnsindia.service.CustomerServiceImplementation;

public class Client {
	public static void main(String[] args) {
		CustomerService service=new CustomerServiceImplementation();
		Customer customer =new Customer();
		Scanner s=new Scanner(System.in);
		
		
	//create operation
		/*customer.setCust_ID(1002);
		customer.setName("PRABHA");
		customer.setProduct_price(75.80);
		service.addCustomer(customer);
		System.out.println("Customer Added Successfully"); */
		
	/*//retrieve operation
		customer=service.getCustomerById(1002);
		System.out.println("Customer ID:" + customer.getCust_ID());	
		System.out.println("Customer Name:"+ customer.getName());	
		System.out.println("Customer Product-Price:"+ customer.getProduct_price());	 */	


	/*//Updation
		System.out.println("Enter the Cust_ID for the updation");
		customer=service.getCustomerById(s.nextInt());
		customer.setName("VIDYA PAYGUDE");
		service.updateCustomer(customer);
		System.out.println("Customer Updated Successfully");   */
		
	//Deletion
		System.out.println("Enter the Cust_ID for the Deletion");
		customer=service.getCustomerById(s.nextInt());
		service.deleteCustomer(customer);
		System.out.println("Customer Deleted Successfully");  


		
	}

}
