package com.svqjug.java101.chapter11.musicplayer;

import org.junit.Test;

public class MusicPlayerTests {

	@Test(expected = MusicPlayerException.class)
	public void givenNullSongShallThrowMusicPlayerException() {
		// Arrange
		final MusicPlayer musicPlayer = new MusicPlayer();

		// Act
		musicPlayer.play(null);
	}

	@Test(expected = MusicPlayerException.class)
	public void givenNotExistingSongShallThrowMusicPlayerException() {
		// Arrange
		final MusicPlayer musicPlayer = new MusicPlayer();
		final String songName = "test";
		// Act
		musicPlayer.play("test");
	}

	@Test
	public void givenExistingSongShallPlayIt() {
		// Arrange
		final MusicPlayer musicPlayer = new MusicPlayer();
		final String songName = SongsFactory.getSong().getName();
		// Act
		musicPlayer.play(songName);

	}
}