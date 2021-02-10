import java.lang.ArithmeticException;
import java.lang.Exception;
import java.lang.ArrayIndexOutOfBoundsException;

public class Main {

	public static int[] array = new int[3];

	public static void main(String[] args) {
		try {
			array[0] = 1;
			array[1] = 1;
			array[2] = 0;

			array[0] = array[1]/array[2];

			System.out.println("End of try block");
		}
		catch(ArithmeticException e) {
			System.out.println("Dont divide by zero: " + e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index out of bounds: " + e);			
		}
		catch(Exception e) {
			System.out.println("Generic Exception handler: " + e);
		}
		finally {
			System.out.println("Inside finally block");
		}
		System.out.println("Out of try-catch block");
	}
}