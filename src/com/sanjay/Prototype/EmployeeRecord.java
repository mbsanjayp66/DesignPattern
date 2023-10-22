package com.sanjay.Prototype;

public class EmployeeRecord implements Prototype {
	
	int id;
	String name;
	String designation;
	int salary;

	public EmployeeRecord(int id, String name, String designation, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}



	@Override
	public Prototype getClone() {
		return new EmployeeRecord(id, name, designation, salary);
	}



	@Override
	public String toString() {
		return "EmployeeRecord [id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary
				+ "]";
	}
	

}
