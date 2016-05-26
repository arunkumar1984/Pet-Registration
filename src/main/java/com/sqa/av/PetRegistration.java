/**
 *   File Name: PetRegistration.java<br>
 *
 *   Venkatraman, Arunkumar<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: May 25, 2016
 *   
 */

package com.sqa.av;

import java.util.*;

/**
 * PetRegistration //ADDD (description of class)
 * 
 * @author Venkatraman, Arunkumar
 * @version 1.0.0
 * @since 1.0
 *
 */
public class PetRegistration {
	static String name;
	static String petName, petAddress, petRegPrice, petDOB, petCity, petState;

	static Scanner scanner;

	public static void registerPet() {
		initApplication();
		retrieveApplication();
		retrievePetDetails();
		displayPetDetails();
		exitApplication();
	}

	/**
	 * 
	 */
	private static void displayPetDetails() {
		System.out.println("\n Pet Details:");
		System.out.println("----------------------------");
		System.out.println("name: " + petName);
		System.out.println("Address: " + petAddress);
		System.out.println("City: " + petCity);
		System.out.println("State: " + petState);
		System.out.println("DOB: " + petDOB);
		System.out.println("Registration Price: " + petRegPrice);

	}

	private static void exitApplication() {
		System.out.println("Thank you for using the Application");
		System.out.println("Good bye " + name);
	}

	private static void initApplication() {
		scanner = new Scanner(System.in);
		System.out.println("Welcome to the Pet Registration App");
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
		petName = obtainString("What is your pet's name: ");
		petAddress = obtainString("What is " + petName + "'s Address: ");
		petCity = obtainString("What is " + petName + "'s City: ");
		petState = obtainString("What is " + petName + "'s  State: ");
		petDOB = obtainString("What is " + petName + "'s  DOB (MM/DD/YYYY): ");

	}
}
