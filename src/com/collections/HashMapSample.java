package com.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapSample {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(100, "Vijay");
		hm.put(75, "Drashti");
		hm.put(null, "Vijay");
		hm.put(125, "Sai");
		hm.put(115, "Drashti");
		hm.put(null, "Anu");
		hm.put(150, null);
		hm.put(135, "Sharmila");
		hm.put(200, null);
		
		//it will not sort the key
		//it will allow only one null key
		//key should be unique.
		//null will overwrite
		
		
		for(Map.Entry<Integer, String> me: hm.entrySet() ) {
			System.out.println(me.getKey() + " " + me.getValue());
		}
	}

}
