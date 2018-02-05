package com.svqjug.java101.chapter15;

import java.util.LinkedList;
import java.util.Optional;
import java.util.Queue;

public class TShirtsDrawer {

	private Queue<TShirt> tShirts;

	public TShirtsDrawer() {
		tShirts = new LinkedList<>();
	}

	public int size() {
		return tShirts.size();
	}

	public void add(TShirt tShirt) {
		if (tShirt != null) {
			tShirts.add(tShirt);
		}
	}

	public Optional<TShirt> remove() {
		if (tShirts.isEmpty()) {
			return Optional.empty();
		} else {
			return Optional.of(tShirts.remove());
		}
	}

}
