package com.svqjug.java101.chapter8.exercise1.startup;

public interface ProjectLead {

	default void design() {
		System.out.println("Project lead " + this + " designing");
	}
}
