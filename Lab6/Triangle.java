package onlinelab6;

public class Triangle extends Shape {

	protected int base;
	protected int height;
	
	
	public double getArea() {
		return 0.5*base*height;
	}
	public Triangle(String color, int base, int height) {
		super(color);
		this.base = base;
		this.height = height;
	}


	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height + ", color=" + color + "]";
	}


	
}
