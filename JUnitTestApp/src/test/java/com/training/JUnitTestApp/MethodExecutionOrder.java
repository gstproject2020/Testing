package com.training.JUnitTestApp;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MethodExecutionOrder {

	@Test
	public void testM() {
		System.out.println("testM");
	}

	@Test
	public void testA() {
		System.out.println("testA");
	}

	@Test
	public void testDEL() {
		System.out.println("testDEL");
	}

	@Test
	public void testB() {
		System.out.println("testB");
	}

	@Test
	public void test1() {
		System.out.println("test1");
	}

}
