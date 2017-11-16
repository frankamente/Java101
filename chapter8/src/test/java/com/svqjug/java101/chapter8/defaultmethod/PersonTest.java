package com.svqjug.java101.chapter8.defaultmethod;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PersonTest {

	@Test
	public void personTest() {
		final Person oldPerson = new OldPerson("Agustin", 35);
		final Person newPerson = new NewPerson("Agustin", 35, "Male");
		assertThat(oldPerson.getSex(), is("N/A"));
		assertThat(newPerson.getSex(), is("Male"));
	}
}
