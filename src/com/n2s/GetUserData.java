package com.n2s;

import java.util.Scanner;

public class GetUserData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name = s1.next();
		
		System.out.println("Enter your age");
		int age = s1.nextInt();
		
		System.out.println("Name: " + name + " Age: " + age);
		
		s1.close();
	}

}
