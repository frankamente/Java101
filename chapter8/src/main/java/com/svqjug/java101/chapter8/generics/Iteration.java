package com.svqjug.java101.chapter8.generics;

import java.util.ArrayList;
import java.util.List;

public class Iteration {

	public static void main(String... args) {
		final List java14 = new ArrayList();
		java14.add("Java ");
		java14.add(1.4);
		java14.add(" list");
		for (final Object object : java14) {
			if (Number.class.isAssignableFrom(object.getClass())) {
				System.out.println(object);
			}
		}
		final List<Number> java15 = new ArrayList<>();
		java15.add(1.5);
		for (final Number number : java15) {
			System.out.println(number);
		}
	}
}
