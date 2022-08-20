package com.revature.models;

import java.util.ArrayList;

public class Customer {

	private int id;
	private String name;
	private String email;
	private ArrayList<Order> orders;
	
	public Customer() {
		super();
	}
	public Customer(String name, String email) {
		super();
		this.name = name;
		this.email = email;
		this.orders = new ArrayList<Order>();
	}
	
	public Customer(int id, String name, String email, ArrayList<Order> orders) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.orders = orders;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public ArrayList<Order> getOrders() {
		return orders;
	}
	public void setOrders(ArrayList<Order> orders) {
		this.orders = orders;
	}
	public void addOrder (Order order) {
		orders.add(order);
	}
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", orders=" + orders + "]";
	}
	
	
}
