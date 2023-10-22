package com.sanjay.BuilderDesignPattern;

public class Director {
	StudentBuilder studentBuilder;
	public Director(StudentBuilder studentBuilder) {
		this.studentBuilder = studentBuilder;
	}
	public Student createStudent() {
		if(studentBuilder instanceof EngineeringStudentBuilder) {
			return createEngineeringStudent();
		}else if(studentBuilder instanceof MBAStudentBuilder){
			return createMBAStudent();
		}
		return null;
	}
	private Student createMBAStudent() {
		return studentBuilder.setName("mooli").setAge(23).setFatherName("ghanShyam").setMotherName("kallo").build();
	}
	private Student createEngineeringStudent() {
		return studentBuilder.setName("sanja").setFatherName("dinesh").setRollNumber(107).build();
	}
}
