package com.svqjug.java101.chapter15;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class UnderwearDrawerTests {

    @Test
    public void givenNewClosetUnderwerDrawerShouldBeEmpty() {
        // Arrange
        Closet closet = new Closet();
        // Act

        // Assert
        assertThat(closet.getNumberOfUnderwearPieces(), is(0));
    }
}
