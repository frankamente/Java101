package com.svqjug.java101.chapter15;

import java.util.NavigableSet;
import java.util.Optional;

public class Closet {

	private ShoeBoxes shoeBoxes;
	private ShirtsBar shirtsBar;

	public Closet() {
        shirtsBar = new ShirtsBar();
        shoeBoxes = new ShoeBoxes();
	}

	public void add(ShoeBox box) {
		if (box != null) {
			shoeBoxes.add(box);
		}
	}

	public int getNumberOfShoeBoxes() {
		return shoeBoxes.size();
	}

	public boolean contains(ShoeBox box) {
		return shoeBoxes.contains(box);
	}

	public void add(Shirt shirt) {
		if (shirt != null) {
			shirtsBar.add(shirt);
		}

	}

	public boolean contains(Shirt shirt) {
		return shirtsBar.contains(shirt);
	}

	public int getNumberOfShirts() {
		return shirtsBar.size();
	}

    public Optional<Shirt> getFirstShirt() {
        return shirtsBar.getFirstShirt();
    }

    public Optional<Shirt> getLastShirt() {
        return shirtsBar.getLastShirt();
    }

    public NavigableSet<Shirt> getShirts() {
        return shirtsBar.getShirts();
    }
}
