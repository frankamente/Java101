package com.svqjug.java101.chapter15;

import java.util.Objects;

public class Shirt implements Comparable{

    private final String description;

    public Shirt(String description) {

        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shirt shirt = (Shirt) o;
        return Objects.equals(description, shirt.description);
    }

    @Override
    public int hashCode() {

        return Objects.hash(description);
    }

    @Override
    public int compareTo(Object o) {
        Shirt shirt = (Shirt)o;
        return this.description.compareToIgnoreCase(shirt.description);
    }
}
