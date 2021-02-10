public class Fish extends Animal {

	private int gills;

	public Fish(String name, int brain, int body, int size, int weight, int gills) {
		super(name, 1, 1, size, weight);
		this.gills = gills;
	}

	private void rest() {
		System.out.println("Fish resting");
	}

	private void swim(int speed) {
		moveMuscles();
		moveBackFin();
		super.move(speed);
	}

	private void moveMuscles() {
		System.out.println("Fish moving muscles");
	}

	private moveBackFin() {
		System.out.println("Fish moving back fin");
	}
}