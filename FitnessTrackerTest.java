/*File name: FitnessTrackerTest.java
 *Author: Aiyar Batyrgaliyev, 041172069
 *Course: CST8284 – OOP, Section 331
 *Assignment 1
 *Date: 09 February 2025
 *Professor: Pr. Sandra Iroakazi
 *Purpose: to propose user to enter fitness data. The class calls display method to
 *show entered data and calculated fitness metrics.
 */

package tasks;

import java.util.Scanner;

/**
 * this class asks user to enter personal fitness data such as first name, last
 * name, gender, daily steps count, burned calories, active minutes and calories
 * maintenance level.
 * 
 * After data is entered, a working displayFitnessData() will be called to show
 * entered data and calculated fitness metrics.
 * 
 * @see tasks
 * @author Aiyar Batyrgaliyev
 * @version 1.1
 * @since javac 21.0.4
 */
public class FitnessTrackerTest {

	/**
	 * this is the entry point for the application, it asks user to enter first
	 * name, last name, gender, daily steps count, burned calories, active minutes
	 * and calories maintenance level. After that, there is instantiation of 1
	 * FitnessTracker object with arguments entered by user.
	 * System implies presence of default constructor without description.
	 * 
	 * @param args Command line arguments are not used by this program.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first name: ");
		String firstName = input.nextLine(); // local variable for first name of user

		System.out.print("Enter last name: ");
		String lastName = input.nextLine(); // local variable for last name of user

		System.out.print("Enter gender (male/female): ");
		String gender = input.nextLine(); // local variable for gender of user

		System.out.print("Enter daily steps: ");
		int stepsCount = input.nextInt(); // local variable for daily steps made by user

		System.out.print("Enter daily burned calories: ");
		int caloriesBurned = input.nextInt(); // local variable for calories burned by user

		System.out.print("Enter daily active minutes: ");
		int activeMinutes = input.nextInt(); // //local variable for active minutes of user

		System.out.print("Enter daily maintenance calories: ");
		int targetCalories = input.nextInt(); //// local variable for calories maintenance level of user

		FitnessTracker tracker1 = new FitnessTracker(firstName, lastName, gender, stepsCount, caloriesBurned,
				activeMinutes, targetCalories); // // Object creation of FitnessTracker

		tracker1.displayFitnessData(); // calling display method to show entered data and calculated fitness metrics.

		input.close();
	}

}
