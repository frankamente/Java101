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

    @Test
    public void givenOneUnderwearPieceShouldContainIt() {
        // Arrange
        Closet closet = new Closet();
        Underwear underwear = new Underwear("good one");
        // Act
        closet.add(underwear);
        // Assert
        assertThat(closet.getNumberOfUnderwearPieces(), is(1));
        assertThat(closet.contains(underwear), is(true));
    }

    @Test
    public void givenTheSameUnderwearPieceTwoTimesShouldContainItTwoTimes() {
        // Arrange
        Closet closet = new Closet();
        Underwear underwear = new Underwear("good ones");
        // Act
        closet.add(underwear);
        closet.add(underwear);
        // Assert
        assertThat(closet.getNumberOfUnderwearPieces(), is(2));
        assertThat(closet.contains(underwear), is(true));
    }

    @Test
    public void givenTwoUnderwearPiecesShouldContainThem() {
        // Arrange
        Closet closet = new Closet();
        Underwear goodOne = new Underwear("good one");
        Underwear badOne = new Underwear("bad one");
        // Act
        closet.add(goodOne);
        closet.add(badOne);
        // Assert
        assertThat(closet.getNumberOfUnderwearPieces(), is(2));
        assertThat(closet.contains(goodOne), is(true));
        assertThat(closet.contains(badOne), is(true));
    }

    @Test
    public void givenThreeUnderwearPiecesShouldAccessThemByIndex() {
        // Arrange
        Closet closet = new Closet();
        Underwear firstOne = new Underwear("first");
        Underwear secondOne = new Underwear("second");
        Underwear thirdOne = new Underwear("third");
        // Act
        closet.add(firstOne);
        closet.add(secondOne);
        closet.add(thirdOne);
        // Assert
        assertThat(closet.getNumberOfUnderwearPieces(), is(3));
        assertThat(closet.getUnderwearPiece(0).get(), is(firstOne));
        assertThat(closet.getUnderwearPiece(1).get(), is(secondOne));
        assertThat(closet.getUnderwearPiece(2).get(), is(thirdOne));
    }

    @Test
    public void givenNotValidPositionShouldReturnNothing() {
        // Arrange
        Closet closet = new Closet();
        Underwear firstOne = new Underwear("first");
        // Act
        closet.add(firstOne);
        // Assert
        assertThat(closet.getNumberOfUnderwearPieces(), is(1));
        assertThat(closet.getUnderwearPiece(closet.getNumberOfUnderwearPieces()).isPresent(), is(false));
    }

    @Test
    public void givenTwoUnderwearPiecesShouldInsertOneInTheMiddleByPosition() {
        // Arrange
        Closet closet = new Closet();
        Underwear firstOne = new Underwear("first");
        Underwear secondOne = new Underwear("second");
        Underwear thirdOne = new Underwear("third");
        // Act
        closet.add(firstOne);
        closet.add(secondOne);
        closet.add(thirdOne, 1);
        // Assert
        assertThat(closet.getNumberOfUnderwearPieces(), is(3));
        assertThat(closet.getUnderwearPiece(0).get(), is(firstOne));
        assertThat(closet.getUnderwearPiece(1).get(), is(thirdOne));
        assertThat(closet.getUnderwearPiece(2).get(), is(secondOne));
    }
}
