
package com.capg.second;

import java.util.Scanner;

class Employee{
	int salary;
	String name;
	
	public Employee(){}
	
	public Employee(int salary, String name) {
		this.salary=salary;
		this.name=name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

class Programmer extends Employee{
	int bonus;


	public class SingleInheritance {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int salary=sc.nextInt();
			String name=sc.next();
			int bonus=sc.nextInt();
			
			Programmer P=new Programmer();
			//Programmer P1=new Programmer(name);
			//Programmer P2=new Programmer(bonus);
			
			System.out.println(P.salary);
			System.out.println(P.bonus);
			System.out.println(P.name);
		}
	}

}


