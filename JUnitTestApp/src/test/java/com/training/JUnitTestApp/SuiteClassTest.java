package com.training.JUnitTestApp;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses(value = { TestClass1.class, MethodExecutionOrder.class })
public class SuiteClassTest {

}
