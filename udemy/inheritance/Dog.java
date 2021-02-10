public class Dog extends Animal{

	private int legs;
	private int tail;

	public Dog(String name, int size, int weight, int legs, int tail) {
		super(name, 1, 1, size, weight);
		this.legs = legs;
		this.tail = tail;
	}

	public void chew() {
		System.out.println("Dog chewing");
	}

	public void eat() {
		System.out.println("Dog eating");
		chew();
		super.eat();
	}

	public void walk() {
		System.out.println("Dog walking");
		super.move(5);
	}

	public void run() {
		System.out.println("Don running");
		move(10);
	}

	private void moveLegs(int speed) {
		System.out.println("Dog moving legs");
	}

	public void move(int speed) {
		System.out.println("Dog moving");
		moveLegs(speed);
		super.move(speed);
	}
}