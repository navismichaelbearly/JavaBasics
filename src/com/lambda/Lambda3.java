package com.lambda;
//Introduced in Java 8
public class Lambda3 {

	public static void main(String[] args) {

		Runnable r  = () -> {
			System.out.println("Thread is running");
		};
		Thread t = new Thread(r);
		t.start();
	}

}
