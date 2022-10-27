package com.n2s;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome");
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		
		int len = args.length;
		for(int i=0;i<len;i++) {
			System.out.println(args[i]);
		}
		
		Example obj = new Example();
		System.out.println(obj.add(2,3));
		System.out.println(sub(9, 4));
	}
	
	public int add(int i, int j) {
		return i + j;
	}
	
	public static int sub(int i, int j) {
		return i - j;
	}
	
}

class Example2 {
	
}
