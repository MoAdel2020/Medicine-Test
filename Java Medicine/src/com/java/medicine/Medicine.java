package com.java.medicine;

import java.util.Scanner;

public class Medicine {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your name : ");
		String name = input.nextLine();
		System.out.println("Your name is : " + name);
		
		System.out.print("Enter your age : ");
		int age = input.nextInt();
		System.out.println("Your age is : " + age);
		
		System.out.print("Subject : ");
		String subject = input.nextLine();
		System.out.println("Your Subject is : " + subject);
		input.close();
		
		
	}

	/*
	 * public static void main(String[] args) { Scanner input = new
	 * Scanner(System.in); System.out.print("Enter your name :  " ); String name =
	 * input.nextLine();
	 * 
	 * System.out.print("your name :  " +name);
	 * 
	 * input.close();
	 * 
	 * }
	 */
}
