public class Main {

	public static void main(String[] args) {
		Animal animal = new Animal("Animal", 1, 1, 5, 5);
		Dog dog = new Dog("dog", 8, 20, 4, 1);

		animal.eat();
		dog.eat();
		// dog.walk();
		dog.run();

	}
}