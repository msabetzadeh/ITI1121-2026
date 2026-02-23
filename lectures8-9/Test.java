public class Test {

	public static void main (String args[]) {
	
		Circle c1 = new Circle(10, 20, 5);
		Circle c2 = new Circle(20, 10, 5);
		
		Rectangle r1 = new Rectangle(0, 0, 1, 1);
		Rectangle r2 = new Rectangle(100, 100, 200, 400);
		

		Shape[] array = new Shape[2];
		
		array[0] = c1;
		array[1] = r1;
		
		Util.displayAll(array);
		
		Util.sort2(array);
		
		Util.displayAll(array);		

	}
}