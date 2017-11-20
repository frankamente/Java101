package com.svqjug.java101.chapter8.exercise1.consultant;

public class Manager extends Employee {

	public Manager(Integer id, String name, String surname) {
		super(id, name, surname);
	}

	public void accountHours() {
		System.out.println("Manager " + this + " accounting his slaves hours");
	}
}
