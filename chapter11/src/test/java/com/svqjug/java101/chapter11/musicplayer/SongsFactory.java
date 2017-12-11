package com.svqjug.java101.chapter11.musicplayer;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import com.svqjug.java101.chapter11.playlist.Song;

public class SongsFactory {

	private static Set<Song> songs;

	static {
		songs = new HashSet<>();
		songs.add(new Song("Evil Urges", "Evil Urges", "My Morning Jacket"));
		songs.add(new Song("Seven Nation Army", "Elephant", "The White Stripes"));
		songs.add(new Song("Everlong", "The Colour and the Shape", "Foo Fighters"));
		songs.add(new Song("Interstate Lovesong", "Purple", "Stone Temple Pilots"));
		songs.add(new Song("En mis venas", "Santacruz", "Supersubmarina"));
		songs.add(new Song("1979", "Mellon Collie and the Infinite Sadness - Twilight to Starlight",
				"The Smashing Pumpkins"));
	}

	public static Song getSong() {
		final Random rnd = new Random();
		final int i = rnd.nextInt(songs.size());
		return (Song) songs.toArray()[i];
	}
}
