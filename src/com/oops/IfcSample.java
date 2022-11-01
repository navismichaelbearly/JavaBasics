package com.oops;

public class IfcSample implements Ifc1, Ifc2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IfcSample ifc = new IfcSample();
		Ifc1.test2();
		ifc.test1();
		System.out.println(ifc.add(ifc1_x, ifc2_y));
		System.out.println(ifc.sub(10, 7));
	}
	
	@Override
	public int sub(int x, int y) {
		// TODO Auto-generated method stub
		return x - y;
	}

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return x + y;
	}

	@Override
	public void test3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int multi(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}

}
