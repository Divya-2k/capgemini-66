package com.capg.second;

enum Days{
	SUNDAY,
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY
}

enum Months{
	JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEPT,OCT,NOV,DEC
}

public class Week {
	public static void main(String[] args) {
		System.out.println(Days.FRIDAY);
		System.out.println(Months.FEB);
	}
}
