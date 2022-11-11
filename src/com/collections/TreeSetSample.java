package com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// eleminate/override duplicates
		// maintain data in asc order.
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Vijay");
		ts.add("Shar");
		ts.add("Sai");
		ts.add("Drashti");
		ts.add("Shar");
		
		
		Iterator<String> it = ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//comparator / comparable (common for set) it will do the sorting of TreeMap
		//Collection is used to store the object.
		//our class will used as generics.
		//if one con comparable
		//if more than one argument in comparables
	}

}
