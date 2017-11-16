package com.svqjug.java101.chapter8.defaultmethod;

public class NewPerson extends OldPerson implements Person {

	private final String sex;

	public NewPerson(String name, Integer age, String sex) {
		super(name, age);
		this.sex = sex;
	}

	@Override
	public String getSex() {
		return sex;
	}
}
