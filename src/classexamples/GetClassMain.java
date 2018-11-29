package classexamples;

public class GetClassMain {

	public static void main(String[] args) {
		Parent parent = new Parent();
		Class<? extends Parent> pClassName = parent.getClass();
		System.out.println(pClassName);

		
		Child child = new Child();
		Class<? extends Child> cClassName = child.getClass();
		System.out.println(cClassName);
		
	}
}
