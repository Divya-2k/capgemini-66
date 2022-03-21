package com.capg.second;

import java.util.Scanner;

public class UsingClass {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		Mouse m1=new Mouse();
		m1.name="mickey";
		m1.price=2000;
		m1.warranty=2;
		m1.print();
		
		Pen p1=new Pen();
		p1.name="Renolds";
		p1.price=10;
		p1.print();
		
		
		Student s1=new Student();
		s1.name="Rob";
		s1.id_no=233;
		s1.print();
		
		
		Car c1=new Car();
		c1.name="Swift";
		c1.price=600000;
		c1.year=2021;
		c1.print();
		
		
		Mobile n1=new Mobile();
		n1.name="Samsung";
		n1.price=15000;
		n1.version=11;
		n1.print();
		
		Garden g1=new Garden();
		g1.gardenName="Rose cottage";
		g1.total_plants=50;
		g1.no_of_varieties=25;
		g1.maintainence=2000;
		g1.print();
	}
}
