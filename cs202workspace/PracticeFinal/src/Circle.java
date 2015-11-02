

public class Circle {

	private double radius;
	
	public Circle(double radius){
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea(){
		double area;
		double r = getRadius();
		
		area = Math.PI * r * r;
		
		return area;
	}
	
	public String toString(){
		return "The area of the circle with radius " + radius + " is: " + getArea();
	}
}
