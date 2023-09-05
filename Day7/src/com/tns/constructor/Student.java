package com.tns.constructor;

public class Student {

	int id;
	String name;
	Student(int i,String n){
		id=i;
		name=n;
		
	}
	void display() {
		System.out.println(id + " " + name);
	}
	
	public static void main(String[] args) {
		Student s= new Student(1,"Adesh");
		s.display();

	}

}
