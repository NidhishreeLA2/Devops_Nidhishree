package com;


public class Thread2 implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread2 t = new Thread2();
		Thread t2 = new Thread(t);
		t2.start();
		

	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread 2 is running");
		
	}

}
