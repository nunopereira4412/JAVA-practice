public class Penguin extends Bird {

	public Penguin(String name) {
		super(name);
	}

	public void fly() {
		super.fly();
		System.out.println("Not very good at flying...");
	}
}


