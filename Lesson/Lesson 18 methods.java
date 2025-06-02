public class Main {
	public static void main(String[] args) {
		
		// method = a block of reusable code that is executed when called ()
		
		happyBirthday("Chicken", 19);
		
		System.out.println();
		
		double square = square(6);
		System.out.println(square);
		
		System.out.println();
		
		double cube = cube(3);
		System.out.println(cube);
		
		System.out.println();
		
		String name = fullName("Jack", "Sparrow");
		System.out.println(name);
		
		System.out.println();
		
		boolean verification = verification(22);
		if(verification) {
			System.out.println("You may sign up!");
		}
		else {
			System.out.println("You need to be 18+ to sign up.");
		}
		
	}
	
	static void happyBirthday (String name, int age) {
		System.out.println("Happy birthday to you!");
		System.out.printf("Happy birthday dear %s!\n", name);
		System.out.printf("You are now %d years old!\n", age);
		System.out.println("Happy birthday to you!");
	}
	static double square(int number) {
		return number * number;
	}
	static double cube(int number) {
		return number * number * number;
	}
	static String fullName(String first, String last) {
		return first + " " + last;
	}
	static boolean verification(int age) {
		return age >= 18;
	}
}