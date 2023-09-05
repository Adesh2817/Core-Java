//Runtime Overloading

package com.tns.polymorphism;

class Shape{
	void draw() {
		System.out.println("Not Defined Shape");
	}
}

class Square extends Shape{
	void draw3() {
		System.out.println("Square shape");
	}
}

public class MethodOverrideDemo {

	public static void main(String[] args) {
		Square s =new Square();
		s.draw();

	}

}
