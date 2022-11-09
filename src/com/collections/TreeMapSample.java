package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapSample {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(100, "Vijay");
		tm.put(75, "Drashti");
		//tm.put(null, "Vijay");
		tm.put(125, "Sai");
		tm.put(115, "Drashti");
		//tm.put(null, "Anu");
		tm.put(150, null);
		tm.put(135, "Sharmila");
		tm.put(200, null);
		
		//it will sort the key
		//it will not allow the key null
		
		//key should be unique.
		
		
		for(Map.Entry<Integer, String> me: tm.entrySet() ) {
			System.out.println(me.getKey() + " " + me.getValue());
		}

	}

}
