public class TestTokens {
	public static void scan (String expression) {	
	
		Reader reader = new Reader (expression);
	
		while (reader.hasMoreTokens()) {
			System.out.println(reader.nextToken());
		}
	}
	
	public static void main (String[] args) {
		String expr = " 3     + 4 * 567    / 35 - 25 ^ 22";
		System.out.println("Expression: " + expr);
		TestTokens.scan(expr);
	}

}