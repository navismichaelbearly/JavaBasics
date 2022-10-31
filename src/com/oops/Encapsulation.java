package com.oops;

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s = new Sample();
		s.display1();
		//InnerSample i = new InnerSample(); // It will not work	
	}
}

class Sample {
	public int x = 5;
	private int y = 10;
	InnerSample is = new InnerSample();
	
	public void display1() {
		System.out.println("display1");
		is.display2();
		display3();
	}
	private static void display3() {
		System.out.println("display3");
	}
	private class InnerSample {
		
		public void display2() {
			y = 3;
			System.out.println(y);
			System.out.println("display2");
		}
	}
}
