public class car {
	
	String make = "Nissan";
	String model = "GTR";
	int year = 2025;
	double price = 20000;
	boolean isRunning = false;
	
	void drive() {
		System.out.println("You are driving the " + model);
	}
	void brake() {
		System.out.println("You brake the " + model);
	}
}