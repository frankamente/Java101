package com.svqjug.java101.chapter15;

import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ShirtsBarTests {

    private ShirtsBar shirtsBar;

    @Before
    public void setUp() {
        shirtsBar = new ShirtsBar();
    }

	@Test
    public void givenNewClosetShirtsBarShouldBeEmpty() {
		// Arrange
		// Act
		// Assert
        assertThat(shirtsBar.size(), is(0));
	}

	@Test
	public void givenOneShirtShouldContainIt() {
		// Arrange
		Shirt shirt = new Shirt("Oxford");
		// Act
        shirtsBar.add(shirt);
		// Assert
        assertThat(shirtsBar.size(), is(1));
        assertThat(shirtsBar.contains(shirt), is(true));
	}

	@Test
	public void givenTheSameShirtTwoTimesShouldContainItOnce() {
		// Arrange
		Shirt shirt = new Shirt("Oxford");
		// Act
        shirtsBar.add(shirt);
        shirtsBar.add(shirt);
		// Assert
        assertThat(shirtsBar.size(), is(1));
        assertThat(shirtsBar.contains(shirt), is(true));
	}

	@Test
	public void givenTwoShirtsShouldContainThem() {
		// Arrange
		Shirt oxfordShirt = new Shirt("Oxford");
		Shirt slimFitShirt = new Shirt("Slim fit");
		// Act
        shirtsBar.add(oxfordShirt);
        shirtsBar.add(slimFitShirt);
		// Assert
        assertThat(shirtsBar.size(), is(2));
        assertThat(shirtsBar.contains(oxfordShirt), is(true));
        assertThat(shirtsBar.contains(slimFitShirt), is(true));
	}

	@Test
	public void givenNullShirtShouldDoNothing() {
		// Arrange
		Shirt nullShirt = null;
		// Act
        shirtsBar.add(nullShirt);
		// Assert
        assertThat(shirtsBar.size(), is(0));
        assertThat(shirtsBar.contains(nullShirt), is(false));
	}

	@Test
	public void givenTwoShirtsWithTheSameDescriptionShouldContainOnlyOne() {
		// Arrange
		Shirt oxfordShirt1 = new Shirt("Oxford");
		Shirt oxfordShirt2 = new Shirt("Oxford");
		// Act
        shirtsBar.add(oxfordShirt1);
        shirtsBar.add(oxfordShirt2);
        // Assert
        assertThat(shirtsBar.size(), is(1));
        assertThat(shirtsBar.contains(oxfordShirt1), is(true));
        assertThat(shirtsBar.contains(oxfordShirt2), is(true));
    }

    @Test
    public void givenNoShirtFirstShirtShouldBeEmpty() {
        // Arrange
        //Act
        Optional<Shirt> shirt = shirtsBar.getFirstShirt();
        //Assert
        assertThat(shirt.isPresent(), is(false));
    }

    @Test
    public void givenNoShirtLastShirtShouldBeEmpty() {
        // Arrange
        //Act
        Optional<Shirt> shirt = shirtsBar.getLastShirt();
        //Assert
        assertThat(shirt.isPresent(), is(false));
    }

	@Test
	public void givenTwoShirtsWithDifferentDescriptionShouldContainThemAlphabeticallyOrdered() {
		// Arrange
		Shirt slimFitShirt = new Shirt("Slim fit");
		Shirt oxfordShirt = new Shirt("Oxford");
		// Act
        shirtsBar.add(slimFitShirt);
        shirtsBar.add(oxfordShirt);
		// Assert
        assertThat(shirtsBar.size(), is(2));
        assertThat(shirtsBar.contains(slimFitShirt), is(true));
        assertThat(shirtsBar.contains(oxfordShirt), is(true));
        assertThat(shirtsBar.getFirstShirt().get(), is(oxfordShirt));
        assertThat(shirtsBar.getLastShirt().get(), is(slimFitShirt));
    }

    @Test
    public void givenTwoShirtsLowerToFirstShouldBeTheLast() {
        // Arrange
        Shirt slimFitShirt = new Shirt("Slim fit");
        Shirt oxfordShirt = new Shirt("Oxford");
        // Act
        shirtsBar.add(slimFitShirt);
        shirtsBar.add(oxfordShirt);
        //Assert
        assertThat(shirtsBar.size(), is(2));
        Shirt first = shirtsBar.getFirstShirt().get();
        Shirt last = shirtsBar.getLastShirt().get();
        assertThat(shirtsBar.getShirts().tailSet(first, false).contains(last), is(true));
    }

    @Test
    public void givenTwoShirtsHigherToLastShouldBeTheFirst() {
        // Arrange
        Shirt slimFitShirt = new Shirt("Slim fit");
        Shirt oxfordShirt = new Shirt("Oxford");
        // Act
        shirtsBar.add(slimFitShirt);
        shirtsBar.add(oxfordShirt);
        //Assert
        assertThat(shirtsBar.size(), is(2));
        Shirt first = shirtsBar.getFirstShirt().get();
        Shirt last = shirtsBar.getLastShirt().get();
        assertThat(shirtsBar.getShirts().headSet(last, false).contains(first), is(true));
    }
}
