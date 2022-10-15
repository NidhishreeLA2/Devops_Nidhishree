package com;

public class Thread1 implements Runnable{

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread 1 is running");
	}
	
	public static void main(String args[]) {
		Thread1 t = new Thread1();
		Thread t1 = new Thread(t);
		t1.start();
	}

}
