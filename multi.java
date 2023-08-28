package tns.com.inheritance;

class operator1{
	int a,b,c;
	
	void add() {
		a= 60;
		b= 50;
		c= a+b;
		System.out.println("Sum of 2 numbers is : " + c);
	}
	
	void sub() {
		a= 60;
		b= 50;
		c= a-b;
		System.out.println("Subtraction of 2 numbers is : " + c);
	}
}

class operator2 extends operator1{
	
	void mul() {
		a= 60;
		b= 50;
		c= a*b;
		System.out.println("Multiplication of 2 numbers is : " + c);
	}
	
	void div() {
		a= 60;
		b= 50;
		c= a/b;
		System.out.println("Division of 2 numbers is : " + c);
	}
}

class Operator3 extends operator2{
	void rem() {
		a=60;
		b=50;
		c=a%b;
		System.out.println("Remainder of 2 numbers is: " + c);
	}
}

public class multi {

	public static void main(String[] args) {
		Operator3 obj = new Operator3();
			obj.add();
			obj.sub();
			obj.mul();
			obj.div();
			obj.rem();
			

	}

}
