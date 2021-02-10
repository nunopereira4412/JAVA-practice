import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);
	private static MobilePhone mobilePhone = new MobilePhone("123456789");

	public static void main(String[] args) {

		boolean quit = false;
		startPhone();
		printActions();
		while(!quit) {
			System.out.println("\nEnter action: (6 to show available actions)");
			int action = scanner.nextInt();
			scanner.nextLine();

			switch(action) {
				case 0:
					System.out.println("\nShutting down...");
					quit = true;
					break;
				case 1:
					mobilePhone.printContacts();
					break;
				case 2:
					addNewContact();
					break;
				case 3:
					updateContact();
					break;
				case 4:
					removeContact();
					break;
				case 5:
					queryContact();
					break;
				case 6:
					printActions();
					break;
			}
		}
	}

	private static void addNewContact() {
		System.out.println("Enter new contact name:");
		String name = scanner.nextLine();
		System.out.println("Enter new contact phone number:");
		String phoneNumber = scanner.nextLine();

		Contact newContact = Contact.createContact(name, phoneNumber);

		if(mobilePhone.addNewContact(newContact)) {
			System.out.println("New contact added");
		}
		else {
			System.out.println("Cannot add. Name already on file");
		}
	}

	private static void updateContact() {
		System.out.println("Enter contact name to be updated:");
		String name = scanner.nextLine();
		Contact existingContact = mobilePhone.queryContact(name);
		if(existingContact == null) {
			System.out.println(name + " was not found");
			return;
		}
		System.out.println("Enter new contact name:");
		String newName = scanner.nextLine();
		System.out.println("Enter new contact phoneNumber:");
		String newNumber = scanner.nextLine();
		Contact newContact = Contact.createContact(newName, newNumber);
		if(mobilePhone.updateContact(existingContact, newContact)) {
			System.out.println(existingContact.getName() + " was replaced with " + newContact.getName());
		}
		else {
			System.out.println("Error updating contact");
		}
	}

	private static void removeContact() {
		System.out.println("Enter contact name to be remove:");
		String name = scanner.nextLine();
		Contact existingContact = mobilePhone.queryContact(name);
		if(existingContact == null) {
			System.out.println(name + " was not found");
			return;
		}
		if(mobilePhone.removeContact(existingContact)) {
			System.out.println("Successfully removed contact");
		}
		else {
			System.out.println("Error removing contact");	
		}
	}

	private static void queryContact() {
		System.out.println("Enter contact name to be remove:");
		String name = scanner.nextLine();
		Contact existingContact = mobilePhone.queryContact(name);
		if(existingContact == null) {
			System.out.println(name + " was not found");
			return;
		}
		System.out.println("contact found...");
	}

	private static void startPhone() {
		System.out.println("Starting phone...");
	}

	private static void printActions() {
		System.out.println("\nAvailable actions:\npress");
		System.out.println("0 - shutdown\n" +
						   "1 - print contacts\n" +
						   "2 - add new contact\n" +
						   "3 - update contact\n" +
						   "4 - remove contact\n" +
						   "5 - query if a contact exists\n" +
						   "6 - print list of available actions\n");
		System.out.println("Choose your action: ");
	}
}