package com.oops;

public class Abstraction extends Calc {
	
	public static void main(String[] args) {
		Abstraction a = new Abstraction();
		System.out.println(a.add(10, 20));
		System.out.println(a.sub(30, 10));
		System.out.println(a.mult(10, 10));
	}

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return x + y;
	}

	@Override
	public int sub(int x, int y) {
		// TODO Auto-generated method stub
		return x - y;
	}
	
}

abstract class Calc {
	public abstract int add(int x, int y);
	
	public abstract int sub(int x, int y);
	
	public int mult(int x, int y) {
		return x * y;
	}
}