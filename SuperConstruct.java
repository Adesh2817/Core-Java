package Inheritance;

class Parent{
	
	Parent(int a){
		System.out.println("This is Parent Constructor " + a);
	}
}

class Child extends Parent{
	
	Child(){
		super(100);
		System.out.println("This is Child Constructor");
	}
}

public class SuperConstruct {

	public static void main(String[] args) {
		Child obj = new Child();

	}

}
