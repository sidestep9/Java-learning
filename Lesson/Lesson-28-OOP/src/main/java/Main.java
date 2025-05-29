public class Main {
	public static void main(String[] args) {
		
		// object = an entity that holds data (attributes), and can perform actions (methods). It is a reference data type.
		
	/*	car car = new car();
		
		System.out.println(car.make);
		System.out.println(car.model);
		System.out.println(car.year);
		System.out.println(car.price);
		System.out.println(car.isRunning);
		
		car.drive();
		car.brake();*/
		
		// constructor = a special method to initialize object. Can pass arguments to a constructor, and set up initial values.
		
		/*Student student1 = new Student("Chicken", 3, 1.9);
		Student student2 = new Student("Cow", 12, 2.2);
		
		System.out.println(student1.name);
		System.out.println(student1.age);
		System.out.println(student1.gpa);
		System.out.println(student1.isEnrolled);
		student1.study();
		
		System.out.println(student2.name);
		System.out.println(student2.age);
		System.out.println(student2.gpa);
		System.out.println(student2.isEnrolled);
		student2.study();*/
		
		// overloaded constructor = Allow a class to have multiple constructor with different parameter lists. Enable objects to be initiated in various way
		
		/*User user1 = new User();
		User user2 = new User("Seline");
		User user3 = new User("Halio", "HO@gmail.com");
		User user4 = new User("Helen", "Helu@yahoo.com", 28);
		
		System.out.println(user1.name);
		System.out.println(user1.email);
		System.out.println(user1.age);
		
		System.out.println(user2.name);
		System.out.println(user2.email);
		System.out.println(user2.age);
		
		System.out.println(user3.name);
		System.out.println(user3.email);
		System.out.println(user3.age);
		
		System.out.println(user4.name);
		System.out.println(user4.email);
		System.out.println(user4.age);*/
		
		Bike[] bikes = {new Bike("Yamaha", "red"), new Bike("Honda", "white"), new Bike("Ducati", "green")};
		
		for(Bike bike : bikes) {
			bike.drive();
		}
	}
}