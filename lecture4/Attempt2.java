public class Attempt2 {
	
	public static boolean equal(Point p1, Point p2){
		return (p1.x==p2.x && p1.y==p2.y);
	}

	public static Point add(Point p1, Point p2){
		return new Point(p1.x + p2.x, p1.y + p2.y);
	}
	
	public static void printPoint(Point p) {
			System.out.println(p.x + ", " + p.y);
	}

	public static void main(String[] args){

		// first Point
		Point p1 = new Point(0,0);

		// second Point
		Point p2 = new Point(1,1);
		
		System.out.println(equal(p1,p2));

		Point p3 = add(p1,p2);
		
		printPoint(p3);
	}
}
