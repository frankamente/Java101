package com.svqjug.java101.chapter15;

import java.util.NavigableSet;
import java.util.Optional;

public class Closet {

	private ShoeBoxes shoeBoxes;
	private ShirtsBar shirtsBar;
    private UnderwearDrawer underwearDrawer;

	public Closet() {
        shirtsBar = new ShirtsBar();
        shoeBoxes = new ShoeBoxes();
        underwearDrawer = new UnderwearDrawer();
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

    public int getNumberOfUnderwearPieces() {
        return underwearDrawer.getNumberOfUnderwearPieces();
    }

    public void add(Underwear underwear) {
        if (underwear != null) {
            underwearDrawer.add(underwear);
        }
    }

    public boolean contains(Underwear underwear) {
        return underwearDrawer.contains(underwear);
    }

    public Optional<Underwear> getUnderwearPiece(int position) {
        if (position > -1) {
            return underwearDrawer.get(position);
        } else {
            return Optional.empty();
        }
    }

    public void add(Underwear thirdOne, int position) {
        if (thirdOne != null && position > -1) {
            underwearDrawer.add(thirdOne, position);
        }
    }
}
