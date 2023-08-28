package com.tns.inheritance;

 class Students {
	int rollno,marks;
	String name;

	void input()
	{
		System.out.println("Enter your Name Rollno and marks");
		
	}

}

class Tom extends Students {
	void display() {
		rollno=1 ;
		marks=99 ;
		name="Tom ";
		System.out.println(name +  rollno + " " + + marks);
	}
}

public class Student{
	public static void main(String[] args) {
		Tom obj = new Tom();
		obj.input();
		obj.display();
		
	}
	
}