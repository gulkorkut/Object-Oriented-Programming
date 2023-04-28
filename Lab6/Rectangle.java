package onlinelab6;

public class Rectangle extends Shape {
	
	protected int length;
	protected int width;
	
	
	public double getArea() {
		return width*length;
	}


	public Rectangle(String color, int length, int width) {
		super(color);
		this.length = length;
		this.width = width;
	}


	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width +", color="+color+ "]";
	}

	
}