public class Test {
	public static void main (String[] args) {
	
		// Testing Constant
		Constant c;
		c = new Constant ("golden ratio", 1.618);
		
		System.out.println (c.getName());
		System.out.println (c.getValue());
		
		// MyInteger object
		
		MyInteger a;
		
		a = new MyInteger(33);
		
		System.out.println(a.value);
		
		MyInteger alias = a;
		
		alias.value++;
		
		System.out.println(a.value);		
		
		// versus primitive integers
		
		int i = 33;

		System.out.println(i);
		
		int j = i;
		
		j++;
		
		System.out.println(i);	
	
	}
}