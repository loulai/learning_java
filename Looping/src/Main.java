
public class Main {
	
	static private String[] months = 
		{"Jan", "Feb", "March", "April"};

	public static void main(String[] args) {
//		for (int i = 0; i< months.length ; i++) {
//			System.out.println(months[i]);
//		}
		
//		for (String elem : months) {
//			System.out.println(elem);
//		}
		
		int counter = 0;
		while (counter < months.length) {
			System.out.println(months[counter]);
			counter ++;
		}
		
		

	}

}