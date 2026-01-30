public class Test {

	public static void main (String[] args) {
		Rectangle r1 = new Rectangle (3, 5, 7, 15);
		Rectangle r2 = new Rectangle (13, 15, 3, 5);
		
		Shape[] array = new Shape[2];
		
		array[0] = r1;
		array[1] = r2;
		
		System.out.println("Before:");
		System.out.println(array[0]);
		System.out.println(array[1]);
		
		Array.sort2(array);
		
		System.out.println("After:");
		System.out.println(array[0]);
		System.out.println(array[1]);

	}
}