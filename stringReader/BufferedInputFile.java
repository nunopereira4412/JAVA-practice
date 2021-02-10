import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.StringBuilder;
import java.io.IOException;

public class BufferedInputFile {

	public static String read(String fileName) { //or "throws IOException" and remove try-catch
		String s;
		StringBuilder sb = new StringBuilder();

		try {
			BufferedReader in = new BufferedReader(new FileReader(fileName));

			while((s = in.readLine()) != null) {
				sb.append(s + "\n");
			}
			in.close();
		} catch(IOException e) {
			System.out.println("IOException occured");
		}
		return sb.toString();
	}

	public static void main(String[] args) throws IOException {
		System.out.println(read("BufferedInputFile.java"));
	}
}