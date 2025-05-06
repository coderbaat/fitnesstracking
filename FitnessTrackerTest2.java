/*Author: Aiyar Batyrgaliyev, 041172069
 *File name: FitnessTrackerTest2.java
 *Course: CST8284 – OOP, Section 331
 *Assignment 1
 *Date: 12 February 2025
 *Professor: Pr. Sandra Iroakazi
 *Purpose: to test three working methods testCalculateDistance(), testIndicateFitnessLevel()
 *and testCalculateCalorieDeficit().
 */

package tasks;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * This class represents JUnit tests for 3 methods described in
 * FitnessTracker.java: testCalculateDistance(), testIndicateFitnessLevel() and
 * testCalculateCalorieDeficit().
 * 
 * Test id=1 is to test distance calculation method with assumption that user is
 * male and steps count is 5000. Delta of 0.0001 is allowed to simplify
 * calculations.
 * 
 * Test id=2 is to test if the output is either Active, Moderately Active or
 * Sedentary. The assumption was made that user did 30 active minutes and burned
 * 300 calories.
 * 
 * Test id=3 to test calories deficit/surplus calculation based on assumption
 * that user burned 900 calories and has 800 calories as a target. The purpose
 * of this test method is to be sure that burned calories are being subtracted
 * by maintenance calories to display correct information.
 * 
 * @see tasks
 * @author Aiyar Batyrgaliyev
 * @version 1.1
 * @since javac 21.0.4
 */
public class FitnessTrackerTest2 {

	/**
	 * Declaration of FitnessTracker object tracker.
	 */
	private FitnessTracker tracker;

	/**
	 * method runs once before all tests
	 * 
	 * @throws java.lang.Exception if there is an error
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * method runs once after all classes
	 * 
	 * @throws java.lang.Exception if there is an error
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * Initializing tracker with default arguments
	 * 
	 * @throws Exception if an error occurs during setup
	 */
	@Before
	public void setUp() throws Exception {
		tracker = new FitnessTracker(null, null, null, 0, 0, 0, 0);
	}

	/**
	 * cleaning object after each test
	 * 
	 * @throws java.lang.Exception if an error occurs during clearing
	 */
	@After
	public void tearDown() throws Exception {
		tracker = null;
	}

	/**
	 * Test id=1 to test distance calculation method with assumption that user is
	 * male and steps count is 5000. Delta of 0.0001 is allowed to simplify
	 * calculations. 
	 */
	@Test // id 1
	public void testCalculateDistance() {
		tracker.setGender("male");
		tracker.setStepsCount(5000);
		double expected = 4000;
		double result = tracker.calculateDistance();
		double delta = 0.0001;
		assertEquals(expected, result, delta);
	}

	/**
	 * Test id=2 to test if the output is either Active, Moderately Active or
	 * Sedentary. The assumption was made that user did 30 active minutes and burned
	 * 300 calories.
	 */
	@Test // id 2
	public void testIndicateFitnessLevel() {
		tracker.setActiveMinutes(30);
		tracker.setCaloriesBurned(300);
		String fitnessLevel = tracker.indicateFitnessLevel();
		assertTrue(fitnessLevel.equals("Active") || fitnessLevel.equals("Moderately Active")
				|| fitnessLevel.equals("Sedentary"));
	}

	/**
	 * Test id=3 to test calories deficit/surplus calculation based on assumption
	 * that user burned 900 calories and has 800 calories as a target. The purpose
	 * of this test method is to be sure that burned calories are being subtracted
	 * by maintenance calories to display correct information.
	 */
	@Test // id 3
	public void testCalculateCalorieDeficit() {
		tracker.setCaloriesBurned(900); 
		tracker.setTargetCalories(800);
		int expected = -100;
		int result = tracker.calculateCalorieDeficit();
		assertNotEquals(expected, result);
	}
}
