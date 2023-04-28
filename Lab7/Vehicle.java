
public class Vehicle {
	private int numberOfWheels;
	private String color;
	private int weight;
	public int getNumberOfWheels() {
		return numberOfWheels;
	}
	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
 
protected String getInfo() {
	 return "Vehicle [numberOfWheels=" + numberOfWheels + ", color=" + color + ", weight=" + weight + "]" ;
 }

}
