package com.svqjug.java101.chapter8.exercise1.consultant;

public class Developer extends Employee {

	public Developer(Integer id, String name, String surname) {
		super(id, name, surname);
	}

	public void develop() {
		System.out.println("Lazy " + this + " developing");
	}

}
