import java.util.ArrayList;

public class GroceryList {

	private ArrayList<String> groceryList = new ArrayList<String>();

	public ArrayList<String> getGroceryList() {
		return groceryList;
	}

	public void addItem(String item) {
		groceryList.add(item);
	}

	public void printItems() {
		System.out.println("You have " + groceryList.size() + " items in your list");
		for(int i = 0; i < groceryList.size(); i++) {
			System.out.println((i + 1) + ". " + groceryList.get(i));
		}
	}

	private void modifyItem(int position, String newItem) {
		groceryList.set(position, newItem);	
	}

	public void modifyItem(String oldItem, String newItem) {
		int position = findItem(oldItem);
		if(position >= 0) {
			modifyItem(position, newItem);
			System.out.println("Item: " + oldItem + " has been modified");
			System.out.println("New item: " + newItem);
		}
	}

	private void removeItem(int position) {
		String removedItem = groceryList.get(position);
		groceryList.remove(position);
		System.out.println("Element removed is: " + removedItem);
	}

	public void removeItem(String item) {
		int position = findItem(item);
		if(position >= 0) {
			removeItem(position);
		}	
	}

	private int findItem(String item) {
		return groceryList.indexOf(item);
	}

	public boolean onFile(String item) {
		int position = findItem(item);
		if(position >= 0) {
			return true;
		}
		return false;
	}

	
}