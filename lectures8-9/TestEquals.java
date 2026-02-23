public class TestEquals {
	public static void main (String[] args) {
	
	Account a, b;
		
		String s1 = new String("Jane Doe");
		String s2 = new String("Jane Doe");
		
		//System.out.println(s1 == s2);
		//System.out.println(s1.equals(s2));
		
		a = new Account (1, s1);
		b = new Account (1, "Hello");
		
		if (a.equals(b)) {		
			System.out.println("a and b are equals");
		} else {
			System.out.println("a and b are NOT equals");		
		}
	}

}