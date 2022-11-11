package com.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// it will not have duplicate
		// it will not throw error if there is duplication...rather it will overwrite.
		HashSet<String> hs = new HashSet<String>();
		hs.add("Vijay");
		hs.add("Shar");
		hs.add("Sai");
		hs.add("Drashti");
		hs.add("Shar");
		
		
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
