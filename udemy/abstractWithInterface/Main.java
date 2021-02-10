public class Main {

	public static void main(String[] args) {
		Bird bird = new Bird("birdie");
		Penguin penguin = new Penguin("penguin");

		bird.eat();
		bird.fly();

		penguin.eat();
		penguin.fly();
	}
}