/**
 *   File Name: AdvPetReg.java<br>
 *
 *   Venkatraman, Arunkumar<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: May 26, 2016
 *   
 */

package com.sqa.av;

import java.util.*;

/**
 * AdvPetReg //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author Venkatraman, Arunkumar
 * @version 1.0.0
 * @since 1.0
 *
 */
public class AdvPetReg {
	static String name;
	static String[] petNames, petAddresses, petRegPrices, petDOB, petCities, petStates;
	static double[] yearlyFoodCost;
	static int numPetToReg;
	static Scanner scanner;
	static boolean[] hasRabiesShot;

	public static void registerPet() {
		initApplication();
		retrieveApplication();
		retrievePetDetails();
		displayPetDetails();
		exitApplication();
	}

	private static void displayPetDetails() {
		for (int i = 0; i < numPetToReg; i++) {
			System.out.println("\n Pet Details:");
			System.out.println("-----------------------");
			System.out.println("name: " + petNames[i]);
			System.out.println("Address: " + petAddresses[i]);
			System.out.println("City: " + petCities[i]);
			System.out.println("State: " + petStates[i]);
			System.out.println("DOB: " + petDOB[i]);
			System.out.println("Registration Price: " + petRegPrices[i]);
			System.out.println("Rabis Shot Received: " + hasRabiesShot[i]);
			System.out.println("Yearly food cost: " + yearlyFoodCost[i]);
		}
	}

	private static void exitApplication() {
		System.out.println("\nThank you for using the Application");
		System.out.println("Good day " + name + "!");
	}

	private static void initApplication() {
		scanner = new Scanner(System.in);
		System.out.println("Welcome to the Pet Registration App");
	}

	/**
	 * @param string
	 * @return
	 */
	private static boolean obtainBoolean(String question) {
		System.out.println(question);
		boolean shotReceived = Boolean.parseBoolean(scanner.nextLine());
		return shotReceived;
	}

	private static double obtainDouble(String question) {
		boolean validData = false;
		double value = 0;
		while (!validData) {
			try {
				System.out.println(question);
				value = Double.parseDouble(scanner.nextLine());
				validData = true;
			} catch (NumberFormatException e) {
				System.out.println("Please enter valid data");
			}
		}
		return value;
	}

	private static int obtainInt(String question) {
		boolean validData = false;

		while (!validData) {
			try {
				System.out.println(question);
				numPetToReg = Integer.parseInt(scanner.nextLine());
				validData = true;
			} catch (NumberFormatException e) {
				System.out.println("Please enter valid data");
			}
		}
		return numPetToReg;
	}

	private static String obtainString(String question) {
		System.out.println(question);
		return scanner.nextLine();
	}

	private static void retrieveApplication() {
		System.out.print("Could you please give me your name: ");
		name = scanner.nextLine();
	}

	private static void retrievePetDetails() {
		numPetToReg = obtainInt("How many pets do you want to register: ");
		petNames = new String[numPetToReg];
		hasRabiesShot = new boolean[numPetToReg];
		yearlyFoodCost = new double[numPetToReg];
		petAddresses = new String[numPetToReg];
		petCities = new String[numPetToReg];
		petStates = new String[numPetToReg];
		petDOB = new String[numPetToReg];
		petRegPrices = new String[numPetToReg];

		for (int i = 0; i < numPetToReg; i++) {
			petNames[i] = obtainString("What is your pet's name: ");
			petAddresses[i] = obtainString("What is " + petNames[i] + "'s Address: ");
			petCities[i] = obtainString("What is " + petNames[i] + "'s City: ");
			petStates[i] = obtainString("What is " + petNames[i] + "'s  State: ");
			petDOB[i] = obtainString("What is " + petNames[i] + "'s  DOB (MM/DD/YYYY): ");
			petRegPrices[i] = obtainString("What is " + petNames[i] + "'s  Registration Price: ");
			hasRabiesShot[i] = obtainBoolean("Has your pet received Rabis shot: ");
			yearlyFoodCost[i] = obtainDouble("What is the annual food expense for your pet: ");

		}

	}
}
