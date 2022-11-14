package com.collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PQSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//*. first in first out.
		//*. ex. cinema ticket
		//*. it will save in random order
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("Vijay");
		pq.add("Anu");
		pq.add("Sai");
		pq.add("Drashti");
		pq.add("Navis");
		
		Iterator<String> it = pq.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("head: " + pq.element()); // if the list is empty it throws NoSuchElementException.
		System.out.println("head: " + pq.peek()); // if the list if empty it return Null
		
		pq.remove(); // if the list is empty it throws NoSuchElementException.
		pq.poll(); // if the list if empty it return Null
		System.out.println("after removing two elements ");
		Iterator<String> it2 = pq.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		System.out.println("head: " + pq.element());
		System.out.println("head: " + pq.peek());
		
		
		//priority queue is stored in ascending order or not?
	}

}
