package com.svqjug.java101.chapter15;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SocksDrawer {

    ArrayList<Socks> socksCollection;

    public SocksDrawer() {
        this.socksCollection = new ArrayList<>();
    }

    public int size() {
        return socksCollection.size();
    }

    public void add(Socks socks) {
        if(socks == null ||
                socks.getDescription() == null){
            return;
        }
        socksCollection.add(socks);
    }

    public boolean contains(Socks socks) {
        return socksCollection.contains(socks);
    }

    public Optional<Socks> get(String description) {
        Socks socks = new Socks(description);
        boolean contains = socksCollection.contains(socks);
        if(contains){
            return Optional.of(socksCollection.get(socksCollection.indexOf(socks)));
        }
        return Optional.empty();
    }

    public Optional<Socks> remove(String description) {
        if(contains(description)){
            return Optional.of(get(description).get());
        }
        return Optional.empty();
    }

    private boolean contains(String description) {
        return socksCollection.contains(new Socks(description));
    }
}
