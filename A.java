package com.tns.access;

class Simple {

	
	 int data=10;
	
	void show()
	{
		System.out.println("Example of private access modifiers");
	}
}

public class A{
	public static void main(String []args) {
		
		Simple obj=new Simple();
		
		System.out.println(obj.data);
		obj.show();
	}
}