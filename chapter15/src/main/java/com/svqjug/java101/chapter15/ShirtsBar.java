package com.svqjug.java101.chapter15;

import java.util.NavigableSet;
import java.util.TreeSet;

public class ShirtsBar {

	private NavigableSet<Shirt> shirts;

	public ShirtsBar() {
		shirts = new TreeSet<>();
	}

	public int size() {
		return shirts.size();
	}

	public void add(Shirt shirt) {
		shirts.add(shirt);
	}

	public boolean contains(Shirt shirt) {
		if (shirt != null) {
			return shirts.contains(shirt);
		} else {
			return false;
		}
	}

}
