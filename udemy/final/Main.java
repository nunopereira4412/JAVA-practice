public class Main {

	public static void main(String[] args) {
		SomeClass one = new SomeClass("one");
		SomeClass two = new SomeClass("two");
		SomeClass tree = new SomeClass("tree");

		System.out.println(one.getInstanceNumber());
		System.out.println(two.getInstanceNumber());
		System.out.println(tree.getInstanceNumber());

		
	}
}