/**
 *   File Name: AdvPetRegAltLogic.java<br>
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
 * AdvPetRegAltLogic //ADDD (description of class)
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
public class AdvPetRegAltLogic {

	static String name;
	static int petCount;
	static String[] petNames, petAddresses, petRegPrices, petDOBs, petCities, petStates;

	static Scanner scanner;

	public static void registerPet() {
		initApplication();
		retrieveUserName();
		retrieveNumberOfPets();
		initPetDetailArrays();
		retrieveApplication();
		retrieveAllPetDetails();
		displayAllPetDetails();
		exitApplication();
	}

	private static void displayAllPetDetails() {
		for (int i = 0; i < petCount; i++) {
			displayPetDetails(i);
		}
	}

	private static void displayPetDetails(int petCount) {
		System.out.println(" Pet #" + (petCount + 1) + " Details:");
		System.out.println("----------------------------------------");
		System.out.println("\n Pet Details:");
		System.out.println("----------------------------");
		System.out.println("name: " + petNames[petCount]);
		System.out.println("Address: " + petAddresses[petCount]);
		System.out.println("City: " + petCities[petCount]);
		System.out.println("State: " + petStates[petCount]);
		System.out.println("DOB: " + petDOBs[petCount]);
		System.out.println("Registration Price: " + petRegPrices[petCount]);
		System.out.println("----------------------------------------");

	}

	private static void exitApplication() {
		System.out.println("Thank you for using the Application");
		System.out.println("Good bye " + name);
	}

	private static void initApplication() {
		scanner = new Scanner(System.in);
		System.out.println("Welcome to the Pet Registration App");
	}

	private static void initPetDetailArrays() {
		petNames = new String[petCount];
		petAddresses = new String[petCount];
		petRegPrices = new String[petCount];
		petDOBs = new String[petCount];
		petCities = new String[petCount];
		petStates = new String[petCount];

	}

	private static int obtainInt(String question) {
		boolean validData = false;
		int value = 0;
		try {
			while (!validData) {
				System.out.print(question);
				value = Integer.parseInt(scanner.nextLine());
				validData = true;
			}
		} catch (NumberFormatException e) {
			System.out.println("You must enter a valid number input");
		}
		return value;
	}

	private static String obtainString(String question) {
		System.out.println(question);
		return scanner.nextLine();
	}

	private static void retrieveAllPetDetails() {
		for (int i = 0; i < petCount; i++) {
			retrievePetDetails(i);
		}
	}

	private static void retrieveApplication() {
		System.out.print("Could you please give me your name: ");
		name = scanner.nextLine();
	}

	private static void retrieveNumberOfPets() {
		petCount = obtainInt("How many pets would you like to register in the system?: ");

	}

	private static void retrievePetDetails(int petCount) {
		System.out.println(" Pet #" + (petCount + 1) + " Details:");
		System.out.println("----------------------------------------");
		petNames[petCount] = obtainString("What is your pet's name: ");
		petAddresses[petCount] = obtainString("What is " + petNames + "'s Address: ");
		petCities[petCount] = obtainString("What is " + petNames + "'s City: ");
		petStates[petCount] = obtainString("What is " + petNames + "'s  State: ");
		petDOBs[petCount] = obtainString("What is " + petNames + "'s  DOB (MM/DD/YYYY): ");
		petRegPrices[petCount] = obtainString("What is " + petNames + "'s  Registration Price: ");
		System.out.println("----------------------------------------");

	}

	private static void retrieveUserName() {
		// TODO Auto-generated method stub

	}
}
