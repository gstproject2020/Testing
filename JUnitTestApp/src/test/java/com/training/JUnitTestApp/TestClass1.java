package com.training.JUnitTestApp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class TestClass1 {

	private static List<Integer> l;

//	@Rule
//	public Timeout timeout = Timeout.millis(2500);

	/**
	 * 1. @BeforeClass It executes the method annotated with this, and this is used
	 * to initialize any kind of class level properties 2. @AfterClass It executes
	 * before the control leaves the class or at the end of all this will get
	 * execute. This is used to close or nullify the used resources 3. @Before This
	 * will be executed for each and every @Test annotated method before of it
	 * 4. @Test This is used to test a unit piece of code 5. @After This will
	 * execute after eact @Test method 6. @Ignore It is used to ignore a test
	 * case(i.e.skip @Test annotated method) 7. @Rule This is used to define a rule
	 * 8. @FixedMethodOrder This is used to define the order of execution of test
	 * methods 9. @RunWith 10. @Suite Above are used to run multiple test cases
	 */

	/**
	 * pseudo code 1. write for loop and insert add, subtract, divide, multiply
	 * values into array list List l = new ArrayList(); l.add("add");
	 * l.add("subtract"); l.add("divide"); l.add("multiply");
	 * 
	 * for(int i=0;i<l.length;i++){
	 * 
	 * }
	 */

	public static void main(String a[]) {
		Result result = JUnitCore.runClasses(TestClass1.class);
		System.out.println(result.wasSuccessful());
	}

	@BeforeClass
	public static void initializeClassLevelProperties() {
		System.out.println("inside initializeClassLevelProperties() method");
//		l = new ArrayList<Integer>();
//		l.add(1);
//		l.add(2);
//		l.add(3);
//		l.add(4);
	}

	@AfterClass
	public static void closingAllProperties() {
		System.out.println("Inside closingAllProperties() method");
	}

	@Before
	public void beforeAnyTestMethod() {
		System.out.println("Inside  beforeAnyTestMethod() method");
	}

	@After
	public void afterAnyTestMethod() {
		System.out.println("Inside  afterAnyTestMethod() method");
	}

//	@SuppressWarnings("deprecation")
//	@Test
//	public void testSuccessful() {
//		System.out.println("Inside testSuccessful() method");
//		SampleClass1 obj = new SampleClass1();
//		for (int i = 1; i <= l.size(); i++) {
//			assertEquals(31, obj.doOperation(1, 10, 20));
//		}
////		 assertEquals(c, obj.add(a, b));
//	}

	@SuppressWarnings("deprecation")
	@Test
//	@Ignore
	public void testUnSuccessful() {
		int a = 10;
		int b = 20;
		int c = 10 + 20;
		SampleClass1 obj = new SampleClass1();
		assertEquals(c, obj.add(a, b));

		System.out.println("Inside testSuccessful() method");

	}

	// Here the time out is in milli seconds....
	 @Test(timeout = 1 * 1500)
//	@Test
	public void testTimeout() {
		System.out.println("Inside testTimeout() method");
		try {
			// Here we are making time in the seconds
			TimeUnit.SECONDS.sleep(1);
		} catch (Exception e) {

		}
		System.out.println("returning from testTimeout() method");
	}

	@Test(expected = ArithmeticException.class)
//	@Test
	public void throwError() {
		System.out.println(10 / 0);
	}

	@Test
	public void testAdd() {
		int a = 10;
		int b = 20;
		int c = 10 + 20;
		SampleClass1 obj = new SampleClass1();
		int result = obj.add(a, b);
		System.out.println("praveen");
		// assertEquals(300, result);
		Assert.assertNotEquals(300, result);
	}

}
