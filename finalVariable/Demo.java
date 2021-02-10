public class Demo {

	final int MAX_VALUE = 100;

	void myMethod() {
		MAX_VALUE = 101; //erro
	}

	public static void main(String[] args) {
		Demo obj = new Demo();
		obg.myMethod();
	}
}