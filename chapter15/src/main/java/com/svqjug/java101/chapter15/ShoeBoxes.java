package com.svqjug.java101.chapter15;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ShoeBoxes {

    Set<ShoeBox> shoeBoxCollection;

    public ShoeBoxes(){
        shoeBoxCollection = new HashSet<>();
    }

    public int size() {
        return shoeBoxCollection.size();
    }

    public void add(ShoeBox shoeBox) {
        if(shoeBox== null){
            return;
        }
        shoeBoxCollection.add(shoeBox);
    }

    public boolean contains(ShoeBox shoeBox) {
        return shoeBoxCollection.contains(shoeBox);
    }

    public void remove(ShoeBox shoeBox) {
        if (shoeBox== null){
            return;
        }
        shoeBoxCollection.remove(shoeBox);
    }
}
