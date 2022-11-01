package com.oops;

class SuperRiding {
	public void msg() {
		System.out.println("Running from super riding");
	}
}

public class MethodOverriding extends SuperRiding {

	public static void main(String[] args) {
		MethodOverriding mo = new MethodOverriding();
		mo.msg();
	}
	public void msg() {
		System.out.println("Running from method overriding");
		super.msg();
	}
}


