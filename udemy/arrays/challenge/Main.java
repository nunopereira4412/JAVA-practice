import java.util.Scanner;
import java.util.Arrays;

public class Main {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[] intArray = getIntegers(5);
		printArray(sortIntegers(intArray));
	}

	public static int[] getIntegers(int number) {
		int[] array = new int[number];
		for(int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		return array;
	}

	public static void printArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.println("Element " + i + " value is " + array[i]);
		}
	}

	public static int[] sortIntegers(int[] array) {
		// int[] sortedArray = new int[array.length];

		// for(int i = 0; i < array.length; i++) {
		// 	sortedArray[i] = array[i];
		// }

		int[] sortedArray = Arrays.copyOf(array, array.length);

		//DESCENDING ORDER
		// int i = 0;
		// int j = 0;
		// int tmp;

		// while(i < sortedArray.length) {
		// 	for(j = 0; j < sortedArray.length; j++) {
		// 		if(j == i) {
		// 			continue; 
		// 		}
		// 		else {
		// 			if((sortedArray[j] > sortedArray[i]) && (j > i)) {
		// 				tmp = sortedArray[i];
		// 				sortedArray[i] = sortedArray[j];
		// 				sortedArray[j] = tmp;
		// 			}
		// 		}
		// 	}
		// 	i++;
		// }

		//ASCENDING ORDER
		Arrays.sort(sortedArray);

		return sortedArray;
	}
}