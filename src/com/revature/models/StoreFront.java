package com.revature.models;

import java.util.ArrayList;

public class StoreFront {

	private int id;
	private String name;
	private String address;
	ArrayList<Product> products;
	ArrayList<Order> orders;
	
	public StoreFront() {
		super();
	}
	
	public StoreFront(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	public StoreFront(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public StoreFront(int id, String name, String address, ArrayList<Product> products, ArrayList<Order> orders) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.products = products;
		this.orders = orders;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public ArrayList<Product> getProducts() {
		return products;
	}
	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}
	public ArrayList<Order> getOrders() {
		return orders;
	}
	public void setOrders(ArrayList<Order> orders) {
		this.orders = orders;
	}
	@Override
	public String toString() {
		return "StoreFront [id=" + id + ", name=" + name + ", address=" + address + ", products=" + products
				+ ", orders=" + orders + "]";
	}
	
	
	
	
	
}
