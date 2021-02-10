public class Demo extends Main {

	public void method() {
		System.out.println("method called from subclass");
	}

	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.method();
	}
}