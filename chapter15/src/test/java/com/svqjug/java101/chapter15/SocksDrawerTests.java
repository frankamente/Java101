package com.svqjug.java101.chapter15;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;

public class SocksDrawerTests {

	private SocksDrawer socksDrawer;

	@Before
	public void setUp() {
		socksDrawer = new SocksDrawer();
	}

	@Test
	public void givenNewShirtsBarShouldBeEmpty() {
		// Arrange
		// Act
		// Assert
		assertThat(socksDrawer.size(), is(0));
	}

	@Test
	public void givenOnePairOfSocksShouldContainIt() {
		// Arrange
		Socks pair = new Socks("Garfield");
		// Act
		socksDrawer.add(pair);
		// Assert
		assertThat(socksDrawer.size(), is(1));
		assertThat(socksDrawer.contains(pair), is(true));
	}

	@Test
	public void givenNullShouldNotContainIt() {
		// Arrange
		Socks pair = null;
		// Act
		socksDrawer.add(pair);
		// Assert
		assertThat(socksDrawer.size(), is(0));
	}

	@Test
	public void givenNullAsDescriptionShouldNotContainIt() {
		// Arrange
		Socks pair = new Socks(null);
		// Act
		socksDrawer.add(pair);
		// Assert
		assertThat(socksDrawer.size(), is(0));
	}

	@Test
	public void givenOnePairOfSocksShouldGetItByDescription() {
		// Arrange
		Socks pair = new Socks("Garfield");
		socksDrawer.add(pair);
		// Act
		Optional<Socks> pairRetrieved = socksDrawer.get(pair.getDescription());
		// Assert
		assertThat(pairRetrieved.get(), is(pair));
	}

	@Test
	public void givenNullDescriptionShouldGetNothing() {
		// Arrange
		Socks pair = new Socks("Garfield");
		socksDrawer.add(pair);
		// Act
		Optional<Socks> pairRetrieved = socksDrawer.get(null);
		// Assert
		assertThat(pairRetrieved.isPresent(), is(false));
	}

	@Test
	public void givenOnePairOfSocksShouldRemoveIt() {
		// Arrange
		Socks pair = new Socks("Garfield");
		socksDrawer.add(pair);
		// Act
		Optional<Socks> pairRemoved = socksDrawer.remove(pair.getDescription());
		// Assert
		assertThat(pairRemoved.get(), is(pair));
	}

	@Test
	public void givenNullDescriptionRemoveShouldDoNothing() {
		// Arrange
		Socks pair = new Socks("Garfield");
		socksDrawer.add(pair);
		// Act
		Optional<Socks> pairRemoved = socksDrawer.remove(null);
		// Assert
		assertThat(pairRemoved.isPresent(), is(false));
	}
}
