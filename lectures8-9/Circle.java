public class Circle extends Shape {
	private double radius;
	
	public Circle() {
		super();
		radius = 0;
	}
	
	public Circle(double x, double y, double radius) {
		super(x, y);
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public String toString() {
		return "Located at: (" + x + ", " + y + "), with radius " + radius;		
	}
	
	public double area() {
		return Math.PI * radius * radius;
	}
}