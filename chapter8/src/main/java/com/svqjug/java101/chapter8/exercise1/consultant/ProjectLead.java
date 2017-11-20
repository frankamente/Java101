package com.svqjug.java101.chapter8.exercise1.consultant;

public class ProjectLead extends Employee {

	public ProjectLead(Integer id, String name, String surname) {
		super(id, name, surname);
	}

	public void design() {
		System.out.println("Project lead " + this + " designing");
	}

}
