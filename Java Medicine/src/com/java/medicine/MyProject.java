package com.java.medicine;

import java.util.Scanner;

public class MyProject {
	static Scanner data = new Scanner(System.in);

	public static void main(String[] args) {
		enterUrName();

		int age = enterUrAge();
		boolean ageTrue = ageValidity(age);
		if (ageTrue) {
			System.out.println("You are Welcome!");
			String subject = enterSubject();
			boolean subjectTrue = SubjectValidity(subject);
			if (subjectTrue) {
				System.out.println(subject + "  is Available ");
				enterUrEmail();
			} else {
				System.out.println(subject + " is Not Available ");
			}

		} else {
			System.out.println("Sorry! You are OUT !");
		}

	}

	private static void enterUrName() {
		System.out.print("Enter your Name :   ");
		String name = data.nextLine();
		System.out.println("Welcome  " + name);
	}

	private static int enterUrAge() {
		System.out.print("Enter your age :   ");
		int age = data.nextInt();
		data.nextLine();
		System.out.println("Your age is :  " + age);
		ageValidity(age);
		return age;
	}

	private static boolean ageValidity(int age) {
		if (age >= 25 && age <= 35) {
			return true;

		} else {
			return false;
		}
	}

	private static String enterSubject() {
		System.out.print("Enter Subject :   ");
		String subject = data.nextLine();
		SubjectValidity(subject);
		return subject;
	}

	private static boolean SubjectValidity(String subject) {
		if (subject.equals("Anatomy") || subject.equals("Bio")) {
			return true;
		} else {
			return false;
		}

	}

	private static void enterUrEmail() {
		System.out.print("Enter your Email :   ");
		String Email = data.nextLine();
		System.out.println("Thank You! You are registered successfully");
	}
}