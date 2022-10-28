package com.n2s;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		String inputQuestion = "n";
		String name = "";
		int age = 0;
		Scanner inputData = new Scanner(System.in);
		do {
			System.out.println("Please enter your Name");
			name = inputData.next();
			System.out.println("Pleae enter your age");
			age = inputData.nextInt();
			System.out.println("Your name is " + name + " and your age is " + age);
			System.out.println("Do you wish to continue? (y/n)?");
			inputQuestion = inputData.next();
		}
		while(inputQuestion.equals("y"));
		inputData.close();
	}
}
