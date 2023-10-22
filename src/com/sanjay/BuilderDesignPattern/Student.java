package com.sanjay.BuilderDesignPattern;

import java.util.List;

public class Student {
	int rollNumber;
	
	int age;
	
	String name;
	
	String fatherName;
	String motherName;
	List<String>subjects;
	
	public Student(StudentBuilder builder) {
		this.rollNumber = builder.rollNumber;
		
		this.age = builder.age;
		this.name = builder.name;
		this.fatherName = builder.fatherName;
		this.motherName = builder.motherName;
		this.subjects = builder.subjects;
	}
}
