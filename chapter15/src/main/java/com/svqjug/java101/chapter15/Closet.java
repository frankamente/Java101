package com.svqjug.java101.chapter15;

public class Closet {

	private ShoeBoxes shoeBoxes;
	private ShirtsBar shirtsBar;
    private UnderwearDrawer underwearDrawer;

	public Closet() {
        shirtsBar = new ShirtsBar();
        shoeBoxes = new ShoeBoxes();
        underwearDrawer = new UnderwearDrawer();
	}
}
