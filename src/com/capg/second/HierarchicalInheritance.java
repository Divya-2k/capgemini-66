package com.capg.second;

class A{
	void p() {
		System.out.println("Print H A");
	}
}

class B extends A{
	void p1() {
		System.out.println("Print H BB_AA");
	}
	
}

class C extends A{
	void p2() {
		System.out.println("Print H CC_AA");
	}
	

}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C obj=new C();
		obj.p();
		obj.p2();
		
		B obj1=new B();
		obj1.p();
		obj1.p1();
	
	}

}

