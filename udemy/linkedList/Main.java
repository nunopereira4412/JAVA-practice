import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer("Tim", 10.10);
		Customer anotherCustomer;
		anotherCustomer = customer;
		anotherCustomer.setBalance(12.80);
		System.out.println("Balance for customer " + customer.getName() + 
						   " is " + customer.getBalance());

		ArrayList<Integer> intList = new ArrayList<Integer>();

		intList.add(Integer.valueOf(1));
		intList.add(3);
		intList.add(4);

		for(int i = 0; i < intList.size(); i++) {
			System.out.println(i + ": " + intList.get(i).intValue());
		}

		intList.add(1, 2); //para ser inserido na posiçao 1, as outras
		//entradas tiveram de "descer" uma posiçao na lista

		for(int i = 0; i < intList.size(); i++) {
			System.out.println(i + ": " + intList.get(i).intValue());
		}

		//if we were to remove an item from teh array, then all the 
		//other items would need to be moved up = slowing down pc.
		// USe LinkedList	

		
	}
}