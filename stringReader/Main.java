import java.io.StringReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		StringReader sr = new StringReader(BufferedInputFile.read("Main.java"));
		int c;

		try {
			while((c = sr.read()) != -1) {
				System.out.print((char)c);
			}
		} catch(IOException e) {
			System.out.println("EOException caught");
		}
	}
}