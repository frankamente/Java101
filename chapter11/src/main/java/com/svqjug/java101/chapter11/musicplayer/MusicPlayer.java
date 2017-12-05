package com.svqjug.java101.chapter11.musicplayer;

import java.io.FileNotFoundException;

public interface MusicPlayer extends AutoCloseable {

	void loadSong(String filePath) throws FileNotFoundException;

	void unloadSong();

	void play();

	void stop();

	void pause();

	void rewind();

	Boolean isSongLoaded();

	Boolean isSongPlayed();

	@Override
	void close();
}
