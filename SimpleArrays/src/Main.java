
public class Main {
	
	public static void main(String[] arg) {
		int[] arrayOne = new int[3];
		for (int i = 0; i < arrayOne.length; i++){
			System.out.print(arrayOne[i]);
		}
		
		int arrayTwo[] = new int[3];
		for(int i = 0; i < arrayTwo.length; i++){
			System.out.print(arrayTwo[i]);
		}
		
		int[] arrayThree = {29, 90, 472, 27, 4};
		for (int i = 0; i < arrayThree.length; i++){
			System.out.println(i + 1 + ". The number is: " + arrayThree[i]);
		}
	}

}
