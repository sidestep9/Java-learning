public class Bike {
	String make;
	String color;
	
	Bike(String make, String color) {
		this.make = make;
		this.color = color;
	}
	
	void drive() {
		System.out.println("You drive the " + color + " " + make);
	}
}