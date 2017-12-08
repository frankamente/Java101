package com.svqjug.java101.chapter11.musicplayer;

import com.svqjug.java101.chapter11.medialibrary.Playlist;
import com.svqjug.java101.chapter11.medialibrary.Song;
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
		Song testSong = SongsFactory.getSong();
        Playlist.MY_PLAYLIST.add(testSong);
		final String songName = testSong.getName();
		// Act
		musicPlayer.play(songName);
		//Assert
		musicPlayer.getCurrentSong().equals(testSong);
	}

    @Test(expected = MusicPlayerException.class)
    public void givenNotExistingIndexSongShallThrowMusicPlayerException() {
        // Arrange
        final MusicPlayer musicPlayer = new MusicPlayer();
        final int songPosition = 1;
        // Act
        musicPlayer.play(songPosition);
    }

    @Test(expected = PlaylistException.class)
    public void givenNoSongPreviousShallThrowPlaylistException() {
        // Arrange
        final MusicPlayer musicPlayer = new MusicPlayer();
        // Act
        musicPlayer.previous();
    }
}