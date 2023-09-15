package com.tns.multithreading;

public class Mythread {

	public static void main(String[] args) {
		Thread t=new Thread("Thread is here");
		t.start();
		
		String str=t.getName();
		System.out.println(str);
		

	}

}
