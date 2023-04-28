package lab4;

public class PhoneCheck {

	public static void main(String[] args) {
		Phone phone1=new Phone("Makery","abcde",1999);
		Phone phone2=new Phone();
		System.out.println(phone1.toString());
		System.out.println(phone2.toString(true));
		System.out.println(phone1.isObsolete());
		System.out.println(phone2.isObsolete());
	}

}
