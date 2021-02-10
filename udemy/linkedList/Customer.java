public class Customer {

	private String name;
	private double balance;

	public Customer(String name, Double balance) {
		this.name = name;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public Double getBalance() {
		return balance;
	}

	public void setName(String newName) {
		name = newName;
	}

	public void setBalance(Double newBalance) {
		balance = newBalance;
	}
}