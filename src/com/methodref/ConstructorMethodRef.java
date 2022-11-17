package com.methodref;
//Introduced in Java 8
public class ConstructorMethodRef {

	public static void main(String[] args) {

		Message m = Display::new;
		m.getMessage("Hello Constructor method reference call");

	}

}

class Display {
	Display(String msg) {
		System.out.println(msg);
	}
}


interface Message {
	Display getMessage(String msg);
}
