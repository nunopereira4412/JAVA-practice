import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

	//here the elements of the list are Objects instead of a 
	//particular data type
	public static void main(String[] args) {
		// List myIntList = new LinkedList();
		// myIntList.add(new Integer(0));
		// Integer x = (Integer)myIntList.iterator().next();

		List<Integer> myIntList = new LinkedList<Integer>();
		myIntList.add(new Integer(0));
		ListIterator<Integer> list = myIntList.listIterator();
		if(list.hasNext()) {
			Integer x = myIntList.iterator().next();
		}
	}
}