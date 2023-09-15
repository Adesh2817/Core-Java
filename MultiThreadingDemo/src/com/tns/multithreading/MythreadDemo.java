package com.tns.multithreading;

public class MythreadDemo implements Runnable {
	public void run() {
	System.out.println("Now the Thread is still running....");
	}

	public static void main(String[] args) {
		Runnable r=new MythreadDemo();
		Thread th=new Thread(r,"my new thread...");
		th.start();
		
		String st=th.getName();
		System.out.println(st);
		
	}

}
