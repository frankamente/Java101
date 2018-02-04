package com.svqjug.java101.chapter15;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class UnderwearDrawerTests {

    private UnderwearDrawer underwearDrawer;

    @Before
    public void setUp() {
        underwearDrawer = new UnderwearDrawer();
    }

    @Test
    public void givenNewClosetUnderwerDrawerShouldBeEmpty() {
        // Arrange
        // Act
        // Assert
        assertThat(underwearDrawer.getNumberOfUnderwearPieces(), is(0));
    }

    @Test
    public void givenOneUnderwearPieceShouldContainIt() {
        // Arrange
        Underwear underwear = new Underwear("good one");
        // Act
        underwearDrawer.add(underwear);
        // Assert
        assertThat(underwearDrawer.getNumberOfUnderwearPieces(), is(1));
        assertThat(underwearDrawer.contains(underwear), is(true));
    }

    @Test
    public void givenTheSameUnderwearPieceTwoTimesShouldContainItTwoTimes() {
        // Arrange
        Underwear underwear = new Underwear("good ones");
        // Act
        underwearDrawer.add(underwear);
        underwearDrawer.add(underwear);
        // Assert
        assertThat(underwearDrawer.getNumberOfUnderwearPieces(), is(2));
        assertThat(underwearDrawer.contains(underwear), is(true));
    }

    @Test
    public void givenTwoUnderwearPiecesShouldContainThem() {
        // Arrange
        Underwear goodOne = new Underwear("good one");
        Underwear badOne = new Underwear("bad one");
        // Act
        underwearDrawer.add(goodOne);
        underwearDrawer.add(badOne);
        // Assert
        assertThat(underwearDrawer.getNumberOfUnderwearPieces(), is(2));
        assertThat(underwearDrawer.contains(goodOne), is(true));
        assertThat(underwearDrawer.contains(badOne), is(true));
    }

    @Test
    public void givenThreeUnderwearPiecesShouldAccessThemByIndex() {
        // Arrange
        Underwear firstOne = new Underwear("first");
        Underwear secondOne = new Underwear("second");
        Underwear thirdOne = new Underwear("third");
        // Act
        underwearDrawer.add(firstOne);
        underwearDrawer.add(secondOne);
        underwearDrawer.add(thirdOne);
        // Assert
        assertThat(underwearDrawer.getNumberOfUnderwearPieces(), is(3));
        assertThat(underwearDrawer.get(0).get(), is(firstOne));
        assertThat(underwearDrawer.get(1).get(), is(secondOne));
        assertThat(underwearDrawer.get(2).get(), is(thirdOne));
    }

    @Test
    public void givenNotValidPositionShouldReturnNothing() {
        // Arrange
        Underwear firstOne = new Underwear("first");
        // Act
        underwearDrawer.add(firstOne);
        // Assert
        assertThat(underwearDrawer.getNumberOfUnderwearPieces(), is(1));
        assertThat(underwearDrawer.get(underwearDrawer.getNumberOfUnderwearPieces()).isPresent(), is(false));
    }

    @Test
    public void givenTwoUnderwearPiecesShouldInsertOneInTheMiddleByPosition() {
        // Arrange
        Underwear firstOne = new Underwear("first");
        Underwear secondOne = new Underwear("second");
        Underwear thirdOne = new Underwear("third");
        // Act
        underwearDrawer.add(firstOne);
        underwearDrawer.add(secondOne);
        underwearDrawer.add(thirdOne, 1);
        // Assert
        assertThat(underwearDrawer.getNumberOfUnderwearPieces(), is(3));
        assertThat(underwearDrawer.get(0).get(), is(firstOne));
        assertThat(underwearDrawer.get(1).get(), is(thirdOne));
        assertThat(underwearDrawer.get(2).get(), is(secondOne));
    }
}
