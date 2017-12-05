package com.svqjug.java101.chapter11.musicplayer.mp3;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.svqjug.java101.chapter11.musicplayer.MusicPlayer;

public class Mp3MusicPlayerTests {

	@Test
	public void givenNullSongShallThrowFileNotFoundException() {
		// arrange
		final MusicPlayer mp3Player = new Mp3MusicPlayer();
		final String songPath = null;
		// act

		// assert
		assertThat(mp3Player.isSongLoaded(), is(false));
	}

	@Test
	public void givenEmptySongShallThrowFileNotFoundException() {
		// arrange
		final MusicPlayer mp3Player = new Mp3MusicPlayer();
		final String songPath = "";
		// act

		// assert
		assertThat(mp3Player.isSongLoaded(), is(false));
	}

	@Test
	public void givenPlayWithMp3SongShallPlayIt() {
		// arrange
		final String songPath = "test.mp3";
		// act
		final MusicPlayer mp3Player = new Mp3MusicPlayer();

		// assert
		assertThat(mp3Player.isSongPlayed(), is(true));
	}
}
