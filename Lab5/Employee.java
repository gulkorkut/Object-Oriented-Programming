package onlinelab5;

public class Employee extends StaffMember {
	protected String socialSecurityNumber;
	protected double payRate;
	
	public Employee(String name, String address, String phone,String socialSecurityNumber,double payrate) {
		super(name, address, phone);
		this.socialSecurityNumber = socialSecurityNumber;
		this.payRate=payrate;
	}

	@Override
	public double pay() {
		// TODO Auto-generated method stub
		return payRate;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", phone=" + phone + ", socialSecurityNumbe=" + socialSecurityNumber + ", payRate="
				+ payRate + "]";
	}
}
