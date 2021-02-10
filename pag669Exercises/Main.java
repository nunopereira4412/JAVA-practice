import java.util.*;
import java.io.*;

public class Main {

	private static LinkedList<String> list = null;
	private static BufferedReader in = null;
	private static PrintWriter out = null;

	public static void main(String[] args) throws IOException, FileNotFoundException {

		list = new LinkedList<>();
		String s;

		if(args.length > 0) {
			System.out.println("args[1] exist");
			in = new BufferedReader(new FileReader(args[0]));

			//assuming args[1] != null
			out = new PrintWriter(new BufferedWriter(new FileWriter(args[1])));
			//

		}
		else {
			System.out.println("args[1] dont exist");
			in = new BufferedReader(new FileReader("test.txt"));	
		}

		while((s = in.readLine()) != null) {
			// list.add(s.toUpperCase());
			list.add(s);
		}
		
		// printList(list);
		// printListReverseOrder(list);

		// if(args.length > 1) {
		// 	printListSelectedWords(list, args);
		// }
		// else {
		// 	printListReverseOrder(list);
		// }

		printToFile(list, out);
		out.close();

	}

	private static void printList(LinkedList<String> list) {
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	private static void printListReverseOrder(LinkedList<String> list) {
		int lastPosition = list.size() - 1;
		for(int i = lastPosition; i >= 0; i--) {
			System.out.println("Position " + i + ": " + list.get(i));
		}
	}

	private static void printListSelectedWords(LinkedList<String> list, String[] args) {
		String s;
		Scanner scanner;
		for(int i = 0; i < args.length; i++) {
			s = args[i];
			for(int j = 0; j < list.size(); j++) {
				scanner = new Scanner(list.get(j)).useDelimiter(" ");
				while(scanner.hasNext()) {
					if(scanner.next().equals(s)) {
						System.out.println("Contains \"" +  s + "\" from args: " + list.get(j));
						break;
					}
				}
			}
		}
	}

	//test anything else than PrintWriter to see if works
	private static void printToFile(LinkedList<String> list, PrintWriter out) {
		int lineNumber = 1;
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			out.println(lineNumber++ + ": " + iterator.next());
		}
	}
}










