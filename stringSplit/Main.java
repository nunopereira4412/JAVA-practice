import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		String s = scanner.nextLine();
		String[] sSplit = s.split("\?");

		for(int i = 0; i < sSplit.length; i++) {
			System.out.println((i + 1) + " Token. " + sSplit[i]);
		}
	}
}