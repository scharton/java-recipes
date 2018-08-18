package hello;

public class HelloMain {
	
	public String getHelloMessage() {
		return ("Hello");
	}

	public static void main(String[] args) {
		HelloMain hm = new HelloMain();
		System.out.println(hm.getHelloMessage());
	}

}
