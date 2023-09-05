//Compile Time Overloading

package com.tns.polymorphism;

public class MethodOverloadingDemo {
	int add() {
//		int method
		int a=10,b=20,c;        
		c=a+b;
		System.out.println(c);
//		return
		return c;
	}
	void add(int x,int y) {
		int c=x+y;
		System.out.println(c);
		
	}
	void add(int x,double y) {
		double c= x+y;
		System.out.println(c);
	}
	

	public static void main(String[] args) {
		MethodOverloadingDemo obj = new MethodOverloadingDemo();
		int a=obj.add();
		obj.add(10, 50);
		obj.add(400, 4628.290);

	}

}
