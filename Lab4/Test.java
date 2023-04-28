package onlinelab4;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person = new Person("Gül",23,165,65);
		Employee employee = new Employee("Gül",23,165,65,128,9);
		System.out.println(person.getInfo());
		System.out.println(employee.getInfo());
		
	}

}
