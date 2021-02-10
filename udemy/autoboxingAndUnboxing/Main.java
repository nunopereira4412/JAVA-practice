import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		String[] strArray = new String[5];
		int[] intArray = new int[5];

		// ArrayList<int> intArrayList = new ArrayList<int>();

		Integer integer = new Integer(54);

		ArrayList<Integer> intArrayList = new ArrayList<Integer>();
		for(int i = 0; i < 5; i++) {
			//AutoBoxing, converting int to Integer
			intArrayList.add(Integer.valueOf(i));
		}

		for(int i = 0; i < 5; i++) {
			//Unboxing, converting an Integer to int
			System.out.println("Integer at position " + (i + 1) + " is: " +
							   intArrayList.get(i).intValue());
		}

		Integer myIntValue = 56; //Integer.valueOf(56)
		int myInt = myIntValue; //myIntValue.intValue()

		ArrayList<Double> myDoubleValues = new ArrayList<Double>();
		// for(double d = 0.0; d < 2.5; d += 0.5) {
		// 	myDoubleValues.add(Double.valueOf(d));
		// }

		// for(int i = 0; i < myDoubleValues.size(); i ++) {
		// 	Double d = myDoubleValues.get(i).doubleValue();
		// 	System.out.println(i + " -> " + d);
		// }

		//OR

		for(double d = 0.0; d < 2.5; d += 0.5) {
			myDoubleValues.add(d);
		}

		for(int i = 0; i < myDoubleValues.size(); i ++) {
			Double d = myDoubleValues.get(i);
			System.out.println(i + " -> " + d);
		}
	}
}