package com.capg.second;

public class Student {
	String name;
	int id_no;
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}


	public Student(String name, int id_no) {
		this.name = name;
		this.id_no = id_no;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId_no() {
		return id_no;
	}


	public void setId_no(int id_no) {
		this.id_no = id_no;
	}
	
	public void print() {
		System.out.println();
		System.out.println("Student name:"+getName());
		System.out.println("Student ID:"+getId_no());
	}
	
}