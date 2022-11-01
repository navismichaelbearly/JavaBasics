package com.oops;

public interface Ifc1 {
	
	public static int ifc1_x = 5; //until Java 7 //by default variable is final - final keyword is optional
	
	public abstract int add(int x, int y); //until Java 7
	
	//public int sub(int x, int y); //until Java 7 //abstract key is optional inside interface.
	
	//normal methods and static methods are allowed from Java 8
	
	public default void test1() {
		
	}
	
	public static void test2() {
		
	}
	
	public void test3();
	
	// private void test3(); //private method is allowed from Java 9 version

}
