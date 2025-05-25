import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int choice;
		boolean exitYes = false;
		
		String[] books = new String[5];
		int[] ids = new int[5];
		
		System.out.println("Insert five of your favorite books.");
		System.out.println("Please insert it one at  a time.");
		input(ids, books);
		view(ids, books);
		
		while(!exitYes) {
			System.out.println("[1] View");
			System.out.println("[2] Search");
			System.out.println("[3] Exit");
			System.out.print("Enter your choice (1-3): ");
			choice = scanner.nextInt();
			scanner.nextLine();
			switch(choice) {
				case 1:
					view(ids, books);
				break;
				case 2:
					search(ids, books);
				break;
				case 3:
					exitYes = true;
				break;
				default:
					System.out.println("Invalid choice");
			}
		}
		
		System.out.println("Goodbye and have a nice day!");
		
		scanner.close();
	}
	
	static String capitalize(String cap) {
		String[] parts;
		String result = "";
		
		cap = cap.substring(0, 1).toUpperCase() + cap.substring(1).toLowerCase();
		
		parts = cap.trim().split("\\s+");
		
		for(String part : parts) {
			result += part + " ";	
		}
		
		return result.trim();
	}
	
	static void input(int[] ids, String[] books) {
		String name;
		
		for(int i = 0; i < ids.length; i++) {
			System.out.printf("Enter book number %d name: ", i + 1);
			name = scanner.nextLine();
			name = capitalize(name);
			System.out.println();
			ids[i] += i + 1;
			books[i] = name;
		}
	}
	
	static void view(int[] ids, String[] books) {
		System.out.println("Your favorite books: ");
		for(int i = 0; i < ids.length; i++) {
			System.out.printf("%d. %s\n", ids[i] + 1, books[i]);
		}
	}
	
	static void search(int[] ids, String[] books) {
		String target;
		
		for(int i = 0; i < ids.length; i++) {
			System.out.print("Enter the ID or book name: ");
			target = scanner.nextLine().trim();
			if(target.equals(String.valueOf(ids[i])) || target.equalsIgnoreCase(books[i])) {
				System.out.printf("\n%d. %s\n", ids[i], books[i]);
				break;
			}
			else {
				System.out.println("Cannot find book");
			}
		}
	}
}

// capitalize doesn't work as intended
// search by ids doesn't work even oddly