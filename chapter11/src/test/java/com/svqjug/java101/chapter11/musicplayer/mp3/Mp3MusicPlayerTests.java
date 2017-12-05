package com.svqjug.java101.chapter11.musicplayer.mp3;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import java.io.FileNotFoundException;

import org.junit.Test;

import com.svqjug.java101.chapter11.musicplayer.MusicPlayer;

public class Mp3MusicPlayerTests {

	@Test
	public void givenNullSongLoadShallThrowFileNotFoundException() {
		// arrange
		final String songPath = null;
		final MusicPlayer mp3Player = new Mp3MusicPlayer();
		final FileNotFoundException exceptionThrown = null;
		// act

		// assert
		assertThat(exceptionThrown, is(notNullValue()));
	}

	@Test
	public void givenEmptySongLoadShallThrowFileNotFoundException() {
		// arrange
		final String songPath = "";
		final MusicPlayer mp3Player = new Mp3MusicPlayer();
		final FileNotFoundException exceptionThrown = null;
		// act

		// assert
		assertThat(exceptionThrown, is(notNullValue()));
	}

	@Test
	public void givenMp3SongShallLoadIt() {
		// arrange
		final String songPath = "";
		final MusicPlayer mp3Player = new Mp3MusicPlayer();
		// act

		// assert
		assertThat(mp3Player.isSongLoaded(), is(true));
	}

	@Test
	public void givenPlayWithMp3SongShallPlayIt() {
		// arrange
		final String songPath = "test.mp3";
		final MusicPlayer mp3Player = new Mp3MusicPlayer();
		// act

		// assert
		assertThat(mp3Player.isSongPlayed(), is(true));
	}

	@Test(expected = IllegalStateException.class)
	public void givenPlayWithOggSongShallNotPlayIt() {
		// arrange
		final String songPath = "test.ogg";
		final MusicPlayer mp3Player = new Mp3MusicPlayer();
		// act

		// assert
		assertThat(mp3Player.isSongLoaded(), is(false));
		assertThat(mp3Player.isSongPlayed(), is(false));
	}
}
