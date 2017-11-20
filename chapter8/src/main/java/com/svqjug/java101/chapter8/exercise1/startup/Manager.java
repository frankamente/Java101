package com.svqjug.java101.chapter8.exercise1.startup;

public interface Manager {

	default void accountHours() {
		System.out.println("Manager " + this + " accounting his slaves hours");
	}
}
