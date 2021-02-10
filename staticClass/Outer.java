public class Outer {

	static String nome = "teste";

	static String a = "aaaa";
	static String b = "bbbb";

	static class Inner {

		public void method() {
			System.out.println(nome);
		}
	}

	public static void main(String[] args) {
		Outer.Inner obj = new Outer.Inner();
		obj.method();

		System.out.println(a);
		System.out.println(b);
	}
}