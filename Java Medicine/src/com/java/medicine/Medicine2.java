package com.java.medicine;

import java.util.Scanner;

public class Medicine2 {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		enterYouName();
		int age = enterYouAge();
		boolean isValidAge = checkAge(age);

		// Complete your register
		if (isValidAge) {
			String subject = enterYouSubject();
			boolean isAvaliableSubject = checkSubjects(subject, age);

			if (isAvaliableSubject) {
				System.out.println("Welcome in your Course.");
				enterYouEmail();
			} else {
				System.out.println("Sorry this " + subject + " is NOT available");
			}

		} else {
			System.out.println("Sorry Your age is Not Available in our course !");

		}
		input.close();

	}

	private static void enterYouName() {
		System.out.print("Enter your name : ");
		String name = input.nextLine();
		System.out.println("Your name is : " + name);
	}

	private static String enterYouSubject() {
		System.out.print("Subject : ");
		String subject = input.nextLine();
		System.out.println("Your Subject is : " + subject);
		return subject;
	}

	private static boolean checkSubjects(String subject, int age) {
		if (subject.equals("Physiology")) {
			System.out.println("Not Avaliable");
			return false;
		} else if (subject.equals("Anatomy")) {
			System.out.println("Avaliable in 9/8/2018");

			return true;
		} else if (subject.equals("Bio")) {
			System.out.println("Avaliable in next summer");
			return true;
		}

		return false;
	}

	private static int enterYouAge() {
		System.out.print("Enter your age : ");
		int age = input.nextInt();
		input.nextLine();
		System.out.println("Your age is : " + age);
		return age;
	}

	private static boolean checkAge(int age) {
		if (age >= 20 && age < 26) {
			System.out.println(" Avaliable age");
			return true;
		} else if (age >= 26 && age > 31) {
			System.out.println("Avaliable in 9/8/2018");
			return true;
		} else {
			System.out.println("Not Avaliable Age ");
			return false;
		}
	}

	private static void enterYouEmail() {
		System.out.print("Enter your email : ");
		String email = input.nextLine();
		System.out.println("Your email is : " + email);
	}

}
