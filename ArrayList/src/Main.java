import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		ArrayList<String> shoes = new ArrayList<String>();
		
		shoes.add("Aldo");
		shoes.add("Windsor Smith");
		
		System.out.println(shoes);
		
		int pos = shoes.indexOf("Aldo");
		System.out.println(pos);
		
		shoes.remove(0);
		System.out.println(shoes);
	}

}