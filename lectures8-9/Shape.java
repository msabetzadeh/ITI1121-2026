public abstract class Shape extends Object implements Comparable,Displayable {
	protected double x;
	protected double y;
	
	public Shape() {
		x = 0;
		y = 0;
	}
	
	public Shape(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public void moveTo(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "Located at: (" + x + ", " + y + ")";
	}
	
	public boolean isLeftOf(Shape other) {
		return this.x < other.x;
	}
	
	public abstract double area();
	
	public void display() {
		System.out.println(this.toString());
	}

	public int compareTo(Comparable obj) {
		
		if (! (obj instanceof Shape)) {
			return 0;
		}
		
		Shape other = (Shape) obj;
		if (area() < other.area()) {
			return -1;
		} else if (area() == other.area()) {
			return 0;
		} else {
			return 1;
		}
	}
}