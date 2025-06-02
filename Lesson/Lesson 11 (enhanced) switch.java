import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		// Enhanced switch = a replacement for many else if statements (Java 14 features)
		
		Scanner scanner = new Scanner(System.in);
		
		String day;
		
		System.out.print("Enter the day: ");
		day = scanner.nextLine().toLowerCase();
		day = day.substring(0, 1).toUpperCase() + day.substring(1);
		
		/*switch(day) {
			case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("It's a weekday.");
			case "Saturday", "Sunday" -> System.out.println("It's the weekend!");
			default -> System.out.println(day + " is not a day.");
		}
		(This is Java 14 ver)
		*/
		
		switch(day) {
			case "Monday":
			case "Tuesday":
			case "Wednesday":
			case "Thursday":
			case "Friday":
			System.out.println("It's a weekday...");
			break;
			case "Saturday":
			case "Sunday":
			System.out.println("It's the weekend!");
			break;
			default:
			System.out.println(day + " is not a day.");
		}
		
		
		scanner.close();
	}
}