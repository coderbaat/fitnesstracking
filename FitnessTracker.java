/*File name: FitnessTracker.java
 *Author: Aiyar Batyrgaliyev, 041172069
 *Course: CST8284 – OOP, Section 331
 *Assignment 1
 *Date: 09 February 2025
 *Professor: Pr. Sandra Iroakazi
 *Purpose: program for tracking fitness activity based on first name, last name,
 *gender, daily steps count, burned calories, active minutes and calories maintenance level.
 */

package tasks;

/**
 * This class represents program for tracking fitness activity based on first
 * name, last name, gender, daily steps count, burned calories, active minutes
 * and calories maintenance level. User will be asked to provided initial data
 * and fitness activity metrics will provided.
 * 
 * Class also contains methods to calculate distance based on count of steps and
 * step length depending on gender (calculateDistance()), to calculate weekly
 * active minutes based on daily active minutes (calculateWeeklyMinutes()), to
 * indicate fitness level depending on user's entered data and certain threshold
 * for calories and weekly active minutes (indicateFitnessLevel()), and to
 * calculate calories deficit based on burned calories and calories maintenance
 * level calculateCalorieDeficit.
 * 
 * @see tasks
 * @author Aiyar Batyrgaliyev.
 * @version 1.1
 * @since javac 21.0.4.
 */
public class FitnessTracker {

	/**
	 * constant to show how many days are in a week {@value}
	 */
	private static final int WEEK_DAYS_COUNT = 7;

	/**
	 * constant for step length in meters for males {@value}
	 */
	private static final double MALE_STEP_LENGTH = 0.8;

	/**
	 * constant for step length in meters for females {@value}
	 */
	private static final double FEMALE_STEP_LENGTH = 0.7;

	/**
	 * first name component of user data
	 */
	private String firstName;

	/**
	 * last name component of user data
	 */
	private String lastName;

	/**
	 * gender component of user data
	 */
	private String gender;

	/**
	 * daily steps count component of user data
	 */
	private int stepsCount;

	/**
	 * burned calories component of user data
	 */
	private int caloriesBurned;

	/**
	 * daily active minutes component of user data
	 */
	private int activeMinutes;

	/**
	 * maintenance calories level component of user data
	 */
	private int targetCalories;

	/**
	 * this is parameterized constructor and sets first name, last name, gender,
	 * stepsCount, caloriesBurned, activeMinutes and targetCalories as passed by
	 * user.
	 * 
	 * @param firstName first name of user
	 * @param lastName last name of user
	 * @param gender gender of user
	 * @param stepsCount daily steps taken by user
	 * @param caloriesBurned calories burned by user
	 * @param activeMinutes daily active minutes of user
	 * @param targetCalories calories maintenance level of user
	 */
	public FitnessTracker(String firstName, String lastName, String gender, int stepsCount, int caloriesBurned,
			int activeMinutes, int targetCalories) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.stepsCount = stepsCount;
		this.caloriesBurned = caloriesBurned;
		this.activeMinutes = activeMinutes;
		this.targetCalories = targetCalories;
	}

	/**
	 * this is the method to access first name of user
	 * 
	 * @return first name of user
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * this is method to set first name of user
	 * 
	 * @param firstName first name of user
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * this is the method to access last name of user
	 * 
	 * @return last name of user
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * this is the method to set last name
	 * 
	 * @param lastName last name of user
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * this is the method to return gender of user
	 * 
	 * @return gender of user
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * this is the method to modify gender of user
	 * 
	 * @param gender gender of user
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * this is the method to access daily steps count of user
	 * 
	 * @return steps count of user
	 */
	public int getStepsCount() {
		return stepsCount;
	}

	/**
	 * this is the method to modify steps count of user
	 * 
	 * @param stepsCount daily steps count of user
	 */
	public void setStepsCount(int stepsCount) {
		this.stepsCount = stepsCount;
	}

	/**
	 * this is the method to return maintenance calories level of user
	 * 
	 * @return target calories level of user
	 */
	public int getTargetCalories() {
		return targetCalories;
	}

	/**
	 * this is the method to set target calories level of user
	 * 
	 * @param targetCalories target calories level of user
	 */
	public void setTargetCalories(int targetCalories) {
		this.targetCalories = targetCalories;
	}

	/**
	 * this is the method to return burned calories by user
	 * 
	 * @return burned calories by user
	 */
	public int getCaloriesBurned() {
		return caloriesBurned;
	}

	/**
	 * this is the method to set burned calories by user
	 * 
	 * @param caloriesBurned burned calories by user
	 */
	public void setCaloriesBurned(int caloriesBurned) {
		this.caloriesBurned = caloriesBurned;
	}

	/**
	 * this is the method to access daily active minutes of user
	 * 
	 * @return daily active minutes of user
	 */
	public int getActiveMinutes() {
		return activeMinutes;
	}

	/**
	 * this is the method to set daily active minutes of user
	 * 
	 * @param activeMinutes daily active minutes of user
	 */
	public void setActiveMinutes(int activeMinutes) {
		this.activeMinutes = activeMinutes;
	}

	/**
	 * this is the method to calculate distance in meters based on user's gender and
	 * daily steps taken.
	 * 
	 * @return distance walked expressed in meters.
	 */
	public double calculateDistance() {
		double stepLength; // local variable for step length based on gender
		if (gender.equalsIgnoreCase("male")) {
			stepLength = MALE_STEP_LENGTH;
		} else {
			stepLength = FEMALE_STEP_LENGTH;
		}
		return stepsCount * stepLength;
	}

	/**
	 * this is the method to calculate weekly minutes based on daily active minutes
	 * and number of days in a week.
	 * 
	 * @return weekly minutes
	 */
	public double calculateWeeklyMinutes() {
		return activeMinutes * WEEK_DAYS_COUNT;
	}

	/**
	 * this is the method to determine fitness level of user in accordance with
	 * thresholds based on weekly active minutes and weekly burned calories. user is
	 * active when weekly active minutes are more than 150 AND weekly burned
	 * calories are more than 2000. user is moderately active if weekly active
	 * minutes are between 75 and 150 both inclusive, OR weekly burned calories is
	 * more than or equal to 1000. user is sedentary if preceding conditions are not
	 * met.
	 * 
	 * @return fitness level of user (active, moderately active, sedentary)
	 */
	public String indicateFitnessLevel() {
		double weeklyActiveMinutes = calculateWeeklyMinutes(); // local variable for weekly active minutes.
		int weeklyCaloriesBurned = caloriesBurned * WEEK_DAYS_COUNT; // local variable for weekly burned calories.

		if (weeklyActiveMinutes > 150 && weeklyCaloriesBurned > 2000) {
			return "Active";
		} else if ((weeklyActiveMinutes >= 75 && weeklyActiveMinutes <= 150) || weeklyCaloriesBurned >= 1000) {
			return "Moderately Active";
		} else {
			return "Sedentary";
		}
	}

	/**
	 * this is the method to calculate calories deficit/surplus by subtracting
	 * burned calories by target calories amount.
	 * 
	 * @return calories deficit/surplus for user.
	 */
	public int calculateCalorieDeficit() {
		return caloriesBurned - targetCalories;
	}

	/**
	 * this is the method to display all entered data by user and plus fitness
	 * activity metrics based on calculated distance, weekly minutes, indicates
	 * fitness level and calculated calories deficit/surplus. Plus, there is a
	 * common description of fitness levels.
	 */
	public void displayFitnessData() {
		System.out.println("\n--- User Fitness Data ---");
		System.out.printf("Name: %s %s\n", firstName, lastName);
		System.out.printf("Gender: %s\n", gender);
		System.out.printf("Steps Taken: %d\n", stepsCount);
		System.out.printf("Calories Burned: %d\n", caloriesBurned);
		System.out.printf("Active Minutes: %d\n", activeMinutes);
		System.out.printf("Distance Walked: %.1f meters\n", calculateDistance());
		System.out.printf("Weekly Active Minutes: %.1f minutes\n", calculateWeeklyMinutes());
		System.out.println("Fitness Level: " + indicateFitnessLevel());
		System.out.println("Daily Calorie Balance: " + calculateCalorieDeficit() + " calories");
		System.out.println("Fitness Level Criteria:");
		System.out.println("Active: More than 150 active minutes per week and over 2000 calories burned.");
		System.out.println("Moderately Active: 75-150 active minutes per week or 1000-2000 calories burned.");
		System.out.println("Sedentary: Less than 75 active minutes per week and under 1000 calories burned.");
	}

}