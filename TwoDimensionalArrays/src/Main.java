
public class Main {

	public static void main(String[] args) {
		
		String[][] countries = new String[3][2];
		
		countries[0][0] = "Malaysia";
		countries[0][1] = "KL";
		
		countries[1][0] = "Australia";
		countries[1][1] = "Canberra";
		
		countries[2][0] = "China";
		countries[2][1] = "Beijing";
		
		for (int i = 0; i < countries.length; i++){
			for (int j = 0; j < countries[i].length; j++){
				if (j == 0){
					System.out.println("Country: " + countries[i][j]);
				}
				else {
					System.out.println("State: " + countries[i][j]);
				}
				
			}
		}
		
	}

}
