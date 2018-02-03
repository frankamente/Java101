package com.svqjug.java101.chapter15;

import org.junit.Test;

import java.util.Optional;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ShirtsBarTests {

	@Test
    public void givenNewClosetShirtsBarShouldBeEmpty() {
		// Arrange
        Closet closet = new Closet();
		// Act

		// Assert
        assertThat(closet.getNumberOfShirts(), is(0));
	}

	@Test
	public void givenOneShirtShouldContainIt() {
		// Arrange
        Closet closet = new Closet();
		Shirt shirt = new Shirt("Oxford");
		// Act
        closet.add(shirt);
		// Assert
        assertThat(closet.getNumberOfShirts(), is(1));
        assertThat(closet.contains(shirt), is(true));
	}

	@Test
	public void givenTheSameShirtTwoTimesShouldContainItOnce() {
		// Arrange
        Closet closet = new Closet();
		Shirt shirt = new Shirt("Oxford");
		// Act
        closet.add(shirt);
        closet.add(shirt);
		// Assert
        assertThat(closet.getNumberOfShirts(), is(1));
        assertThat(closet.contains(shirt), is(true));
	}

	@Test
	public void givenTwoShirtsShouldContainThem() {
		// Arrange
        Closet closet = new Closet();
		Shirt oxfordShirt = new Shirt("Oxford");
		Shirt slimFitShirt = new Shirt("Slim fit");
		// Act
        closet.add(oxfordShirt);
        closet.add(slimFitShirt);
		// Assert
        assertThat(closet.getNumberOfShirts(), is(2));
        assertThat(closet.contains(oxfordShirt), is(true));
        assertThat(closet.contains(slimFitShirt), is(true));
	}

	@Test
	public void givenNullShirtShouldDoNothing() {
		// Arrange
        Closet closet = new Closet();
		Shirt nullShirt = null;
		// Act
        closet.add(nullShirt);
		// Assert
        assertThat(closet.getNumberOfShirts(), is(0));
        assertThat(closet.contains(nullShirt), is(false));
	}

	@Test
	public void givenTwoShirtsWithTheSameDescriptionShouldContainOnlyOne() {
		// Arrange
        Closet closet = new Closet();
		Shirt oxfordShirt1 = new Shirt("Oxford");
		Shirt oxfordShirt2 = new Shirt("Oxford");
		// Act
        closet.add(oxfordShirt1);
        closet.add(oxfordShirt2);
        // Assert
        assertThat(closet.getNumberOfShirts(), is(1));
        assertThat(closet.contains(oxfordShirt1), is(true));
        assertThat(closet.contains(oxfordShirt2), is(true));
    }

    @Test
    public void givenNoShirtFirstShirtShouldBeEmpty() {
        // Arrange
        Closet closet = new Closet();
        //Act
        Optional<Shirt> shirt = closet.getFirstShirt();
        //Assert
        assertThat(shirt.isPresent(), is(false));
    }

    @Test
    public void givenNoShirtLastShirtShouldBeEmpty() {
        // Arrange
        Closet closet = new Closet();
        //Act
        Optional<Shirt> shirt = closet.getLastShirt();
        //Assert
        assertThat(shirt.isPresent(), is(false));
    }

	@Test
	public void givenTwoShirtsWithDifferentDescriptionShouldContainThemAlphabeticallyOrdered() {
		// Arrange
        Closet closet = new Closet();
		Shirt slimFitShirt = new Shirt("Slim fit");
		Shirt oxfordShirt = new Shirt("Oxford");
		// Act
        closet.add(slimFitShirt);
        closet.add(oxfordShirt);
		// Assert
        assertThat(closet.getNumberOfShirts(), is(2));
        assertThat(closet.contains(slimFitShirt), is(true));
        assertThat(closet.contains(oxfordShirt), is(true));
        assertThat(closet.getFirstShirt().get(), is(oxfordShirt));
        assertThat(closet.getLastShirt().get(), is(slimFitShirt));
    }

    @Test
    public void givenTwoShirtsLowerToFirstShouldBeTheLast() {
        // Arrange
        Closet closet = new Closet();
        Shirt slimFitShirt = new Shirt("Slim fit");
        Shirt oxfordShirt = new Shirt("Oxford");
        // Act
        closet.add(slimFitShirt);
        closet.add(oxfordShirt);
        //Assert
        assertThat(closet.getNumberOfShirts(), is(2));
        Shirt first = closet.getFirstShirt().get();
        Shirt last = closet.getLastShirt().get();
        assertThat(closet.getShirts().tailSet(first, false).contains(last), is(true));
    }

    @Test
    public void givenTwoShirtsHigherToLastShouldBeTheFirst() {
        // Arrange
        Closet closet = new Closet();
        Shirt slimFitShirt = new Shirt("Slim fit");
        Shirt oxfordShirt = new Shirt("Oxford");
        // Act
        closet.add(slimFitShirt);
        closet.add(oxfordShirt);
        //Assert
        assertThat(closet.getNumberOfShirts(), is(2));
        Shirt first = closet.getFirstShirt().get();
        Shirt last = closet.getLastShirt().get();
        assertThat(closet.getShirts().headSet(last, false).contains(first), is(true));
    }
}
