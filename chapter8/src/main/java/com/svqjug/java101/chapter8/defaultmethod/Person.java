package com.svqjug.java101.chapter8.defaultmethod;

public interface Person {

	String getName();

	Integer getAge();

	default String getSex() {
		return "N/A";
	}
}
