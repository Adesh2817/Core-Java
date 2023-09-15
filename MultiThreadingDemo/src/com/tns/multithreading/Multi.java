package com.tns.multithreading;

class Multi extends Thread{

	public void run() {
		System.out.println("Thread is running");
	}



public static void main(String[] args) {
	Multi ti=new Multi();
	ti.start();

}
}