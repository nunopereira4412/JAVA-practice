import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	private static Scanner s = new Scanner(System.in);
	private static GroceryList g = new GroceryList();

	public static void main(String[] args) {
		boolean quit = false;
		int choice = 0;
		printInstructions();

		while(!quit) {
			System.out.println("Enter your choice: ");
			choice = s.nextInt();
			s.nextLine();

			switch(choice) {
				case 0: 
					printInstructions();
					break;
				case 1:
					g.printItems();
					break;
				case 2:
					addItem();
					break;
				case 3: 
					modifyItem();
					break;
				case 4:
					removeItem();
					break;
				case 5:
					searchForItem();
					break;
				case 6:
					processArrayList();	
					break;
				case 7:
					quit = true;
					break;
			}
		}
	}

	public static void printInstructions() {
		System.out.println("\nPress ");
		System.out.println("\t 0 - PrintInstructions");
		System.out.println("\t 1 - Print list");
		System.out.println("\t 2 - Add item");
		System.out.println("\t 3 - Modify item");
		System.out.println("\t 4 - Remove item");
		System.out.println("\t 5 - Search for item");
		System.out.println("\t 6 - Quit");
	}

	public static void addItem() {
		System.out.print("Please enter the item: ");
		g.addItem(s.nextLine());
	}

	public static void modifyItem() {
		System.out.print("Please enter the old item: ");
		String oldItem = s.nextLine();
		System.out.print("Please enter the new item: ");
		String newItem = s.nextLine();
		g.modifyItem(oldItem, newItem);

	}

	public static void removeItem() {
		System.out.print("Please enter the item: ");
		String item = s.nextLine();
		g.removeItem(item);
	}

	public static void searchForItem() {
		System.out.print("Please enter the item: ");
		String item = s.nextLine();
		if(g.onFile(item)) {
			System.out.println("Item found");
		}
		else {
			System.out.println("Item not found");
		}
	}

	public static void processArrayList() {
		ArrayList<String> newArray = new ArrayList<String>();
		newArray.addAll(g.getGroceryList());

		ArrayList<String> nextArray = new ArrayList<String>(g.getGroceryList());

		String[] myArray = new String[g.getGroceryList().size()];
		myArray = g.getGroceryList().toArray(myArray);
	}
}