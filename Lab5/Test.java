package onlinelab5;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Volunteer volunteer = new Volunteer("Merve","hdjk ","4528662 ");
		Employee employee = new Employee("Ali "," gdhjk ","45822 ","7595 ",13);
		System.out.println(volunteer.toString());
		System.out.println(employee.toString());
		System.out.println(volunteer.pay());
		System.out.println(employee.pay());
	}
	 
}
