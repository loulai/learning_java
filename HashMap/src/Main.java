import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		HashMap<String, String> clothing = new HashMap<String, String>();
		
		clothing.put("gloves", "hands");
		clothing.put("shirts", "body");
		
		System.out.println(clothing);
		
		System.out.println(clothing.get("gloves"));

	}	

}
