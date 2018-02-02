package com.svqjug.java101.chapter15;

public class ShoeBox {

	private String shoes;

	public ShoeBox(String shoes) {
		setShoes(shoes);
	}

	public String getShoes() {
		return shoes;
	}

	public void setShoes(String shoes) {
		this.shoes = shoes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((shoes == null) ? 0 : shoes.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		ShoeBox other = (ShoeBox) obj;
		if (shoes == null) {
			if (other.shoes != null) {
				return false;
			}
		} else if (!shoes.equals(other.shoes)) {
			return false;
		}
		return true;
	}

}
