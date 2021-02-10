import java.lang.ArithmeticException;
import java.lang.ArrayIndexOutOfBoundsException;

public class Main {
	public static void main(String[] args) {
		int x = 1; 
		int y = 0;

		try { 
			try {
				//will search exception handler in the outer try-catch block
				x += x/y;
				
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("file not found");
			}
			finally {
				System.out.println("Finally of nested try block");	
			}
		}
		catch(ArithmeticException e) {
			System.out.println("arithmetic exception");
		}
		finally {
			System.out.println("Finally of OUTER try block");
		}
	}
}