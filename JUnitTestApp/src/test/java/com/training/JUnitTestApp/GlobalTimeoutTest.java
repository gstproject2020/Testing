package com.training.JUnitTestApp;

import java.util.concurrent.TimeUnit;

import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;

public class GlobalTimeoutTest {

	@Rule
	public Timeout timeout = Timeout.seconds(1);

	@Test
	public void globalTimeoutTestSuccess() throws InterruptedException {
		TimeUnit.SECONDS.sleep(2);
	}

	@Test
	public void globalTimeoutTestFail() {

	}

}
