public class FillStack {
	public static void call(int i) {
		if (i == 0) {
			System.out.println("Finished!");
			return;
		}
		try {
			System.out.println("Left to go: " + i);
			call (i-1);
		} catch (Throwable e) {
			System.out.println("\nError: " + e.getClass() + " at level: " + i);
		}
	}
	
	public static void main (String[] args) {
		call(10000);
	}

}