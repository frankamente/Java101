package com.svqjug.java101.chapter11.musicplayer;

import com.svqjug.java101.chapter11.playlist.Song;

public class MusicPlayerSongException extends MusicPlayerException {

	private final Song song;

	public MusicPlayerSongException(String message, Song song) {
		super(message);
		this.song = song;
	}

	public Song getSong() {
		return song;
	}

}
