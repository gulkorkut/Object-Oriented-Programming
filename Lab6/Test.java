package onlinelab6;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Shape s1 = new Rectangle("purple", 5, 4);
		Shape s2 = new Triangle("blue",6,4);
		System.out.println(s1.getArea());
		System.out.println(s2.getArea());
		System.out.println(s1.toString());
		System.out.println(s2.toString());
	}
}
