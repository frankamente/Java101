package com.svqjug.java101.chapter15;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

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
        Shirt shirt = new Shirt("Oxford");
        // Act
        tShirtsDrawer.add(shirt);
        // Assert
        assertThat(tShirtsDrawer.size(), is(1));
        assertThat(tShirtsDrawer.contains(shirt), is(true));
    }

    @Test
    public void givenTheSameTShirtTwoTimesShouldContainItTwice() {
        // Arrange
        Shirt shirt = new Shirt("Oxford");
        // Act
        tShirtsDrawer.add(shirt);
        tShirtsDrawer.add(shirt);
        // Assert
        assertThat(tShirtsDrawer.size(), is(1));
        assertThat(tShirtsDrawer.contains(shirt), is(true));
    }


}
