public class Test {

	public static void a()  {
		throw new Exception("An exception!");
	}
	public static void main(String[] args) {
	
		System.out.println("1");
		
		a();
		
		System.out.println("2");
	}
}