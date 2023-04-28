package onlinelab6;

public class Shape {
protected String color;
	
	public double getArea() {
		System.out.println("Shape is unknown");
		return 0;
	}
	public Shape(String color) {
		super();
		this.color = color;
	}

	@Override
	public String toString() {
		return color;
	}

	

}
