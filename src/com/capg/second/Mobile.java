package com.capg.second;

public class Mobile {
	String name;
	float price;
	int version;
	
	
	public Mobile() {
		// TODO Auto-generated constructor stub
	}

	public Mobile(String name, float price, int version) {
		this.name = name;
		this.price = price;
		this.version = version;
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
	
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public void print() {
		System.out.println();
		System.out.println("Mobile brand name:"+getName());
		System.out.println("Price:"+getPrice());
		System.out.println("Android version:"+getVersion());
	}


}
