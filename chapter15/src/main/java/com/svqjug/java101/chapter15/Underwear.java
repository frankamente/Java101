package com.svqjug.java101.chapter15;

import java.util.Objects;

public class Underwear {

    private String description;

    public Underwear(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Underwear underwear = (Underwear) o;
        return Objects.equals(description, underwear.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description);
    }
}
