package com.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DQSample {
	//ArrayDeQueue class is derived from DeQueue interface
	public static void main(String[] args) {
		
		Deque<String> dq = new ArrayDeque<String>();
		//we can add/remove from both end.
		dq.offer("Vijay");
		dq.offer("Sai");
		dq.add("Drahti");
		dq.offerFirst("James");
		dq.offerLast("Navis");
		//by default it will add at the current address.
		dq.offer("Anu");
		dq.offerFirst("John");
		
		for(String s: dq) {
			System.out.println(s);
		}
		
		dq.pollLast();
		System.out.println("========================");
		for(String s: dq) {
			System.out.println(s);
		}
	}

}
