package COM.TNS.ENUM;


enum Level{
	LOW,
	MEDIUM,
	HIGH
}

public class enum3 {
	
	public static void main(String[] args) {
		Level obj=Level.LOW;
		switch(obj) {
		case LOW:
			System.out.println("Case is low");
			break;
		case MEDIUM:
			System.out.println("Case is Medium");
			break;
		case HIGH:
			System.out.println("Case is High");
			break;
		}
	}

}
