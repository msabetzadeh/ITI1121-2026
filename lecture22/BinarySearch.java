public class BinarySearch {

	public static int binarySearch(int value, int[] array) {
		System.out.println ("Calling binSearch (" + value + ", array, lo: 0, hi: " + (array.length - 1) + ")");	
		return binSearch(value, array, 0, array.length - 1);
	} 
	
	public static int binSearch(int value, int[] array, int lo, int hi) {
	
		// Base case: value not found
		if (lo > hi) {
			return -1;
		}
		
		//Base case: value was found
		int middle = (lo + hi) / 2;
		System.out.println ("Middle is: " + middle);
		
		if (value == array[middle]) {
			return middle;
		}
		
		// General case:
		
		int newLo, newHi;
		
		if (value < array[middle]) {
			newLo = lo;
			newHi = middle - 1;
		} else {
			newLo = middle + 1;
			newHi = hi;
		}
		
		System.out.println ("Calling binSearch (" + value + ", array, lo: " + newLo + ", hi: " + newHi + ")");
		return binSearch(value, array, newLo, newHi);
	}
	
	public static void main (String[] args) {
		int[] array = {1, 3, 10, 20, 25, 50, 55, 60, 70, 80, 85, 90, 95, 100};
		int index = binarySearch(3, array);
		System.out.println("Index returned is: " + index);
		
		System.out.println("--------");

		index = binarySearch(98, array);
		System.out.println("Index returned is: " + index);
	}

}