package com.svqjug.java101.chapter8.exercise1.startup;

public interface Developer {

	default void develop() {
		System.out.println("Lazy " + this + " developing");
	}
}
