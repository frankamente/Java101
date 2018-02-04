package com.svqjug.java101.chapter15;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UnderwearDrawer implements Drawer {

    private List<Underwear> underwearPieces;

    public UnderwearDrawer() {
        this.underwearPieces = new ArrayList<>();
    }

    public int getNumberOfUnderwearPieces() {
        return underwearPieces.size();
    }

    public void add(Underwear underwear) {
        underwearPieces.add(underwear);
    }

    public boolean contains(Underwear underwear) {
        return underwearPieces.contains(underwear);
    }

    public Optional<Underwear> get(int position) {
        if (position > -1 && position < underwearPieces.size()) {
            return Optional.of(underwearPieces.get(position));
        } else {
            return Optional.empty();
        }
    }

    public void add(Underwear underwear, int position) {
        if (position > -1 && position < underwearPieces.size()) {
            underwearPieces.add(position, underwear);
        }
    }
}
