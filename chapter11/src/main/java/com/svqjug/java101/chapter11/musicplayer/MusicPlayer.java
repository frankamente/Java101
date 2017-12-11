package com.svqjug.java101.chapter11.musicplayer;

import com.svqjug.java101.chapter11.playlist.Playlist;
import com.svqjug.java101.chapter11.playlist.Song;

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
		// Look for the song in the playlist, set it as current song and play it
	}

	public void play(int songPosition) {
		// Look for the song by position in the playlist, set it as current song and
		// play it
	}

	public void previous() {
		// Look for current song position, retrieve the previous one from the playlist
		// and set it as current song
	}

	public void next() {
		// Look for current song position, retrieve the next one from the playlist and
		// set it as current song
	}

	public void pause() {
		// Invoke pause on current song
	}

	public void stop() {
		// Invoke stop on current song, then set current song as null
	}

	public void shuffle() {
		// Invoke shuffle on playlist

	}
}
