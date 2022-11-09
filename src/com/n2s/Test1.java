package com.n2s;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example example = new Example();
		example.age = 10;
		System.out.println(example.age);
		//example.age;
		System.out.println(example.add(10, 10));
		
		Example2 example2 = new Example2();
		System.out.println(example2.multiply(20, 20));
		
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = "Hello";
		
		String s4 = new String("Hello");
		String s5 = new String("Hello");
		
		System.out.println(s1 == s3);
		System.out.println(s2 == s4);
		System.out.println(s4 == s5);
		System.out.println(s4.equals(s4));
	}

}
