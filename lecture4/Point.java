public  class Point {	
	int x, y;
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public boolean equal(Point other) {
		return ((this.x==other.x) && (this.y == other.y));
	}

	public static Point add (Point p1, Point p2) {

		Point result;

		result = new Point(p1.x+p2.x, p1.y+p2.y);

		return result;

	}

	public String toString() {
		return this.x + "," + this.y;
	}	
	
}





























/*

	public static boolean equal(Point p1, Point p2) {
		return ((p1.x==p2.x) && (p1.y == p2.y));
	}

	public static  Point add (Point p1, Point p2) {

		Point result;

		result = new Point(p1.x+p2.x, p1.y+p2.y);

		return result;

	}

	public String toString() {
		return x + "," + y;
	}	
*/