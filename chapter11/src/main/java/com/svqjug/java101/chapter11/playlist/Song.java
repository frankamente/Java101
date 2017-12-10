package com.svqjug.java101.chapter11.playlist;

import java.util.Objects;

public class Song {

    private final String artist;

    private final String album;

    private final String name;

    private boolean paused;

    public Song(String artist, String album, String name) {
        this.artist = artist;
        this.album = album;
        this.name = name;
        this.paused = false;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }

    public String getName() {
        return name;
    }

    public boolean isPaused() {
        return paused;
    }

    public void play() {
        System.out.println("Playing " + this);
    }

    public void stop() {
        System.out.println("Stopped " + this);
    }

    public void pause() {
        if (!paused) {
            System.out.println("Paused " + this);
        }
    }

    public void resume() {
        if (paused) {
            System.out.println("Resuming " + this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return Objects.equals(artist, song.artist) &&
                Objects.equals(album, song.album) &&
                Objects.equals(name, song.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artist, album, name);
    }

    @Override
    public String toString() {
        return "Song{" +
                "artist='" + artist + '\'' +
                ", album='" + album + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
