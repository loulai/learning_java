
public class Main {

	public static void main(String[] args) {
//		int monthNumber = 3;
		
		Month myMonth = Month.JAN;
		
		switch(myMonth) {
		case JAN:
			System.out.println("Its January!");
			break;
		case FEB:
			System.out.println("It's Feb");
			break;
		default:
			System.out.println("It ain't Jan or Feb sweetie");
			break;
		}

	}

}
