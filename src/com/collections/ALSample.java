package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ALSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("Vijay");
		al.add("Shar");
		al.add("Sai");
		al.add("Drashti");
		al.add("Shar");
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Navis");
		al2.add("Anu");
		
		//2. only forward
		//3. list move for or back
		al.addAll(al2);
		
		//System.out.println(al);
		
		//1. iterate ArrayList using iterator
		Iterator<String> it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
