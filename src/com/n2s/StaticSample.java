package com.n2s;

public class StaticSample {
	static int x = 5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1. Inside Main method");
		X.display2();
		display1();
		System.out.println("2. value is " + x);
	}

	public static void display1() {
		System.out.println("3. inside static display1 method");
		x = 12;
	}
	
	static class X {
		public static void display2() {
			System.out.println("4. inside static inner class");
			x = 4;
		}
	}
	
	static {
		System.out.println("5. Inside static block");
		x = 21;
	}
}
//5.1.4.3.2 - 12