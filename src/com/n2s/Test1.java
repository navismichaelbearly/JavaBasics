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
	}

}
