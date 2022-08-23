package com.revature;

import java.util.Scanner;

import com.revature.datalayer.CustomerDao;
import com.revature.models.Customer;
import com.revature.models.LineItem;
import com.revature.models.Order;
import com.revature.models.Product;

public class Driver {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		CustomerDao customerDao = new CustomerDao();
		boolean isRunning = true;
		
		while(isRunning) {
			
			System.out.println("Wecome to Potpie Palace\n[1] Create Customer\n[2] Signin\n[x] Signout");
			
			switch (scanner.nextLine()) {
			case "1":
				System.out.println("Enter name");
				String tempName = scanner.nextLine();
				System.out.println("Enter email");
				String tempEmail = scanner.nextLine();
				Customer cust = new Customer(tempName, tempEmail);
				customerDao.addInstance(cust);
				break;
			case "2":
				System.out.println("Enter email");
				String email = scanner.nextLine();
				Customer tempCust = customerDao.getInstanceByField(new Customer(email));
				if(tempCust == null) {
					System.out.println("Customer not found!");
				} else {
					CustomerMenu.customerMenu(scanner, tempCust, customerDao);
				}
				break;
			case "X":
			case "x":
				System.out.println("Goodbye");
				isRunning = false;
				break;
			default:
				break;
			}
		}
	}
}
