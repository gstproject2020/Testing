package com.training.JUnitTestApp;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class SampleClass1Test {

	private String APP_NAME;
	private Map<String, String> cacheMap;
	
//	public static void main(String a[]) {
//		Result result = JUnitCore.runClasses(SampleClass1Test.class);
//		for (Failure failure : result.getFailures()) {
//			System.out.println(failure.getMessage());
//		}
//		System.out.println(result.wasSuccessful());
//	}

	@BeforeClass
	public static void beforeClassStarts() {
		System.out.println("Doing anything before class starts");
	}

	@AfterClass
	public static void afterClassEnds() {
		System.out.println("Doing anything before class ends");
	}

	@Before
	public void initialize() {
		System.out.println("Initialization has started");
//		System.out.println("Initialization is in progress");
//		System.out.println("Initialization completed");
//		APP_NAME = "SampleClass1Test";
//		cacheMap = new HashMap<String, String>();
	}

	@After
	public void destroy() {
		System.out.println("Destroying the properties");
//		APP_NAME = "";
//		cacheMap = null;
	}

	@Test
	@Ignore("test")
	//@Ignore
	public void testAdd() {
		// System.out.println("APP_NAME: " + APP_NAME + ", cache-size: " +
		// cacheMap.size());
		System.out.println("Ignore this testadd");
//		String str = "hai";
//		System.out.println("hai");
		// assertEquals("hai",str);
	}

//	//@Test(expected = Exception.class)
//	@Test
//	public void testAdd1() throws Exception {
//		// System.out.println("APP_NAME: " + APP_NAME + ", cache-size: " +
//		// cacheMap.size());
//		String str = "hai1";
//		System.out.println("hai1");
//		throw new Exception();
//		// assertEquals("hai",str);
//	}

	@Test(timeout = 1000)
	public void infinity() {
		
		System.out.println("starting method infintiy");
		while(true);
//		int n=5;
//		System.out.println("sarting method infinity");
//		for(int i=0;i<n;i++) {
//	System.out.println("ending method infinity");
//		}
	}



}
