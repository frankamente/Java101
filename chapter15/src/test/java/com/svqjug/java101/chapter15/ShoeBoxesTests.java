package com.svqjug.java101.chapter15;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ShoeBoxesTests {

	@Test
	public void givenNewWardrobeShoeBoxesShouldBeEmpty() {
		// Arrange
		Closet closet = new Closet();
		// Act

		// Assert
		assertThat(closet.getShoeBoxes().size(), is(0));
	}

	@Test
	public void givenOneShoeBoxShouldContainIt() {
		// Arrange
		Closet closet = new Closet();
		ShoeBox box = new ShoeBox("NB");
		// Act
		closet.add(box);
		// Assert
		assertThat(closet.getShoeBoxes().size(), is(1));
		assertThat(closet.contains(box), is(true));
	}

	@Test
	public void givenTheSameShoeBoxTwoTimesShouldContainItOnce() {
		// Arrange
		Closet closet = new Closet();
		ShoeBox box = new ShoeBox("NB");
		// Act
		closet.add(box);
		closet.add(box);
		// Assert
		assertThat(closet.getShoeBoxes().size(), is(1));
		assertThat(closet.contains(box), is(true));
	}

	@Test
	public void givenTwoShoeBoxesShouldContainThem() {
		// Arrange
		Closet closet = new Closet();
		ShoeBox nbBox = new ShoeBox("NB");
		ShoeBox clarksBox = new ShoeBox("Clarks");
		// Act
		closet.add(nbBox);
		closet.add(clarksBox);
		// Assert
		assertThat(closet.getShoeBoxes().size(), is(2));
		assertThat(closet.contains(nbBox), is(true));
		assertThat(closet.contains(clarksBox), is(true));
	}
}
