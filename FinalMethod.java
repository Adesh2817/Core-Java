package com.tns.keyword;

class Base {
	 void run() {
		System.out.println("This is vase class Method");
	}
}

class Sub extends Base{
	
	void run(){
		super.run();
		System.out.println("This is sub class method");
	}
}

public class FinalMethod {

	public static void main(String[] args) {
		Sub obj = new Sub();
		obj.run();

	}

}
