package com.training.JUnitTestApp;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.hamcrest.CoreMatchers;
import org.junit.Ignore;
import org.junit.Test;

import junit.framework.Assert;

public class AssertTest {

	AssertClass assertclass;

	@Test
	public void addOnetoArrayTest() {
		assertclass = new AssertClass();
		int expected[] = new int[] { 2, 3 };
		assertArrayEquals(expected, assertclass.addOnetoArray(new int[] { 1, 2 }));
	}

	@Test
	public void testAssertmethods() {
		String expected = "juit";
		String actual = "junit";

		String input = null;
		assertNull(input);

		assertNotSame(expected, actual);
		assertNotNull(actual);

		assertTrue(10 < 20);

		assertThat("123", CoreMatchers.is("123"));
	}

	@Ignore
	@Test
	public void testFail() {
		Assert.fail();
	}

}
