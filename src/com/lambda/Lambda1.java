package com.lambda;
//Introduced in Java 8
public class Lambda1 {

	public static void main(String[] args) {
		SingleParam sp = name -> { 
			System.out.println("My name is " + name); 
		};
		sp.displayName("Vijay");
		
		DoubleParam dp1 = (a,b) -> ( a + b );
		System.out.println(dp1.add(2, 3));
		
		DoubleParam dp2 = (a,b) -> {
			return a + b;
		};
		System.out.println(dp2.add(10, 10));
	}

}

@FunctionalInterface // interface contains only one method
interface SingleParam {
	public abstract void displayName(String name);
}

@FunctionalInterface
interface DoubleParam {
	public abstract int add(int a, int b );
}