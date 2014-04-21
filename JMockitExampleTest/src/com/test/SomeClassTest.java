package com.test;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SomeClassTest</code> contains tests for the class <code>{@link SomeClass}</code>.
 *
 * @generatedBy CodePro at 06/11/13 23:59
 * @author Arun
 * @version $Revision: 1.0 $
 */
public class SomeClassTest {
	/**
	 * Run the String doSomething(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 06/11/13 23:59
	 */
	@Test
	public void testDoSomething_1()
		throws Exception {
		SomeClass fixture = new SomeClass();
		int i = 1;

		String result = fixture.doSomething(i);

		// add additional test code here
		assertEquals("data2", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 06/11/13 23:59
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 06/11/13 23:59
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 06/11/13 23:59
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(SomeClassTest.class);
	}
}