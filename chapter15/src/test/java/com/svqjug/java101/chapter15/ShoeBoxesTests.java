package com.svqjug.java101.chapter15;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ShoeBoxesTests {

	@Test
	public void givenNewWardrobeShoeBoxesShouldBeEmpty() {
		// Arrange
		Closet closet = new Closet();
		// Act

		// Assert
        assertThat(closet.getNumberOfShoeBoxes(), is(0));
	}

	@Test
	public void givenOneShoeBoxShouldContainIt() {
		// Arrange
		Closet closet = new Closet();
		ShoeBox box = new ShoeBox("NB");
		// Act
		closet.add(box);
		// Assert
        assertThat(closet.getNumberOfShoeBoxes(), is(1));
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
        assertThat(closet.getNumberOfShoeBoxes(), is(1));
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
        assertThat(closet.getNumberOfShoeBoxes(), is(2));
		assertThat(closet.contains(nbBox), is(true));
		assertThat(closet.contains(clarksBox), is(true));
	}

	@Test
	public void givenNullShoeBoxShouldDoNothing() {
		// Arrange
        Closet closet = new Closet();
		ShoeBox nullBox = null;
		// Act
        closet.add(nullBox);
		// Assert
        assertThat(closet.getNumberOfShoeBoxes(), is(0));
        assertThat(closet.contains(nullBox), is(false));
	}

	@Test
	public void givenTwoBoxesWithTheSameShoesShouldContainOnlyOne() {
		// Arrange
        Closet closet = new Closet();
		ShoeBox nb1Box = new ShoeBox("NB");
		ShoeBox nb2Box = new ShoeBox("NB");
		// Act
        closet.add(nb1Box);
        closet.add(nb2Box);
		// Assert
        assertThat(closet.getNumberOfShoeBoxes(), is(1));
        assertThat(closet.contains(nb1Box), is(true));
        assertThat(closet.contains(nb2Box), is(true));
	}
}
