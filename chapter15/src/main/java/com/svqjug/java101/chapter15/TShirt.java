package com.svqjug.java101.chapter15;

import java.util.Objects;

public class TShirt {

    private final String description;

    public TShirt(String description) {

        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TShirt tShirt = (TShirt) o;
        return Objects.equals(description, tShirt.description);
    }

    @Override
    public int hashCode() {

        return Objects.hash(description);
    }
}
