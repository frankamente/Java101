package com.svqjug.java101.chapter15;

public class Closet {

	private ShoeBoxes shoeBoxes;
	private ShirtsBar shirtsBar;

<<<<<<< HEAD:chapter15/src/main/java/com/svqjug/java101/chapter15/Wardrobe.java
	public Wardrobe() {
		shoeBoxes = new ShoeBoxes();
		shirtsBar = new ShirtsBar();
=======
	public Closet() {
		bar = new Bar();
		setShoeBoxes(new ShoeBoxes());
>>>>>>> 497c4161eb01826f41fb09b9bf2d15acaf78c601:chapter15/src/main/java/com/svqjug/java101/chapter15/Closet.java
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
