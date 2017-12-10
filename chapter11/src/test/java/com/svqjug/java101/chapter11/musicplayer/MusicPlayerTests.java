package com.svqjug.java101.chapter11.musicplayer;

import com.svqjug.java101.chapter11.playlist.Playlist;
import com.svqjug.java101.chapter11.playlist.PlaylistException;
import com.svqjug.java101.chapter11.playlist.Song;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertThat;

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

    @Test(expected =  IndexOutOfBoundsException.class)
    public void givenNotExistingIndexSongShallThrowIndexOutOfBoundsException() {
        // Arrange
        final MusicPlayer musicPlayer = new MusicPlayer();
        final int songPosition = 1;
        // Act
        musicPlayer.play(songPosition);
    }

    @Test(expected = InvalidOperationException.class)
    public void givenNoSongPreviousShallThrowPlaylistException() {
        // Arrange
        final MusicPlayer musicPlayer = new MusicPlayer();
        // Act
        musicPlayer.previous();
    }

    @Test
    public void givenLastSongNextShallSetCurrentSongAsNull() {
        // Arrange
        final MusicPlayer musicPlayer = new MusicPlayer();
        Song testSong = SongsFactory.getSong();
        Playlist.MY_PLAYLIST.add(testSong);
        musicPlayer.play(testSong.getName());
        // Act
        musicPlayer.next();
        //Assert
        assertThat(musicPlayer.getCurrentSong(), is(nullValue()));
    }

    @Test(expected = MusicPlayerException.class)
    public void givenNoSongPauseShallThrowMusicPlayerException() {
        // Arrange
        final MusicPlayer musicPlayer = new MusicPlayer();
        // Act
        musicPlayer.pause();
    }

    @Test(expected = InvalidOperationException.class)
    public void givenPausedSongPauseShallThrowInvalidOperationException() {
        //Arrange
	    final MusicPlayer musicPlayer = new MusicPlayer();
        Song testSong = SongsFactory.getSong();
        Playlist.MY_PLAYLIST.add(testSong);
        musicPlayer.play(testSong.getName());
        musicPlayer.pause();
        //Act
        musicPlayer.pause();
    }
}