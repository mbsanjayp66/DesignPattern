package com.sanjay.Prototype;

public class PrototypeDemo {

	public static void main(String[] args) {
		EmployeeRecord e1 = new EmployeeRecord(0, "Sanjay Kumar", "Associate", 2000);
		EmployeeRecord e2 = (EmployeeRecord)e1.getClone();
		
		System.out.println(e1.toString());
		
		System.out.println(e2.toString());
	}

}
