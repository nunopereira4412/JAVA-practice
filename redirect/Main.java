import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		PrintStream console = System.out;
		BufferedInputStream in = new BufferedInputStream(
		new FileInputStream("Main.java"));

		PrintStream out = new PrintStream(
		new BufferedOutputStream(new FileOutputStream("test.out")));

		System.setIn(in);
		System.setOut(out);

		BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));

		String s;
		int i = 0;

		while((s = br.readLine()) != null) {
			if(i == 10) {
				System.setOut(console);
			}
			System.out.println(s);
			i++;
		}
		out.close();
	}
}