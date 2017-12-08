package com.svqjug.java101.chapter11.medialibrary;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public enum Playlist {
    MY_PLAYLIST(new ArrayList<Song>());

    private final List<Song> songList;

    Playlist(List<Song> songs) {
        this.songList = songs;
    }

    public Song get(String songName) throws FileNotFoundException {
        if (!exists(songName)) {
            throw new FileNotFoundException("Song " + songName + " does not exists in playlist");
        }
        return songList.stream().filter(song -> song.getName().equalsIgnoreCase(songName)).findFirst().get();
    }

    public Song get(int index) {
        return songList.get(index);
    }

    private boolean exists(final String songName) {
        return songList.stream().anyMatch(song -> song.getName().equalsIgnoreCase(songName));
    }

    public void add(Song song) {
        songList.add(song);
    }
}
