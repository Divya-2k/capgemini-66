package com.capg.second;

public class Garden {
	String gardenName;
	int total_plants;
	int no_of_varieties;
	float maintainence;
	
	public Garden() {
		// TODO Auto-generated constructor stub
	}

	public Garden(String gardenName, int total_plants, int no_of_varieties, float maintainence) {
		this.gardenName = gardenName;
		this.total_plants = total_plants;
		this.no_of_varieties = no_of_varieties;
		this.maintainence = maintainence;
	}

	public String getGardenName() {
		return gardenName;
	}

	public void setGardenName(String gardenName) {
		this.gardenName = gardenName;
	}

	public int getTotal_plants() {
		return total_plants;
	}

	public void setTotal_plants(int total_plants) {
		this.total_plants = total_plants;
	}

	public int getNo_of_varieties() {
		return no_of_varieties;
	}

	public void setNo_of_varieties(int no_of_varieties) {
		this.no_of_varieties = no_of_varieties;
	}

	public float getMaintainence() {
		return maintainence;
	}

	public void setMaintainence(float maintainence) {
		this.maintainence = maintainence;
	}
	
	public void print() {
		System.out.println();
		System.out.println("Garden name:"+getGardenName());
		System.out.println("total no of plants:"+getTotal_plants());
		System.out.println("number of varieties:"+getNo_of_varieties());
		System.out.println("Maintaninence cost:"+getMaintainence());
		
	}
	

}
