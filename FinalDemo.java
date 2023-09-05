package com.tns.keyword;

final class A{
	void run() {
		System.out.println("This is A class Method");
	}
}

class B extends A{
	void run() {
		System.out.println("This is B class Method");
	}
}

public class FinalDemo {

	public static void main(String[] args) {
		B obj=new B();
		obj.run();

	}

}
