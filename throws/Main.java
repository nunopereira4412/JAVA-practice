import java.lang.ArithmeticException;

public class Main {
	public static void main(String[] args) {

		try {
			myMethod(0);
			myMethod(1);
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException in try block");
		}

	}

	public static void myMethod(int num) throws ArithmeticException {
		if(num == 1) 
			throw new ArithmeticException("ArithmeticException in throw new");
	}
}

