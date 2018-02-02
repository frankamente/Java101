package com.svqjug.java101.chapter15;

public class Wardrobe {

	private ShoeBoxes shoeBoxes;
	private ShirtsBar shirtsBar;

	public Wardrobe() {
		shoeBoxes = new ShoeBoxes();
		shirtsBar = new ShirtsBar();
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
}
