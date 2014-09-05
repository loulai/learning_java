import java.util.ArrayList;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> startups = new ArrayList<String>();
		
		startups.add("Ringly");
		startups.add("Potato");
		
		ListIterator<String> listIterator= startups.listIterator();
		
		while(listIterator.hasNext()) {
			String myValue = listIterator.next();
			System.out.println(myValue);
		}

	}

}
