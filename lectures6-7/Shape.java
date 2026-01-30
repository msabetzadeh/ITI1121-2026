public abstract class Shape extends Comparable {

	private double x;
	private double y;
	
	public Shape() {
		this.x = 0;
		this.y = 0;

	}
	
	public Shape(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public final double getX() {
		return this.x;
	}

	public final double getY() {
		return this.y;
	}
	
	public final void moveTo(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public boolean isLeftOf(Shape s) {
		return this.getX() < s.getX();
	}
	
	public abstract double area ();


	public int compareTo(Comparable other) {
		
		Shape s = (Shape) other;
	
		if (this.area() < s.area()) {
			return -1;
		} else if (this.area() == s.area()) {
			return 0;
		}
		else
			return 1;
	}

	public String toString () {
		return "Located at: (" + this.x + ", " + this.y + ")";
	}
	
}