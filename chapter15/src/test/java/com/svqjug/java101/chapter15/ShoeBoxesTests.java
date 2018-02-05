package com.svqjug.java101.chapter15;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ShoeBoxesTests {

    private ShoeBoxes shoeBoxes;

    @Before
    public void setUp() {
        shoeBoxes = new ShoeBoxes();
    }
/*
	@Test
    public void givenNewShoeBoxesShouldBeEmpty() {
		// Arrange
		// Act
		// Assert
        assertThat(shoeBoxes.size(), is(0));
	}

	@Test
	public void givenOneShoeBoxShouldContainIt() {
		// Arrange
		ShoeBox box = new ShoeBox("NB");
		// Act
        shoeBoxes.add(box);
		// Assert
        assertThat(shoeBoxes.size(), is(1));
        assertThat(shoeBoxes.contains(box), is(true));
	}

	@Test
	public void givenTheSameShoeBoxTwoTimesShouldContainItOnce() {
		// Arrange
		ShoeBox box = new ShoeBox("NB");
		// Act
        shoeBoxes.add(box);
        shoeBoxes.add(box);
		// Assert
        assertThat(shoeBoxes.size(), is(1));
        assertThat(shoeBoxes.contains(box), is(true));
    }

    @Test
    public void givenOneShoeBoxRemoveShouldDeleteIt() {
        //Arrange
        ShoeBox box = new ShoeBox("NB");
        //Act
        shoeBoxes.add(box);
        shoeBoxes.remove(box);
        //Assert
        assertThat(shoeBoxes.size(), is(0));
        assertThat(shoeBoxes.contains(box), is(false));
    }

    @Test
    public void givenOneShoeBoxRemoveNullShouldDoNothing() {
        //Arrange
        ShoeBox box = new ShoeBox("NB");
        //Act
        shoeBoxes.add(box);
        shoeBoxes.remove(null);
        //Assert
        assertThat(shoeBoxes.size(), is(1));
        assertThat(shoeBoxes.contains(box), is(true));
    }

    @Test
    public void givenOneShoeBoxRemoveAnotherOneShouldDoNothing() {
        //Arrange
        ShoeBox box = new ShoeBox("NB");
        ShoeBox clarksBox = new ShoeBox("Clarks");
        //Act
        shoeBoxes.add(box);
        shoeBoxes.remove(clarksBox);
        //Assert
        assertThat(shoeBoxes.size(), is(1));
        assertThat(shoeBoxes.contains(box), is(true));
    }

	@Test
	public void givenTwoShoeBoxesShouldContainThem() {
		// Arrange
		ShoeBox nbBox = new ShoeBox("NB");
		ShoeBox clarksBox = new ShoeBox("Clarks");
		// Act
        shoeBoxes.add(nbBox);
        shoeBoxes.add(clarksBox);
		// Assert
        assertThat(shoeBoxes.size(), is(2));
        assertThat(shoeBoxes.contains(nbBox), is(true));
        assertThat(shoeBoxes.contains(clarksBox), is(true));
	}

    @Test
    public void givenTwoShoeBoxesRemovingOneShouldLeftTheOther() {
        // Arrange
        ShoeBox nbBox = new ShoeBox("NB");
        ShoeBox clarksBox = new ShoeBox("Clarks");
        // Act
        shoeBoxes.add(nbBox);
        shoeBoxes.add(clarksBox);
        assertThat(shoeBoxes.size(), is(2));
        shoeBoxes.remove(nbBox);
        // Assert
        assertThat(shoeBoxes.size(), is(1));
        assertThat(shoeBoxes.contains(nbBox), is(false));
        assertThat(shoeBoxes.contains(clarksBox), is(true));
    }

	@Test
	public void givenNullShoeBoxShouldDoNothing() {
		// Arrange
		ShoeBox nullBox = null;
		// Act
        shoeBoxes.add(nullBox);
		// Assert
        assertThat(shoeBoxes.size(), is(0));
        assertThat(shoeBoxes.contains(nullBox), is(false));
	}

	@Test
	public void givenTwoBoxesWithTheSameShoesShouldContainOnlyOne() {
		// Arrange
		ShoeBox nb1Box = new ShoeBox("NB");
		ShoeBox nb2Box = new ShoeBox("NB");
		// Act
        shoeBoxes.add(nb1Box);
        shoeBoxes.add(nb2Box);
		// Assert
        assertThat(shoeBoxes.size(), is(1));
        assertThat(shoeBoxes.contains(nb1Box), is(true));
        assertThat(shoeBoxes.contains(nb2Box), is(true));
	}
	*/
}
