package com.jdbcdemo.JBDCDemo;

public class Items {
	private int id;
	private String name;
	private String description;
	private int quantity;
	private double price;
	

	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Items(int id, String name, String description, int quantity, double price) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "Items [id=" + id + ", name=" + name + ", description=" + description + ", quantity=" + quantity
				+ ", price=" + price + "]";
	}

}
