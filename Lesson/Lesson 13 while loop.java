import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// while: repeat some codes forever while some codes remain forever
		
		//EXAMPLE 1
		String name = "";
		
		while(name.isEmpty()) {
			System.out.print("Enter your name: ");
			name = scanner.nextLine();
		}
		
		System.out.println("\nHello, " + name);
		
		//EXAMPLE 2
		String response = "";
		
		while(!response.equals("Q")) {
			System.out.print("\n\nPress Q to quit the game: ");
			response = scanner.nextLine().toUpperCase();
		}
		
		System.out.println("\nYou have quit.");
		
		//EXAMPLE 3
		int age = 0;
		
		do {
			System.out.println("\n\nYour age can't be negative.");
			System.out.print("Enter your age: ");
			age = scanner.nextInt();
		} while(age < 0);
		
		System.out.println("\nYou are " + age + " years old.");
		
		//EXAMPLE 4
		int number = 0;
		
		do {
			System.out.print("\n\nEnter a number between 1-10: ");
			number = scanner.nextInt();
		} while(number < 1 || number > 10);
		
		System.out.println("\nYou picked number " + number);
		
		scanner.close();
	}
}