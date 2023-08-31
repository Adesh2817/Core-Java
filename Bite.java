package com.tns.keyword;

public class Bite {
	
	final int speedlimit = 90;
	
//	Can't process as the final keyword is initilaized
//	void run() {
//		speedlimit=100;
//	}
	

	public static void main(String[] args) {
		Bite obj = new Bite();
		System.out.println(obj.speedlimit);

	}

}
