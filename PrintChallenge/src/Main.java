
public class Main {

	public static void main(String[] arg){
		
		int outerLoop = 0, innerLoop = 0;
		
		for (outerLoop = 1; outerLoop <= 5; outerLoop ++) {
			for(innerLoop = 1; innerLoop <= outerLoop; innerLoop++){
				System.out.print(outerLoop);
			}
			
		}
		
	}
/*		1
		12
		123
		1234
		123456
		12345
		1234
		123
		12
		1
*/
		}
