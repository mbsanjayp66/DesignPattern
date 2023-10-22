package com.sanjay.BuilderDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder {

	@Override
	public StudentBuilder setSubjects() {
		List<String>subs = new ArrayList<>();
		subs.add("Economics");
		subs.add("Chutiyapa");
		subs.add("Time waste");
		subs.add("Jindagi Barbad");
		this.subjects = subs;
		return this;
	}

}
