package com.thread;

public class ThreadSample1 implements Runnable {

	public static void main(String[] args) throws InterruptedException {
		
		ThreadSample1 ts1 = new ThreadSample1();
		Thread t = new Thread(ts1);
		t.start();
		for(int i =0; i < 5; i++) {
			System.out.println("Running inside main method");
			Thread.sleep(1000);
		}

	}

	@Override
	public void run() {
		int i =0;
		while(i<5) {
			System.out.println("Thread is running");
			i++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
