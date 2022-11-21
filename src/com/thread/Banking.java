package com.thread;
public class Banking {
	public static void main(String[] args) {	
		Customer c = new Customer();
		Thread t1 = new Thread(){
			public void run() {
				c.withdraw(15000);
			}
		};
	
		Thread t2 = new Thread(){
			public void run() {
				c.deposit(10000);
			}
		};
		t1.start();
		t2.start();
	}
}
class Customer {
	public static int balance = 10000;
	synchronized void withdraw(int amount) {
		if(balance < amount) {
			System.out.println("Less balance waiting for deposit");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			balance -= amount;
			System.out.println("Withdraw completed");
			
		}	
	}
	synchronized void deposit(int amount) {
		System.out.println("Going to deposit");
		balance += amount;
		System.out.println("Deposit completed");
		notify();
	}
}
