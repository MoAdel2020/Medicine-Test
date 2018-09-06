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
		input.nextLine();
		System.out.println("Your age is : " + age);

		System.out.print("Subject : ");
		String subject = input.nextLine();
		System.out.println("Your Subject is : " + subject);
		input.close();
		

		if (subject.equals("Physiology") ) {
			System.out.println("Not Avaliable");
			
		} else if (subject.equals("Anatomy")){
			System.out.println("Avaliable in 9/8/2018");
			
		} else if (subject.equals("Bio")){
			System.out.println("Avaliable in next summer");
		}
			
		if (age>=20 && age<26)  {
				System.out.println(" Avaliable age");
				
			} else if (age>=26 && age >31){
				System.out.println("Avaliable in 9/8/2018");
				
			} else {
				System.out.println("Not Avaliable Age ");
	}
	}
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

