package com.svqjug.java101.chapter11.musicplayer;

import com.svqjug.java101.chapter11.playlist.Song;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SongsFactory {

    private final static Set<Song> songs;

    static {
        songs = new HashSet<>();
        songs.add(new Song("The Smashing Pumpkins", "Mellon Collie and the Infinite Sadness - From Twilight to Starlight", "1979"));
        songs.add(new Song("Foo Fighters", "The Colour and the Shape", "Everlong"));
        songs.add(new Song("Florence and the Machine", "How big, how blue, how beautiful", "Ship to wreck"));
    }

    public static Song getSong() {
        Random rnd = new Random();
        int i = rnd.nextInt(songs.size());
        return (Song) songs.toArray()[i];
    }
}
