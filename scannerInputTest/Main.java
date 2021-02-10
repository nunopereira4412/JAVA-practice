import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	private static String s = "um 2 3 quatro";
	private static File f;
	private static FileReader file;
	private static BufferedReader in;
	private static Scanner scanner;
	private static PrintWriter writer;

	public static void main(String[] args) {

		int i;
		String str;

		try {
			f = new File("test.txt");
			f.createNewFile();

			writer = new PrintWriter(f.getName());
			writer.print(s);
			writer.close();

			file = new FileReader(f);
			in = new BufferedReader(file);
			scanner = new Scanner(in).useDelimiter(" ");

			while(scanner.hasNext()) {
				if(scanner.hasNextInt()) {
					i = scanner.nextInt();
					System.out.println(i);
				}
				else scanner.next();
			}
		} 
		catch(FileNotFoundException e) {
			System.out.println("test.txt nao encontrado");
	    }
	    catch(IOException e) {
			System.out.println("nao criou a new file");
	    }
	}
}