import java.util.Comparator;

public class Main {

	private static Test test1 = new Test(2);
	private static Test test2 = new Test(1);

	public static void main(String[] args) {

		// if(Test.COMP.compare(test1, test2) > 0) {
		// 	System.out.println("São iguais");
		// }
		// else System.out.println("São diferentes");

		//OR

		comparar(test1, test2);
	}

	public static void comparar(Test t1, Test t2) {
		if(test1.compare(t1, t2) > 0) {
			System.out.println("São iguais");
		}
		else System.out.println("São diferentes");
	}
}