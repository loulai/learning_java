import java.io.*;
public class Calculator {

	public static void main(String[] args) {
		String s1 = getInput("Enter a numeric input: ");
		String s2 = getInput("Enter the second numeric input: ");
		
		double firstInput = Double.parseDouble(s1);
		double secondInput = Double.parseDouble(s2);
		
		double result = firstInput + secondInput;
		
		System.out.print("Those two summed together equal: " + result);

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

}
