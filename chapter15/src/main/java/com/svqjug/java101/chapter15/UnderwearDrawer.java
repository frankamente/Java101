package com.svqjug.java101.chapter15;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UnderwearDrawer {

    private List<Underwear> underwears;

    public UnderwearDrawer() {
        underwears = new ArrayList<>();
    }

    public int getNumberOfUnderwearPieces() {
        return underwears.size();
    }

    public void add(Underwear underwear) {
        if (underwear == null) {
            return;
        }
        underwears.add(underwear);
    }

    public void add(Underwear underwear, int index) {
        if (underwear == null) {
            return;
        }
        underwears.add(index, underwear);
    }

    public boolean contains(Underwear underwear) {
        return underwears.contains(underwear);
    }

    public void remove(Underwear underwear) {
        underwears.remove(underwear);
    }

    public void remove(int index) {
        if (index > underwears.size() - 1 ||
                index < 0) {
            return;
        }
        underwears.remove(index);
    }

    public Optional<Underwear> get(int index) {
        if (index > underwears.size() - 1 ||
                index < 0) {
            return Optional.empty();
        }
        return Optional.of(underwears.get(index));
    }
}
