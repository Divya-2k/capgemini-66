package com.capg.second;

class AA{
	public void print() {
		System.out.println("Print AA");
	}
}

class BB extends AA{
	public void print1() {
		System.out.println("Print BB_AA");
	}
	
}

class CC extends BB{
	public void print2() {
		System.out.println("Print CC_BB_AA");
	}
	public class MultiLevelInheritance {

		public static void main(String[] args) {
			CC obj=new CC();
			obj.print();
			obj.print1();
			obj.print2();

		}

	}

}

