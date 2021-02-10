import java.util.Comparator;

// public class Test {

// 	private int number;

// 	public Test(int number) {
// 		this.number = number;
// 	}

// 	//anonymous inner class providing implementation 
// 	//for the compare method
// 	static final Comparator<Test> COMP = new Comparator<Test>() {

// 		public int compare(Test t1, Test t2) {
// 			if(t1.getNumber() == t2.getNumber()) {
// 				return 1;
// 			}
// 			else return -1;
// 		}
// 	};

// 	public int getNumber() {
// 		return number;
// 	}
// }

//OR

public class Test implements Comparator<Test> {

	private int number;

	public Test(int number) {
		this.number = number;
	}

	public final int compare(Test t1, Test t2) {
		if(t1.getNumber() == t2.getNumber()) {
			return 1;
		}
		else return -1;
	}

	public int getNumber() {
		return number;
	}
}