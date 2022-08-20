package com.revature.models;

import java.util.ArrayList;

public class Order {

	private int id;
	private ArrayList<LineItem> itemsList;
	private int totalPrice;
	
	public Order() {
		this.itemsList = new ArrayList<LineItem>();
		this.totalPrice = 0;
	}

	public Order(int id, ArrayList<LineItem> itemsList, int totalPrice) {
		super();
		this.id = id;
		this.itemsList = itemsList;
		this.totalPrice = totalPrice;
	}

	public Order(ArrayList<LineItem> itemsList, int totalPrice) {
		super();
		this.itemsList = itemsList;
		this.totalPrice = totalPrice;
	}
	
	public ArrayList<LineItem> getItemsList() {
		return itemsList;
	}
	public void setItemsList(ArrayList<LineItem> itemsList) {
		this.itemsList = itemsList;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	public void addItem(LineItem item) {
		this.itemsList.add(item);
		this.totalPrice += item.getProduct().getPrice();
	}
	
	public void removeItem(LineItem item) {
		this.itemsList.remove(item);
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", itemsList=" + itemsList + ", totalPrice=" + totalPrice + "]";
	}
	
	
	
	
}
