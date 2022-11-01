package com.oops;

public class MethodOverloading {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading mo = new MethodOverloading();
		//MethodOverloading mo1; // we cannot use this.
		System.out.println(mo.met("Navis"));
		System.out.println(new MethodOverloading().met("without name"));
		System.out.println(mo.met(10.25f, 10.02f));
		System.out.println(mo.met(4, 5));
		System.out.println(mo.met(10, 10, 20));
		
		/*
		 * Method Overloading
		 */
		//compile time polymorphism
		//static binding.
		//early binding.
		
		//Decision making will done in the compile time.
	}
	
	public int met(int x, int y) {
		return x+y;
	}
	
	public int met(int x, int y, int z) {
		return x+y+z;
	}
	
	public float met(float x, float y) {
		return x+y;
	}
	
	public String met(String s) {
		return s;
	}
}
