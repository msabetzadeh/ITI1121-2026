public class Compare {

	public static void main(String[] args) {
	
		MyInteger a = new MyInteger(5);		
		MyInteger b = new MyInteger(10);
		
		if (a.equals(b)) {
			System.out.println("contents of a are the same as contents of b");
		} else {
			System.out.println("contents of a are NOT the same as contents of b");
		}
	}
}