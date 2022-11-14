package com.exceptions;

public class Exception5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exception5 e5 = new Exception5();
		try {
			e5.ageValidation(10);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Maintaing the flow of application");
	}
	
	public void ageValidation(int age) throws InvalidAgeException {
		if(age < 18 ) 
			throw new InvalidAgeException("Not eligible to vote");
		else 
			System.out.println("Eligible to vote");
	}
}
