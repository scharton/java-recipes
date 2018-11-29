package hello;

public class HelloMain {
	
	public String getHelloMessage() {
		return ("Hello");
	}

	public static void main(String[] args) {
		HelloMain hm = new HelloMain();
		String s = "foo";
		String t = "bar";
		System.out.println(hm.getHelloMessage());

	}

}
