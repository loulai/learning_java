
public class Main {
	public static void main(String[] args) {
		try {
			getArrayItem();
		} catch (IndexOutOfBoundsException e) {
//			e.printStackTrace();
			System.out.println("Hello sir, there is an error in thy code");
		}
		
	}

	private static void getArrayItem() 
		throws IndexOutOfBoundsException {
		String[] myArray = {"Hello"};
		System.out.println(myArray[1]);
	}
}