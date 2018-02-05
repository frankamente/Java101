package com.svqjug.java101.chapter15;

import java.util.Objects;
import java.util.Optional;

public class Underwear {

    private final String name;

    public Underwear(String name) {

        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Underwear underwear = (Underwear) o;
        return Objects.equals(name, underwear.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }
}
