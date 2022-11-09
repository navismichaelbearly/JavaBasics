package com.collections;

import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class HashTableSample {

	public static void main(String[] args) {
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(100, "Vijay");
		ht.put(75, "Drashti");
		ht.put(125, "Sai");
		ht.put(115, "Drashti");
		//ht.put(150, null); - NOTE - null value is not allowed
		ht.put(135, "Sharmila");
		//ht.put(200, null);
		
		//it will sort the key
		//it will not allow the key and value null
		//key should be unique.
		//it is SYNCHRONIZED - Thread Safe
		
		
		for(Map.Entry<Integer, String> me: ht.entrySet() ) {
			System.out.println(me.getKey() + " " + me.getValue());
		}

	}

}
