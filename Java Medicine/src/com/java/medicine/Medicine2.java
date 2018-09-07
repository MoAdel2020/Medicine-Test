package com.java.medicine;

import java.util.Scanner;

public class Medicine2 {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		enterYouName();
		int age = enterYouAge();
		String subject = enterYouSubject();
		checkSubjects(subject, age);
		input.close();

	}

	private static void enterYouName() {
		
		System.out.print("Enter your name : ");
		String name= input.nextLine();
		System.out.println("Your name is : " + name);

	}

	private static String enterYouSubject() {
		System.out.print("Subject : ");
		String subject = input.nextLine();
		System.out.println("Your Subject is : " + subject);
		return subject;
	}

	private static void checkSubjects( String subject, int age) {
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

	private static int enterYouAge() {
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
