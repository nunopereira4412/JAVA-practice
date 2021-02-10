public class Dois extends Um {
	public static void main(String[] args) {
		Um um = new Um() {};  //will generate a Dois$1.class
		//correspondng to the anonymous subclass
		um.method();
	}
}