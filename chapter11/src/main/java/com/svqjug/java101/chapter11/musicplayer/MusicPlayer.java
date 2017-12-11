package com.svqjug.java101.chapter11.musicplayer;

import com.svqjug.java101.chapter11.playlist.Playlist;
import com.svqjug.java101.chapter11.playlist.Song;

public class MusicPlayer {

	private final Playlist playlist;
	private Song currentSong;
	private final boolean repeat = false;

	public MusicPlayer() {
		playlist = Playlist.MY_PLAYLIST;
	}

	public Song getCurrentSong() {
		return currentSong;
	}

	public void play(String songName) throws MusicPlayerException {
		// Look for the song in the playlist, set it as current song and play it
		if (songName == null) {
			throw new MusicPlayerException("Can't play null song");

		}
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

	public boolean isRepeat() {
		return repeat;
	}

	public void repeat(Song testSong) throws MusicPlayerSongException {
		// Check if song exists in playlist, then set repeat as true, set the song as
		// current song and play it

	}
}
