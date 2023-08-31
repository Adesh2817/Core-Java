package Inheritance;
class base{
	int a = 10;
}

class Derived extends base{
	int b = 20;
	void show() {
		System.out.println(a);
		System.out.println(b);
	}
}

public class SuperVal {

	public static void main(String[] args) {
		Derived obj =new Derived();
		obj.show();

	}

}
