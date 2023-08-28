package tns.com.inheritance;

class student1{
	int rollno,marks;
	String name;
	
	void input() {
		System.out.println("Enter your Name,RollNo Marks :");
	}
}

class Adesh extends student1{
	void display() {
		rollno=1;
		marks=95;
		name="Adesh ";
		System.out.println(name + " " + rollno +" "+ marks);
	}
}

public class single {

	public static void main(String[] args) {
		Adesh obj = new Adesh();
		obj.input();
		obj.display();
		

	}

}
