import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		LinkedList<String> places = new LinkedList<String>();
		addInOrder(places, "B");
		addInOrder(places, "E");
		addInOrder(places, "A");
		addInOrder(places, "D");
		addInOrder(places, "C");

		printList(places);
		addInOrder(places, "C");
		visit(places);
	}

	private static void printList(LinkedList<String> list) {
		Iterator<String> i = list.iterator();
		while(i.hasNext()) {
			System.out.println("Now visiting " + i.next());
		}
		System.out.println("==================");
	}

	private static boolean addInOrder(LinkedList<String> list, String newCity) {
		ListIterator<String> listIterator = list.listIterator();

		while(listIterator.hasNext()) {
			int comparison = listIterator.next().compareTo(newCity);
			if(comparison == 0) {
				System.out.println(newCity + " is already included as a destination");
				return false;
			}
			else if(comparison > 0) {
				listIterator.previous();
				listIterator.add(newCity);
				return true;
			}
			else if(comparison < 0) {
				//move on to next city
			}
		}
		listIterator.add(newCity);
		return true;
	}

	private static void visit(LinkedList<String> list) {
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		boolean forward = true;
		ListIterator<String> listIterator = list.listIterator();

		if(list.isEmpty()) {
			System.out.println("No cities in the list");
			return;
		}
		else {
			System.out.println("Now visiting " + listIterator.next());
			printMenu();
		}

		while(!quit) {
			int action = scanner.nextInt();
			scanner.nextLine();

			switch(action) {
				case 0:
					System.out.println("Trip over");
					quit = true;
					break;

				case 1:
					if(!forward) {
						if(listIterator.hasNext()) {
							listIterator.next();
						}
						forward = true;
					}
					if(listIterator.hasNext()) {
						System.out.println("Now visiting " + listIterator.next());
					}
					else {
						System.out.println("Reached the end of the list");
						forward = false;
						
					} 	
					break;

				case 2:
					if(forward) {
						if(listIterator.hasPrevious()) {
							listIterator.previous();
						}
						forward = false;
					}
					if(listIterator.hasPrevious()) {
						System.out.println("Now visiting " + listIterator.previous());
					}
					else {
						System.out.println("We are at start of the list");
						forward = true;
						
					}
					break;

				case 3:
					printMenu();
					break;
			}
		}
	}

	private static void printMenu() {
		System.out.println("0 - quit\n" + 
			"1 - next city\n" +
			"2 - previous city\n" +
			"3 - printmenu");
	}
}