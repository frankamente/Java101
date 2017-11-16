package com.svqjug.java101.chapter8.defaultmethod;

public class OldPerson implements Person {

	private final String name;

	private final Integer age;

	public OldPerson(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Integer getAge() {
		return age;
	}

}
