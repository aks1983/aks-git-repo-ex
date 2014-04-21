package com.test;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SomeOtherClassTest</code> contains tests for the class <code>{@link SomeOtherClass}</code>.
 *
 * @generatedBy CodePro at 07/11/13 00:01
 * @author Arun
 * @version $Revision: 1.0 $
 */
public class SomeOtherClassTest {
	/**
	 * Run the SomeOtherClass(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 07/11/13 00:01
	 */
	@Test
	public void testSomeOtherClass_1()
		throws Exception {
		String value = "";

		SomeOtherClass result = new SomeOtherClass(value);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String performSomeOperation(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 07/11/13 00:01
	 */
	@Test
	public void testPerformSomeOperation_1()
		throws Exception {
		SomeOtherClass fixture = new SomeOtherClass("");
		int i = 1;

		String result = fixture.performSomeOperation(i);

		// add additional test code here
		assertEquals("2", result);
	}

	/**
	 * Run the String performSomeOperation(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 07/11/13 00:01
	 */
	@Test
	public void testPerformSomeOperation_2()
		throws Exception {
		SomeOtherClass fixture = new SomeOtherClass("");
		int i = 2;

		String result = fixture.performSomeOperation(i);

		// add additional test code here
		assertEquals("2", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 07/11/13 00:01
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
	 * @generatedBy CodePro at 07/11/13 00:01
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
	 * @generatedBy CodePro at 07/11/13 00:01
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(SomeOtherClassTest.class);
	}
}