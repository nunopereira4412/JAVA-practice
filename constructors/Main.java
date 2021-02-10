public class Main {

 	public Main() {
 		System.out.println("Main class constructor!");
 	}

 	public static void main(String[] args) {
 		Main sub = new Main();
 		// Main sub2 = new Sub();
 		Sub sub3 = new Sub(); 

 		sub.doSomething();
 		sub3.doSomething();
 	}

 	public void doSomething() {
 		System.out.println("doSomething MAIN CLASS");
 	}
 }