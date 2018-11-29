package lambdas;

public class Lambda1 {
	// static add = () -> System.out.print("Hello");

	public static void main(String[] args) {
		Math hw = () -> System.out.print("Hello");
		Lambda1 l1 = new Lambda1();
		l1.greet(hw);

		// System.out.println("Hi");
		new Math() {
			
			@Override
			public void echo() {
				// TODO Auto-generated method stub
				
			}
		};

	}
	
	public void greet(Math k) {
		k.echo();

	}
}

interface Math {

	void echo();
//	Integer addTwoIntegers(Integer a, Integer b);
}
