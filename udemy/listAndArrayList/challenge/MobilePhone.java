	import java.util.ArrayList;

public class MobilePhone {

	private String myNumber;
	private ArrayList<Contact> contacts;

	public MobilePhone(String myNumber) {
		this.myNumber = myNumber;
		contacts = new ArrayList<Contact>();
	}

	public boolean addNewContact(Contact contact) {
		if(findContact(contact.getName()) >= 0) {
			return false;
		}
		contacts.add(contact);
		return true;
	}

	public boolean updateContact(Contact oldContact, Contact newContact) {
		int foundPosition = findContact(oldContact);
		if(foundPosition < 0) {
			return false;
		}
		else if(findContact(newContact.getName() != -1)) {
			System.out.println("Contact wieh name " + newContact.getName() + " already exists");
			return false;			
		}
		contacts.set(foundPosition, newContact);
		return true;
	}

	public boolean removeContact(Contact contact) {
		int foundPosition = findContact(contact);
		if(foundPosition < 0) {
			return false;
		}
		contacts.remove(foundPosition);
		return true;
	}

	private int findContact(Contact contact) {
		return contacts.indexOf(contact);
	}

	private int findContact(String name) {
		for(int i = 0; i < contacts.size(); i++) {
			Contact contact = contacts.get(i);
			if(contact.getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}

	public String queryContact(Contact contact) {
		if(findContact(contact) >= 0) {
			return contact.getName();
		}
		return null;
	}

	public Contact queryContact(String name) {
		int position = findContact(name);
		if(position >= 0) {
			return contacts.get(position);
		}
		return null;
	}

	public void printContacts() {
		for(int i = 0; i < contacts.size();i++) {
			System.out.println((i + 1) + "." + 
								contacts.get(i).getName() + " -> " +
								contacts.get(i).getPhoneNumber());
		}
	}
}







