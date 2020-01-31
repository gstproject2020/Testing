package com.training.JUnitTestApp;

public class AssertClass {
	public Object actual;

	public int[] addOnetoArray(int[] numbers) {
		int length = numbers.length;
		int output[] = new int[length];
		for (int i = 0; i < length; i++) {
			output[i] = numbers[i] + 1;
		}
		return output;
	}

}
