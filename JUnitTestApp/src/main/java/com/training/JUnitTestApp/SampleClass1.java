package com.training.JUnitTestApp;

public class SampleClass1 {

	public int doOperation(int operationType, int a, int b) {
		
		switch (operationType) {
		case 1:
			return add(a, b);
		case 2:
			return subtract(a, b);
		case 3:
			return multiply(a, b);
		case 4:
			return divide(a, b);
		default:
			System.out.println("Invalid operation");
			return 0;
		}
	}

	public int add(int x1, int x2) {
		return x1 + x2;
	}

	public int subtract(int x1, int x2) {
		return x1 - x2;
	}

	public int multiply(int x1, int x2) {
		return x1 * x2;
	}

	public int divide(int x1, int x2) {
		return x1 / x2;
	}

}
