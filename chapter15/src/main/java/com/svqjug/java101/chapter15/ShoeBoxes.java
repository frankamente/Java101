package com.svqjug.java101.chapter15;

import java.util.HashSet;
import java.util.Set;

public class ShoeBoxes {

	private Set<ShoeBox> boxes;

	public ShoeBoxes() {
		boxes = new HashSet<>();
	}

	public int size() {
		return boxes.size();
	}

	public void add(ShoeBox box) {
		boxes.add(box);
	}

	public boolean contains(ShoeBox box) {
		return boxes.contains(box);
	}

}
