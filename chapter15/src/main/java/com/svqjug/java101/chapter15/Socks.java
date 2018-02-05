package com.svqjug.java101.chapter15;

import java.util.Objects;

public class Socks {

    private final String description;

    public Socks(String description) {

        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Socks socks = (Socks) o;
        return Objects.equals(description, socks.description);
    }

    @Override
    public int hashCode() {

        return Objects.hash(description);
    }
}
