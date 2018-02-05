package com.svqjug.java101.chapter15;

import java.util.*;

public class ShirtsBar {

    NavigableSet<Shirt> shirtsCollection;

    public ShirtsBar(){
        shirtsCollection = new TreeSet<>();
    }
    public int size() {
        return shirtsCollection.size();
    }

    public void add(Shirt shirt) {
        if(shirt == null){
            return;
        }
        shirtsCollection.add(shirt);
    }

    public boolean contains(Shirt shirt) {
        if(shirt == null){
            return false;
        }
        return shirtsCollection.contains(shirt);
    }

    public void remove(Shirt shirt) {
        if(shirt == null){
            return;
        }
        shirtsCollection.remove(shirt);
    }

    public Optional<Shirt> getFirstShirt() {
        if(shirtsCollection.isEmpty()){
            return Optional.empty();
        }
        return Optional.of(shirtsCollection.first());
    }

    public Optional<Shirt> getLastShirt() {
        if(shirtsCollection.isEmpty()){
            return Optional.empty();
        }
        return Optional.of(shirtsCollection.last());
    }

    public NavigableSet<Shirt> getShirts() {
        return shirtsCollection;
    }
}
