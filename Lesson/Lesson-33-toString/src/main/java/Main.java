public class Main {
	public static void main(String[] args) {
		
		// .toString() = method inherited from the object class used to return string representation of an object(I don't get what this mean tbh). By default, it returns a hash code as a unique identifier. It can be overriden to provise meaningful details.
		
		Car car1 = new Car("Toyota", "Supra", 2000, "Gray");
		
		System.out.println(car1);
	}
}