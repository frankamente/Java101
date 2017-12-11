package com.svqjug.java101.chapter11.playlist;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum Playlist {
	MY_PLAYLIST(new ArrayList<Song>());

	private final List<Song> songList;

	private Playlist(List<Song> songs) {
		songList = songs;
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

	public int position(Song song) {
		return songList.indexOf(song);
	}

	private boolean exists(final String songName) {
		return songList.stream().anyMatch(song -> song.getName().equalsIgnoreCase(songName));
	}

	public void add(Song song) {
		songList.add(song);
	}

	public void shuffle() throws PlaylistException {
		if (songList.isEmpty()) {
			throw new PlaylistException("Can't shuffle empty playlist");
		}
		if (songList.size() == 1) {
			throw new PlaylistShuffleException("Can't shuffle a playlist with one song");
		}
		Collections.shuffle(songList);
	}
}
