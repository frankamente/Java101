package com.svqjug.java101.chapter15;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ShirtsBarTests {

	@Test
	public void givenNewWardrobeShirtsBarShouldBeEmpty() {
		// Arrange
		Wardrobe wardrobe = new Wardrobe();
		// Act

		// Assert
		assertThat(wardrobe.getNumberOfShirts(), is(0));
	}

	@Test
	public void givenOneShirtShouldContainIt() {
		// Arrange
		Wardrobe wardrobe = new Wardrobe();
		Shirt shirt = new Shirt("Oxford");
		// Act
		wardrobe.add(shirt);
		// Assert
		assertThat(wardrobe.getNumberOfShirts(), is(1));
		assertThat(wardrobe.contains(shirt), is(true));
	}

	@Test
	public void givenTheSameShirtTwoTimesShouldContainItOnce() {
		// Arrange
		Wardrobe wardrobe = new Wardrobe();
		Shirt shirt = new Shirt("Oxford");
		// Act
		wardrobe.add(shirt);
		wardrobe.add(shirt);
		// Assert
		assertThat(wardrobe.getNumberOfShirts(), is(1));
		assertThat(wardrobe.contains(shirt), is(true));
	}

	@Test
	public void givenTwoShirtsShouldContainThem() {
		// Arrange
		Wardrobe wardrobe = new Wardrobe();
		Shirt oxfordShirt = new Shirt("Oxford");
		Shirt slimFitShirt = new Shirt("Slim fit");
		// Act
		wardrobe.add(oxfordShirt);
		wardrobe.add(slimFitShirt);
		// Assert
		assertThat(wardrobe.getNumberOfShirts(), is(2));
		assertThat(wardrobe.contains(oxfordShirt), is(true));
		assertThat(wardrobe.contains(slimFitShirt), is(true));
	}

	@Test
	public void givenNullShirtShouldDoNothing() {
		// Arrange
		Wardrobe wardrobe = new Wardrobe();
		Shirt nullShirt = null;
		// Act
		wardrobe.add(nullShirt);
		// Assert
		assertThat(wardrobe.getNumberOfShirts(), is(0));
		assertThat(wardrobe.contains(nullShirt), is(false));
	}

	@Test
	public void givenTwoShirtsWithTheSameDescriptionShouldContainOnlyOne() {
		// Arrange
		Wardrobe wardrobe = new Wardrobe();
		Shirt oxfordShirt1 = new Shirt("Oxford");
		Shirt oxfordShirt2 = new Shirt("Oxford");
		// Act
		wardrobe.add(oxfordShirt1);
		wardrobe.add(oxfordShirt2);
		// Assert
		assertThat(wardrobe.getNumberOfShirts(), is(1));
		assertThat(wardrobe.contains(oxfordShirt1), is(true));
		assertThat(wardrobe.contains(oxfordShirt2), is(true));
	}

	@Test
	public void givenTwoShirtsWithDifferentDescriptionShouldContainThemAlphabeticallyOrdered() {
		// Arrange
		Wardrobe wardrobe = new Wardrobe();
		Shirt slimFitShirt = new Shirt("Slim fit");
		Shirt oxfordShirt = new Shirt("Oxford");
		// Act
		wardrobe.add(slimFitShirt);
		wardrobe.add(oxfordShirt);
		// Assert
		assertThat(wardrobe.getNumberOfShirts(), is(2));
		assertThat(wardrobe.contains(slimFitShirt), is(true));
		assertThat(wardrobe.contains(oxfordShirt), is(true));
		assertThat(wardrobe.getShirts())
	}
}
