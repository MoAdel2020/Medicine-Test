package com.java.medicine;

import java.util.Scanner;

public class Medicine2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		enterYouName(input);
		int age = enterYouAge(input);
		String subject = enterYouSubject(input);
		
		checkSubjects(input, subject, age);

		input.close();

	}

	private static void enterYouName(Scanner input) {
		System.out.print("Enter your name : ");
		String name = input.nextLine();
		System.out.println("Your name is : " + name);
	}

	private static String enterYouSubject(Scanner input) {
		System.out.print("Subject : ");
		String subject = input.nextLine();
		System.out.println("Your Subject is : " + subject);
		return subject;
	}

	private static void checkSubjects(Scanner input, String subject, int age) {
		if (subject.equals("Physiology")) {
			System.out.println("Not Avaliable");

		} else if (subject.equals("Anatomy")) {
			System.out.println("Avaliable in 9/8/2018");
			System.out.print("Enter your email : ");
			String email = input.nextLine();
			System.out.println("Your email is : " + email);

			checkAge(age);

		} else if (subject.equals("Bio")) {
			System.out.println("Avaliable in next summer");

			checkAge(age);
		}
	}

	private static int enterYouAge(Scanner input) {
		System.out.print("Enter your age : ");
		int age = input.nextInt();
		input.nextLine();
		System.out.println("Your age is : " + age);
		return age;
	}

	private static void checkAge(int age) {
		if (age >= 20 && age < 26) {
			System.out.println(" Avaliable age");

		} else if (age >= 26 && age > 31) {
			System.out.println("Avaliable in 9/8/2018");

		} else {
			System.out.println("Not Avaliable Age ");
		}
	}
}
