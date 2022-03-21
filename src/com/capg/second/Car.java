package com.capg.second;

public class Car {
	String name;
	float price;
	int year;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	


	public Car(String name, float price, int year) {
		this.name = name;
		this.price = price;
		this.year = year;
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


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}
	
	public void print() {
		System.out.println();
		System.out.println("Model name:"+getName());
		System.out.println("Model price:"+getPrice());
		System.out.println("Manufactured year:"+getYear());
	}


}
