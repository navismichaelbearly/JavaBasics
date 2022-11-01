package com.n2s;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment2 {
	ArrayList<String> strList = new ArrayList<String>();
	public static void main(String[] args) {
		String inputQuestion;
		String name;
		int age;
		Assignment2 a = new Assignment2();
		Scanner inputData = new Scanner(System.in);
		do {
			System.out.println("Please enter your Name");
			name = inputData.next();
			System.out.println("Pleae enter your age");
			age = inputData.nextInt();
			a.strList.add("Name is " + name + " and age is " + age);
			System.out.println("Do you wish to continue? (y/n)?");
			inputQuestion = inputData.next();
		}
		while(inputQuestion.equals("y"));
		int len = a.strList.size();
		for(int i =0; i<len; i++) {
			System.out.println(a.strList.get(i));
		}
		inputData.close();
	}
}
