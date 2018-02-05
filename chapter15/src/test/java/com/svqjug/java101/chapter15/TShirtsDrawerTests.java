package com.svqjug.java101.chapter15;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;

public class TShirtsDrawerTests {

	private TShirtsDrawer tShirtsDrawer;

	@Before
	public void setUp() {
		tShirtsDrawer = new TShirtsDrawer();
	}

	@Test
	public void givenNewTShirtsDrawerShouldBeEmpty() {
		// Arrange
		// Act
		// Assert
		assertThat(tShirtsDrawer.size(), is(0));
	}

	@Test
	public void givenOneTShirtShouldContainIt() {
		// Arrange
		TShirt tshirt = new TShirt("Black one");
		// Act
		tShirtsDrawer.add(tshirt);
		// Assert
		assertThat(tShirtsDrawer.size(), is(1));
	}

	@Test
	public void givenNullTShirtShouldNotContainIt() {
		// Arrange
		TShirt tshirt = null;
		// Act
		tShirtsDrawer.add(tshirt);
		// Assert
		assertThat(tShirtsDrawer.size(), is(0));
	}

	@Test
	public void givenTwoTShirtsRemoveShouldGetTheFirstOne() {
		// Arrange
		TShirt black = new TShirt("Black one");
		TShirt grey = new TShirt("Grey one");
		tShirtsDrawer.add(black);
		tShirtsDrawer.add(grey);
		assertThat(tShirtsDrawer.size(), is(2));
		// Act
		Optional<TShirt> removed = tShirtsDrawer.remove();
		// Assert
		assertThat(tShirtsDrawer.size(), is(1));
		assertThat(removed.get(), is(black));
	}

	@Test
	public void givenNoTShirtRemoveShouldDoNothing() {
		// Arrange
		// Act
		Optional<TShirt> removed = tShirtsDrawer.remove();
		// Assert
		assertThat(removed.isPresent(), is(false));
	}
}
