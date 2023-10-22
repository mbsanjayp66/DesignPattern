package com.sanjay.BuilderDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder {

	@Override
	public StudentBuilder setSubjects() {
		List<String>subs = new ArrayList<>();
		subs.add("DSA");
		subs.add("OS");
		subs.add("CN");
		subs.add("DBMS");
		this.subjects = subs;
		return this;
	}

}
