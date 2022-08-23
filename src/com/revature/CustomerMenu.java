package com.revature;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import com.revature.datalayer.CustomerDao;
import com.revature.datalayer.ProductsDao;
import com.revature.datalayer.StoreFrontDao;
import com.revature.models.Customer;
import com.revature.models.Product;
import com.revature.models.StoreFront;

public class CustomerMenu {

	public static void customerMenu(Scanner scanner, Customer customer, CustomerDao customerDao) {
		
		StoreFrontDao storeFrontDao = new StoreFrontDao();
		ProductsDao productDao = new ProductsDao();
		ArrayList<StoreFront> storeFronts = storeFrontDao.getAll();
		boolean isRunning = true;
		StoreFront currentStore = null;
		
		while(currentStore == null){
			System.out.println("Select a store");

			for(StoreFront store : storeFronts) {
				System.out.println("[" + store.getId() + "] " + store.getName());
			}

			switch (scanner.nextLine()) {
			case "1":
				currentStore = storeFronts.get(0);
				break;
			case "2":
				currentStore = storeFronts.get(1);
				break;
			default:
				System.out.println("Invalid Option");
				break;
			}	
		}
		System.out.println("Hello " + customer.getName() + "!");

		while(isRunning) {
			System.out.println("Please select from the following " + currentStore.getName() + " options:");
			System.out.println("[1] View Products\n[2] Add Product to Cart\n[x] Sign out");
			currentStore.setProducts(productDao.getAll());
			
			switch (scanner.nextLine()) {
			case "1":
				for(Product product : currentStore.getProducts()) {
					System.out.println(product.getName() + " - $" + product.getPrice());
				}
				System.out.println(" ");
				break;
			case "2":
				System.out.println("Service not available");
				break;
			case "x":
			case "X":
				System.out.println("Logging out of account " + customer.getEmail());
				isRunning = false;
			default:
				break;
			}
		}
		
		
		
		
		
	}
}
