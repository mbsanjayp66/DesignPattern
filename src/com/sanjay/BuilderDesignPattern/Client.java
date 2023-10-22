package com.sanjay.BuilderDesignPattern;

public class Client {

	public static void main(String[] args) {
		Director d1 = new Director(new EngineeringStudentBuilder());
		Director d2 = new Director(new MBAStudentBuilder());
		d1.createStudent();
		d2.createStudent();
	}

}
