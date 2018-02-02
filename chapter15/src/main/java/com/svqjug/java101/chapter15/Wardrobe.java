package com.svqjug.java101.chapter15;

public class Wardrobe {

	private Bar bar;
	private ShoeBoxes shoeBoxes;

	public Wardrobe() {
		bar = new Bar();
		setShoeBoxes(new ShoeBoxes());
	}

	public Bar getBar() {
		return bar;
	}

	public void setBar(Bar bar) {
		this.bar = bar;
	}

	public ShoeBoxes getShoeBoxes() {
		return shoeBoxes;
	}

	public void setShoeBoxes(ShoeBoxes shoeBoxes) {
		this.shoeBoxes = shoeBoxes;
	}

	public void add(ShoeBox box) {
		if (box != null) {
			shoeBoxes.add(box);
		}
	}

	public boolean contains(ShoeBox box) {
		return shoeBoxes.contains(box);
	}
}
