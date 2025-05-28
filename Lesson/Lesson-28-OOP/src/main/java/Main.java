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
		
		Student student1 = new Student("Chicken", 3, 1.9);
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
		student2.study();
	}
}