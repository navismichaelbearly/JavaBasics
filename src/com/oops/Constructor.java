package com.oops;

public class Constructor {
	public static void main(String[] args) {
		Constructor ct = new Constructor();
		new Constructor();
		new Constructor(10);
		new Constructor("Navis", 10);
		
		Child child = new Child();
	}
	
	Constructor() { //this default constructor should get added if we have additional constructor
		System.out.println("I am in default constructor");
	}
	
	Constructor(int x) {
		System.out.println("I am in single param constructor " + x);
	}
	
	Constructor(String s, int x) {
		this(); //this should be first line in constructor.
		System.out.println("I am in two param constructor " + s + x);
	}
}

class Child extends Constructor {
	
	Child() {
		super(10); //super should be first line in constructor.
		System.out.println("I am in Child class constructor");
	}
}
