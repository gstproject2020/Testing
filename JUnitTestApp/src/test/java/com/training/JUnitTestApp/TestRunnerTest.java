package com.training.JUnitTestApp;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunnerTest {

	public static void main(String ap[]) {
		Result result = JUnitCore.runClasses(TestClass1.class, MethodExecutionOrder.class);

		for (Failure failure : result.getFailures()) {
			System.out.println("message: " + failure.getMessage() + ", " + failure.getClass().getName());
		}
		System.out.println(result.wasSuccessful());
	}

}
