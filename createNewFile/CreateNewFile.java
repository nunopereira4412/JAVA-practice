import java.io.IOException;
import java.io.File;

public class CreateNewFile {

	public static void main(String[] args) {

		try {
			File file = new File("test.txt");
			file.createNewFile();
			boolean fileCreated = file.createNewFile();
			if(fileCreated) {
				System.out.println("File created successfully");
			}
			else {
				System.out.println("File already exists");	
			}
		} catch(IOException e) {
			System.out.println("Exception occureed:");
			e.printStackTrace();
		}
	}
}