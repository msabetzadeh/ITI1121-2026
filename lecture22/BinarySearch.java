public class BinarySearch {

	private static int binarySearch(int value, int[] array, int lo, int hi) {
	
		// base case: value not found
		
		if (lo > hi) {
			return -1; // element not found
		}
		
		int middle, newLo, newHi;
		
		middle = (lo + hi) / 2;
		if (value == array[middle]) { // second base case: element found in the middle
			return middle;
		}
		
		if (value < array[middle]) {
			newLo = lo;
			newHi = middle - 1;
		
		} else {
			newLo = middle + 1;
			newHi =  hi;
		}
		
		return binarySearch(value, array, newLo, newHi);
	} 

	public static int binarySearch(int value, int[] array) {
		return binarySearch(value, array, 0, array.length  - 1);
	} 
	
	public static void main (String[] args) {
		int[] array = {1, 3, 10, 20, 25, 50, 55, 60, 70, 80, 85, 90, 95, 100};
		int index = binarySearch(3, array);
		System.out.println("Index returned is: " + index);
		
		System.out.println("--------");

		index = binarySearch(80, array);
		System.out.println("Index returned is: " + index);
	}

}