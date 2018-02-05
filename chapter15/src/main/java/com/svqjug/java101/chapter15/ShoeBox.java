package com.svqjug.java101.chapter15;

import java.util.Objects;

public class ShoeBox {

    private final String name;

    public ShoeBox(String name) {

        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShoeBox shoeBox = (ShoeBox) o;
        return Objects.equals(name, shoeBox.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }
}
