package com.capg.third;
//Emp class
class Employee{
	private int emp_id;
	private String name;
	private String position;
	
	public Employee(){	}

	public Employee(int emp_id, String name, String position) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.position = position;
	}

	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
}

//Dept class
class Dept{
	private int dept_id;
	private String dept_name;
	
	public Dept(){}

	public Dept(int dept_id, String dept_name) {
		super();
		this.dept_id = dept_id;
		this.dept_name = dept_name;
	}

	public int getDept_id() {
		return dept_id;
	}

	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
}

//parking class
class Parking{
	private int Vehicle_no;
	private double parking_fee;
	
	public Parking() {}

	public Parking(int vehicle_no,  double parking_fee) {
		super();
		this.Vehicle_no = vehicle_no;
		
		this.parking_fee = parking_fee;
	}

	public int getVehicle_no() {
		return Vehicle_no;
	}

	public void setVehicle_no(int vehicle_no) {
		Vehicle_no = vehicle_no;
	}

	public double getParking_fee() {
		return parking_fee;
	}

	public void setParking_fee(double parking_fee) {
		this.parking_fee = parking_fee;
	}
}

//address class
class Address{
	private int Door_no;
	private String Door_name;
	private String Street;
	private String City_State;
	private int PinCode;
	
	public Address() {}
	
	public Address(int door_no, String door_name, String street, String city_State, int pinCode) {
		super();
		this.Door_no = door_no;
		this.Door_name = door_name;
		this.Street = street;
		this.City_State = city_State;
		this.PinCode = pinCode;
	}

	public int getDoor_no() {
		return Door_no;
	}

	public void setDoor_no(int door_no) {
		Door_no = door_no;
	}

	public String getDoor_name() {
		return Door_name;
	}

	public void setDoor_name(String door_name) {
		Door_name = door_name;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public String getCity_State() {
		return City_State;
	}

	public void setCity_State(String city_State) {
		City_State = city_State;
	}

	public int getPinCode() {
		return PinCode;
	}

	public void setPinCode(int pinCode) {
		PinCode = pinCode;
	}
}

//driver
public class Encapsulation {
	public static void main(String[] args) {
		Employee e=new Employee();
		e.setName("Rohan");
		e.setEmp_id(4);
		e.setPosition("Manager");
		
		Dept d=new Dept();
		d.setDept_id(12);
		d.setDept_name("R&D");
	
		Parking p=new Parking();
		p.setVehicle_no(4599);
		p.setParking_fee(25);
		
		Address a= new Address();
		a.setDoor_no(390);
		a.setDoor_name("RoseCottage");
		a.setStreet("MG road");
		a.setCity_State("Bangalore Karnataka");
		a.setPinCode(560001);
		
		System.out.println("Employee Details");
		System.out.println("----------------------------------------");
		System.out.println(e.getName());
		System.out.println(e.getEmp_id());
		System.out.println(e.getPosition());
		
		System.out.println();
		System.out.println("Dept Details");
		System.out.println("----------------------------------------");
		System.out.println(d.getDept_id());
		System.out.println(d.getDept_name());
		
		System.out.println();
		System.out.println("Parking");
		System.out.println("----------------------------------------");
		System.out.println(p.getVehicle_no());
		System.out.println(p.getParking_fee());
		
		System.out.println();
		System.out.println("Address");
		System.out.println("----------------------------------------");
		System.out.println(a.getDoor_no());
		System.out.println(a.getDoor_name());
		System.out.println(a.getStreet());
		System.out.println(a.getCity_State());
		System.out.println(a.getPinCode());
	}

}
