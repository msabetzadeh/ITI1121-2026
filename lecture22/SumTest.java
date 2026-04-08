public class SumTest {

    private static int sum(int[] t, int k) {
    	int s, result, length = t.length - k;
    	
    	if (length == 1) { // base case
    		System.out.println("Base case reached!");
    		result = t[k];
    	} else {
    		System.out.println("Recursively calling sum (t, " + (k+1) + ")");
    		s = sum (t, k+1);
    		System.out.println("Came back from sum (t, " + (k+1) + ")");
    		result = t[k] + s;
    	}
    	return result;
    }
    
    public static int sum(int[] t) {
    	return sum(t, 0);
    }

    public static void main(String args[]) {
        int[] array = {1, 2, 3, 4};
        System.out.println("Sum: " + sum(array));
    }
}