public class Main {
	public static void main(String[] args) {

		try {
			System.out.println("main class");
			throw new CustomException("custom exception inside try block of main method");
		}
		catch(CustomException e) {
			System.out.println(e.getMessage());
		}
	}
}