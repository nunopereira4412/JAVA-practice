import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		DataOutputStream out = new DataOutputStream(
			new BufferedOutputStream(new FileOutputStream("Data.txt")));

		out.writeInt(1);
		out.writeDouble(1.343553);
		out.writeUTF("helloWorld");
		out.close();

		DataInputStream in = new DataInputStream(
			new BufferedInputStream(new FileInputStream("Data.txt")));

		System.out.println(in.readInt());
		System.out.println(in.readDouble());
		System.out.println(in.readUTF());

		in.close();

	}
}