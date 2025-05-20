import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = scanner.nextLine();
		
		System.out.print("Enter your age: ");
		int age = scanner.nextInt();
		
		System.out.println("Are you a student: (true/false)");
		boolean isStudent = scanner.nextBoolean();
		
		System.out.println("Your name is " + name);
		System.out.println("You are " + age + " years old");
		if (isStudent) {
		    System.out.print("You are enrolled");
		}
		else {
		    System.out.print("You are NOT enrolled");
		}
		
		scanner.close();
	}
}