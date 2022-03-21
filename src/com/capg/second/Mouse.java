package com.capg.second;

public class Mouse {
	String name;
	float price;
	int warranty;
	
	//default constructor
	public Mouse() {
		// TODO Auto-generated constructor stub
	}
	
	//parameterized constructor
	public Mouse(String name, float price, int warranty) {
		this.name = name;
		this.price = price;
		this.warranty = warranty;
	}
	
	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	public void print() {
		System.out.println("Mouse brand name:"+this.name);
		System.out.println("Cost per piece:"+getPrice());
		System.out.println("Warranty suration:"+getWarranty());
		
	}
	
}
