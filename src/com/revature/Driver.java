package com.revature;

import java.util.Scanner;

import com.revature.datalayer.CustomerDao;
import com.revature.models.Customer;
import com.revature.models.LineItem;
import com.revature.models.Order;
import com.revature.models.Product;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerDao customerDao = new CustomerDao();
		
//		customerDao.addInstance(new Customer("Jim Halbert", "jim@email"));
		
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name");
		String tempName = scanner.next();
		System.out.println("Enter email");
		String tempEmail = scanner.next();
//	
		Customer cust = new Customer(tempName, tempEmail);
		customerDao.addInstance(cust);
		
		
//		System.out.println(cust.toString());
//		
//		
//		Order order1 = new Order();
//		String name = "Me";
//		
//		
//		Product product = new Product("Cereal", 10);
//		Customer customer = new Customer("Andy", "andy@andy.com");
//		
//		
//		LineItem lineItem = new LineItem(product, 4);
//		LineItem lineItem2 = new LineItem(product, 100000);
//
//		Order order = new Order();
//		order.addItem(lineItem);
//		order.addItem(lineItem2);
//		
//		
//		order.addItem(new LineItem(new Product("name", 3), 3));
//		
////		for(LineItem item : order.getItemsList()) {
////			System.out.println(item);
////		}
////		System.out.println(order.getTotalPrice());
////		
////		System.out.println(product.getName());
//		
//		customer.addOrder(order);
//		
////		System.out.println(customer.getOrders().get(0).toString());
//		
//		customer.getOrders().get(0).removeItem(lineItem2);
//		for(LineItem item : customer.getOrders().get(0).getItemsList()) {
//			System.out.println(item);
//		}
//		
//		
//		order.getItemsList().get(0).setQuantity(3);
//
//		System.out.println(order.getItemsList().get(0).getQuantity());
	}

}
