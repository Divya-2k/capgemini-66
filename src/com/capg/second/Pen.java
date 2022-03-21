package com.capg.second;

public class Pen {
	
	String name;
	float price;
	
	public Pen() {
		// TODO Auto-generated constructor stub
	}
	
	public Pen(String name, float price) {
		this.name = name;
		this.price = price;
	}

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
	
	public void print() {
		System.out.println();
		System.out.println("Brand name:"+getName());
		System.out.println("Cost per piece:"+getPrice());
	}
	
	
}
