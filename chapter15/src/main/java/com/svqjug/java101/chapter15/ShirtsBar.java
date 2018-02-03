package com.svqjug.java101.chapter15;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Optional;
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

    public Optional<Shirt> getFirstShirt() {
        if (shirts.isEmpty()) {
            return Optional.empty();
        } else {
            return Optional.of(shirts.first());
        }
    }

    public Optional<Shirt> getLastShirt() {
        if (shirts.isEmpty()) {
            return Optional.empty();
        } else {
            return Optional.of(shirts.last());
        }
    }

    public NavigableSet<Shirt> getShirts() {
        return Collections.unmodifiableNavigableSet(shirts);
    }
}
