package com.collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class VectorSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// synchronized
		// thread safe
		Vector<String> v = new Vector<String>();
		v.add("Vijay");
		v.add("Shar");
		v.add("Sai");
		//*. this is only available for Vector
		v.addElement("John");
		
		Enumeration<String> e = v.elements();
		while(e.hasMoreElements()) {
			//*. this is only available for Vector
			System.out.println(e.nextElement());
		}
		

	}

}
