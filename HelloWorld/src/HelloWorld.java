
public class HelloWorld {

	public static void main(String[] args) {
		Welcomer thang = new Welcomer();
		thang.sayHello();
	}

}

public class Welcomer {
	private String welcome = "Hello";
	public void sayHello() {
		System.out.println(welcome);
	}
}
