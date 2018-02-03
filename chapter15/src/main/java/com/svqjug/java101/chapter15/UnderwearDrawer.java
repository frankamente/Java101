package com.svqjug.java101.chapter15;

import java.util.ArrayList;
import java.util.List;

public class UnderwearDrawer implements Drawer {

    private List<Underwear> underwearPieces;

    public UnderwearDrawer() {
        this.underwearPieces = new ArrayList<>();
    }

    public int getNumberOfUnderwearPieces() {
        return underwearPieces.size();
    }
}
