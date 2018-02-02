package com.svqjug.java101.chapter15;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ShoeBoxesTests {

	@Test
	public void givenNewWardrobeShoeBoxesShouldBeEmpty() {
		// Arrange
		Wardrobe wardrobe = new Wardrobe();
		// Act

		// Assert
		assertThat(wardrobe.getNumberOfShoeBoxes(), is(0));
	}

	@Test
	public void givenOneShoeBoxShouldContainIt() {
		// Arrange
		Wardrobe wardrobe = new Wardrobe();
		ShoeBox box = new ShoeBox("NB");
		// Act
		wardrobe.add(box);
		// Assert
		assertThat(wardrobe.getNumberOfShoeBoxes(), is(1));
		assertThat(wardrobe.contains(box), is(true));
	}

	@Test
	public void givenTheSameShoeBoxTwoTimesShouldContainItOnce() {
		// Arrange
		Wardrobe wardrobe = new Wardrobe();
		ShoeBox box = new ShoeBox("NB");
		// Act
		wardrobe.add(box);
		wardrobe.add(box);
		// Assert
		assertThat(wardrobe.getNumberOfShoeBoxes(), is(1));
		assertThat(wardrobe.contains(box), is(true));
	}

	@Test
	public void givenTwoShoeBoxesShouldContainThem() {
		// Arrange
		Wardrobe wardrobe = new Wardrobe();
		ShoeBox nbBox = new ShoeBox("NB");
		ShoeBox clarksBox = new ShoeBox("Clarks");
		// Act
		wardrobe.add(nbBox);
		wardrobe.add(clarksBox);
		// Assert
		assertThat(wardrobe.getNumberOfShoeBoxes(), is(2));
		assertThat(wardrobe.contains(nbBox), is(true));
		assertThat(wardrobe.contains(clarksBox), is(true));
	}

	@Test
	public void givenNullShoeBoxShouldDoNothing() {
		// Arrange
		Wardrobe wardrobe = new Wardrobe();
		ShoeBox nullBox = null;
		// Act
		wardrobe.add(nullBox);
		// Assert
		assertThat(wardrobe.getNumberOfShoeBoxes(), is(0));
		assertThat(wardrobe.contains(nullBox), is(false));
	}

	@Test
	public void givenTwoBoxesWithTheSameShoesShouldContainOnlyOne() {
		// Arrange
		Wardrobe wardrobe = new Wardrobe();
		ShoeBox nb1Box = new ShoeBox("NB");
		ShoeBox nb2Box = new ShoeBox("NB");
		// Act
		wardrobe.add(nb1Box);
		wardrobe.add(nb2Box);
		// Assert
		assertThat(wardrobe.getNumberOfShoeBoxes(), is(1));
		assertThat(wardrobe.contains(nb1Box), is(true));
		assertThat(wardrobe.contains(nb2Box), is(true));
	}
}
