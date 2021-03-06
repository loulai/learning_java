import java.io.*;
public class Calculator {

	public static void main(String[] args) {
//		String s1 = getInput("Enter a numeric input: ");
//		String s2 = getInput("Enter the second numeric input: ");
//		
//		double result = addTwoValues(s1, s2);
//		
//		System.out.print("Those two summed together equal: " + result);
		
		double resultOfMultiple = addMultipleValues(1,2,1,2000, 3);
		
		System.out.println(resultOfMultiple);

	}

	private static double addTwoValues(String s1, String s2) {
		double firstInput = Double.parseDouble(s1);
		double secondInput = Double.parseDouble(s2);
		
		double result = firstInput + secondInput;
		return result;
	}
	
	private static String getInput(String prompt) {
		BufferedReader stdin = new BufferedReader(
				new InputStreamReader(System.in));
				
		System.out.print(prompt);
		System.out.flush();
		
		try {
			return stdin.readLine();
		} catch (Exception e) {
			return "Error: " + e.getMessage();
		}
	
	}
	
	private static double addMultipleValues(double ... values){
		double result = 0d;
		for (double elem:values) {
			result = result + elem;
		}
		return result;
	}

}
