package com.exceptions;

public class Exception3 {

	public static void main(String[] args) {
		
		try {
			int i = 20 / 0;
			System.out.println(i);
		}
		catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
		finally {
			//in all
			System.out.println("Finally always get executed");
		}
		//it will not get executed.
		System.out.println("Maintaing the flow of application");
	}

}
