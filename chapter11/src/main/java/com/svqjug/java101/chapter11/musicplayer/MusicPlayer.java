package com.svqjug.java101.chapter11.musicplayer;

import com.svqjug.java101.chapter11.medialibrary.Playlist;
import com.svqjug.java101.chapter11.medialibrary.Song;

public class MusicPlayer {

	private final Playlist playlist;
	private Song currentSong;

	public MusicPlayer() {
		playlist = Playlist.MY_PLAYLIST;
	}

    public Song getCurrentSong() {
        return currentSong;
    }

	public void play(String songName) {

	}

	public void play(int songPosition) {

	}

	public void previous() {

	}
}
