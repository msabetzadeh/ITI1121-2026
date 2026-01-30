public class Circle extends Shape {
	private double radius;
	
	public Circle() {
		this.radius = 0;
	}
	
	public Circle(double x, double y, double radius) {
		super(x, y);
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double area () {
		return Math.PI * radius * radius;
	}
	
	public String toString() {
		return "Circle: " + super.toString() + ", radius: " + radius;
	} 
}