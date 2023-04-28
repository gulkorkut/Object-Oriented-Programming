package lab4;

public class Phone {
	private String make;
	private String model;
	private int year;
	
	 public String toString(boolean reverse) {
		  if (reverse) {
		   return "Phone [year=" + year + ", model=" + model + ", make=" + make + "]";
		  }
		  else
		   return "Phone [make=" + make + ", model=" + model + ", year=" + year + "]";
		 }
	@Override
	public String toString() {
		return "Phone [make=" + make + ", model=" + model + ", year=" + year + "]";
	}
	public Phone(String make, String model, int year) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
	}
	public Phone() {
		make="Not defined";
		model="Not defined";
		year=2022;
		
	}
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public boolean isObsolete() {
		if(2022-year>10) {
			return true;
			
			
		}else {
			
			return false;
		}
		
	}

}
