package com.thread;

public class SyncSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table t = new Table();
		Thread t1 = new Thread(new Thread1(t));
		Thread t2 = new Thread(new Thread2(t));
		t1.start();
		t2.start();
	}

}

class Table {
	synchronized public void printTable(int i) throws InterruptedException {
		for(int x = 1; x <= 5; x++) {
			System.out.println(x + " * " + i + " = " + (i*x));
			Thread.sleep(1000);
		}
	}
}

class Thread1 implements Runnable {
	Table t;
	public Thread1(Table t) {
		super();
		this.t = t;
	}
	@Override
	public void run() {
		try {
			t.printTable(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
}


class Thread2 implements Runnable {
	Table t;
	public Thread2(Table t) {
		super();
		this.t = t;
	}
	@Override
	public void run() {
		try {
			t.printTable(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
}