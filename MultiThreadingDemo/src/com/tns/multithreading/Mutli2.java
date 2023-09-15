package com.tns.multithreading;

class Mutli2 implements Runnable {

	public void run() {
		System.out.println("Thread is still running....");
	}
	public static void main(String[] args) {
		Mutli2 m= new Mutli2();
		Thread ti=new Thread(m);
		ti.start();

	}

}
