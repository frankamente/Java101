package com.svqjug.java101.chapter11.musicplayer.mp3;

import java.io.FileNotFoundException;

import com.svqjug.java101.chapter11.musicplayer.MusicPlayer;

public class Mp3MusicPlayer implements MusicPlayer, AutoCloseable {

	private static final char FILE_EXTENSION_SEPARATOR = '.';
	private static final String MP3_FILE_EXTENSION = "mp3";
	private boolean songLoaded = false;
	private String songPath = null;
	private boolean songPlayed = false;

	@Override
	public void loadSong(String songPath) throws FileNotFoundException {
		if (songPath == null || songPath.trim().length() == 0) {
			throw new FileNotFoundException("Can't load a null or empty song");
		}
		this.songPath = songPath;
		songLoaded = true;
	}

	@Override
	public void unloadSong() {
		songPath = null;
		songLoaded = false;
		songPlayed = false;
	}

	@Override
	public void play() {
		if (!MP3_FILE_EXTENSION.equalsIgnoreCase(getSongExtension())) {
			throw new IllegalStateException("Can't play non-mp3 song: " + songPath);
		}
		System.out.println("Playing: " + songPath);
		songPlayed = true;
	}

	private String getSongExtension() {
		return songPath.substring(getSongPathLastPoint() + 1);
	}

	private int getSongPathLastPoint() {
		return songPath.lastIndexOf(FILE_EXTENSION_SEPARATOR);
	}

	@Override
	public void stop() {

	}

	@Override
	public void pause() {

	}

	@Override
	public void rewind() {

	}

	@Override
	public boolean isSongLoaded() {
		return songLoaded;
	}

	@Override
	public void close() {
		unloadSong();
	}

	@Override
	public boolean isSongPlayed() {
		return songPlayed;
	}

}
