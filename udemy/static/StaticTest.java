public class StaticTest {

	private static int numInstances = 0;
	private int number;

	public StaticTest(int number) {
		this.number = number;
		numInstances++;
	}

	private static StaticTest t;
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			t = new StaticTest(i);
			System.out.println("Number: " + t.number + "; numInstance: " + t.numInstances);
		}
	}
}