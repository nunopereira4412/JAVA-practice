public class Bird extends Animal implements ICanFly {

	public Bird(String name) {
		super(name);
	}

	public void eat() {
		System.out.println(getName() + " is eating");
	}

	public void breathe() {
		System.out.println("Breathing...");
	}

	public void fly() {
		System.out.println("Flapping wings and flying");
	}
}