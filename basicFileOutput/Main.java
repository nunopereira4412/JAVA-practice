import java.io.*;

public class Main {

	static String file = "Main.out";

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(
			new StringReader(BufferedInputFile.read("Main.java")));

		PrintWriter out = new PrintWriter(
			new BufferedWriter(new FileWriter(file)));

		// OR use Shortcut
		// PrintWriter out = new PrintWriter(file);

		int lineCount = 1;
		String s;

		while((s = in.readLine()) != null) {
			out.println(lineCount++ + ": " + s);
		}
		in.close();
		out.close();
		System.out.println(BufferedInputFile.read(file));
	}
}