package com.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll1 = new LinkedList<String>();
		ll1.add("Vijay");
		ll1.add("Shar");
		ll1.add("Sai");
		ll1.add("Drashti");
		ll1.add("Shar");
		
		ListIterator<String> li = ll1.listIterator();
		
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("----------------------");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		
		//*. Linked list is faster than array list due to the chaining.
		//*. Doubly will have prev and next address compare to Linked list.
		//*. ArrayList is using Binary Search to identify the data.
		//*. iter
	}

}
