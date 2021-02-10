import java.io.*;
import java.util.Scanner;

public class Echo {

	public static void main(String[] args) throws IOException, FileNotFoundException {

		File file = new File("test.txt");
		file.createNewFile();

		PrintWriter outToFile = new PrintWriter(new BufferedWriter(new FileWriter(file.getName())));
		Scanner scanner = new Scanner(System.in);
		String s;

		BufferedReader in = new BufferedReader(new FileReader(file.getName()));

		while(!(s = scanner.nextLine()).equals("end")) {
			outToFile.println(s);
		}
		outToFile.close();
		scanner.close();

		while((s = in.readLine()) != null && s.length() != 0) {
			System.out.println(s.toUpperCase());
		}

		in.close();
	}
}