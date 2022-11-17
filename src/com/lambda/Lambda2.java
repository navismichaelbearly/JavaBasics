package com.lambda;

import java.util.ArrayList;
import java.util.List;
//Introduced in Java 8
public class Lambda2 {

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("John");
		l.add("James");
		l.add("Peter");
		
		l.forEach((n)-> System.out.println(n) );

	}

}
