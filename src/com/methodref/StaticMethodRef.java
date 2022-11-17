package com.methodref;
//Introduced in Java 8
public class StaticMethodRef {

	public static void main(String[] args) {
		Payment p = StaticMethodRef::creditPay;
		p.pay();
	}
	
	public static void creditPay() {
		System.out.println("Paying through credit card");
	}
}

interface Payment {
	void pay();
}