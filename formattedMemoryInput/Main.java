import java.io.*;

public class Main {
	public static void main(String[] args) {

		try {
			DataInputStream in = new DataInputStream(
				new ByteArrayInputStream(BufferedInputFile.read("Main.java").getBytes()));

			while(true) {
				System.out.print((char)in.readByte());
			}
		}
		catch(EOFException e) {
			System.out.println("End of stream reached");
		}
		catch(IOException e) {}
	} 
}