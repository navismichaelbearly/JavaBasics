package com.n2s;

class SuperClass {
	public final void superdisplay() {
		System.out.println("Inside super class");
	}
}

//public class FinalSample extends SuperClass {
public class FinalSample {
	static int y;
	static String s;
	static final int z = 10; //we need to initial value to z, because it is z 
	static public final int x = 5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(y);
		System.out.println(s);
		FinalSample fs = new FinalSample();
		fs.superdisplay();
	}
	
	public void superdisplay() {
		System.out.println("Inside super class");
	}

}
