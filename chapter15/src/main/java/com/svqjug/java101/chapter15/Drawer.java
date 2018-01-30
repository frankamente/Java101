package com.svqjug.java101.chapter15;

public interface Drawer {

	default void open() {
		System.out.println("Drawer opens");
	}

	default void close() {
		System.out.println("Drawer closes");
	}
}
