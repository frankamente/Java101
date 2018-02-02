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
<<<<<<< HEAD
		assertThat(wardrobe.getNumberOfShoeBoxes(), is(0));
=======
		assertThat(closet.getShoeBoxes().size(), is(0));
>>>>>>> 497c4161eb01826f41fb09b9bf2d15acaf78c601
	}

	@Test
	public void givenOneShoeBoxShouldContainIt() {
		// Arrange
		Closet closet = new Closet();
		ShoeBox box = new ShoeBox("NB");
		// Act
		closet.add(box);
		// Assert
<<<<<<< HEAD
		assertThat(wardrobe.getNumberOfShoeBoxes(), is(1));
		assertThat(wardrobe.contains(box), is(true));
=======
		assertThat(closet.getShoeBoxes().size(), is(1));
		assertThat(closet.contains(box), is(true));
>>>>>>> 497c4161eb01826f41fb09b9bf2d15acaf78c601
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
<<<<<<< HEAD
		assertThat(wardrobe.getNumberOfShoeBoxes(), is(1));
		assertThat(wardrobe.contains(box), is(true));
=======
		assertThat(closet.getShoeBoxes().size(), is(1));
		assertThat(closet.contains(box), is(true));
>>>>>>> 497c4161eb01826f41fb09b9bf2d15acaf78c601
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
<<<<<<< HEAD
		assertThat(wardrobe.getNumberOfShoeBoxes(), is(2));
		assertThat(wardrobe.contains(nbBox), is(true));
		assertThat(wardrobe.contains(clarksBox), is(true));
=======
		assertThat(closet.getShoeBoxes().size(), is(2));
		assertThat(closet.contains(nbBox), is(true));
		assertThat(closet.contains(clarksBox), is(true));
>>>>>>> 497c4161eb01826f41fb09b9bf2d15acaf78c601
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
