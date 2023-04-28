
public class Test {
	 public static void main(String[] args) {
	        Course course1 = new Course();
	        Course course2 = new Course("Exploring Computer Engineering","COMP104","5","Burcu Güngör");
	        Course course3 = new Course("Object Oriented Programming","COMP112");
	  
	        System.out.println(course1.getInfo());
	        System.out.println(course2.getInfo());
	        System.out.println(course3.getInfo());
	    }
}
