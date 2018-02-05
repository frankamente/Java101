package com.svqjug.java101.chapter15;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TShirtsDrawer {

    private List<TShirt> tShirtsCollection;

    public TShirtsDrawer(){
        tShirtsCollection = new ArrayList<>();
    }
    public int size() {
        return tShirtsCollection.size();
    }

    public void add(TShirt tshirt) {
        if(tshirt== null){
            return;
        }
        tShirtsCollection.add(tshirt);
    }

    public Optional<TShirt> remove() {
        if (tShirtsCollection.isEmpty()){
            return Optional.empty();
        }
        TShirt removed = tShirtsCollection.get(0);
        tShirtsCollection.remove(removed);
        return Optional.of(removed);
    }
}
