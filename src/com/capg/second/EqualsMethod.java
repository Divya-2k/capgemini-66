package com.capg.second;

class One{
	int num;
	String name;
	float price;
	
	//default cons
	public One() {}
	
	//parameterized cons
	public One(int num, String name, float price) {
		this.num = num;
		this.name = name;
		this.price = price;
	}
	
	//getters and setters
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
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
}


public class EqualsMethod {

	public static void main(String[] args) {

		One p1=new One(12,"bob",20);
	
		One p2=new One(12,"bob",20);

		System.out.println(p1.equals(p2));
	}
	

}
