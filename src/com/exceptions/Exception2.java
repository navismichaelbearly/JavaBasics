package com.exceptions;

public class Exception2 {
	public static void main(String[] args) {
		int i = 5;
		String s = null;
		try {
			i = 10 / 0;
			System.out.println(s.length());
			System.out.println(i);
		}
		catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
		catch(NullPointerException npe) {
			npe.printStackTrace();
		}
		//Always the super class Exception at the end.
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
