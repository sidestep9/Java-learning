import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	static Scanner scanner = new Scanner(System.in);
	static String border = "*****************************";
	// BREAK
	public static void main(String[] args) {
		
		boolean exitYes = false;
		int choice;
		String[] names = new String[5];
		double[] scores = new double[5];
		int[] id = {1, 2, 3, 4, 5};
		double classAvg = 0;
		
		while(!exitYes) {
			System.out.println(border);
			System.out.println("LITE STUDENT REPORT");
			System.out.println(border);
			System.out.printf("[%-1s] %-8s\n", "1", "VIEW");
			System.out.printf("[%-1s] %-8s\n", "2", "SEARCH");
			System.out.printf("[%-1s] %-8s\n", "3", "UPDATE");
			System.out.printf("[%-1s] %-8s\n", "4", "EXIT");
			System.out.println(border);
			System.out.print("ENTER (1-4): ");
			choice = scanner.nextInt();
			scanner.nextLine();
			System.out.println(border);
			switch(choice) {
				case 1:
					view(names, scores, id, classAvg);
				break;
				case 2:
					search(names, scores, id);
				break;
				case 3:
					updateControl(names, scores, id);
				break;
				case 4:
					exitYes = true;
				break;
				default:
					System.out.println("INVALID CHOICE");
			}
		}
		
		// controller
		
		// UPDATE (students and score)
		
		scanner.close();
	}
	// BREAK
	static String capitalize(String cap) {
		return cap = cap.substring(0, 1).toUpperCase() + cap.substring(1).toLowerCase();
	}
	// BREAK
	static String fullName(String name) {
		String first;
		String last;
		
		name = scanner.nextLine().trim();
		first = name.substring(0, name.lastIndexOf(" "));
		first = capitalize(first);
		last = name.substring(name.lastIndexOf(" ") + 1);
		last = capitalize(last);
		return name = first + " " + last;
		
	}
	// BREAK
	static void view(String[] names, double[] scores, int[] id, double classAvg) {
		double total = 0;
		int studentCount = 0;
		
		System.out.printf("%-4s %-20s %-8s\n", "ID", "NAME", "SCORE");
		for(int i = 0; i < id.length; i++) {
			System.out.printf("%-4d %-20s %-8.2f\n", id[i], names[i], scores[i]);
			if(names[i] != null) {
				total += scores[i];
				studentCount++;
			}
			if(i == id.length - 1) {
				classAvg = (studentCount > 0 ? total / studentCount : 0);
				System.out.printf("%-25s %-8.2f\n", "CLASS AVERAGE", classAvg);
			}
		}
	}
	// BREAK
	static void search(String[] names, double[] scores, int[] id) {
		String target;
		boolean check;
		boolean found =  false;
	
		System.out.print("ENTER ID OR FULL NAME: ");
		target = scanner.nextLine().trim();
		
		for(int i = 0; i < id.length; i++) {
			check = target.equalsIgnoreCase(names[i]) || target.equals(String.valueOf(id[i]));
			if(check) {
				System.out.printf("%-4s %-20s %-8s\n", "ID", "NAME", "SCORE");
				System.out.printf("%-4s %-20s %-8s\n", id[i], names[i], scores[i]);
				found = true;
				break;
			}
		}
		
		if(!found) {
			System.out.println("TARGET NOT FOUND");
		}
	}
	// BREAK
	static void updateControl(String[] names, double[] scores, int[] id) {
		int choice;
		boolean invalidYes = true;
		
		while(invalidYes) {
			System.out.printf("[%-1s] %-8s\n", "1", "STUDENT");
			System.out.printf("[%-1s] %-8s\n", "2", "SCORE");
			System.out.println(border);
			System.out.print("ENTER (1-2): ");
			choice = scanner.nextInt();
			scanner.nextLine();
		
			if(choice == 1) {
				invalidYes = false;
				studentUpdate(names, scores, id);
			}
			else if(choice == 2) {
				invalidYes = false;
				scoreUpdate(names, scores, id);
			}
			else {
				System.out.println("INVALID CHOICE");
				System.out.println(border);
			}
		}
	}
	// BREAK
	static void studentUpdate(String[] names, double[] scores, int[] id) {
		int choice;
		String fullName = "";
		boolean check = false;
		boolean validYes = false;
		
		System.out.printf("[%-1s] %-8s\n", "1", "ADD");
		System.out.printf("[%-1s] %-8s\n", "2", "REMOVE");
		System.out.println(border);
		System.out.print("ENTER (1-2): ");
		choice = scanner.nextInt();
		scanner.nextLine();
		
		if(choice == 1) {
			System.out.print("ENTER THE FULL NAME: ");
			fullName = fullName(fullName);
			for(int i = 0; i < id.length; i++) {
				check = fullName.equalsIgnoreCase(names[i]);
				if(check) {
					System.out.println("NAME ALREADE REGISTERED");
					break;
				}
				if(names[i] == null) {
					names[i] = fullName;
					validYes = true;
					System.out.println(border);
					System.out.printf("STUDENT ADDED: [%d] %s\n", id[i], names[i]);
					break;
				}
			}
			
			if(!validYes) {
				System.out.println(border);
				System.out.println("INDEX FULL");
			}
		}
		else if(choice == 2) {
			System.out.printf("ENTER ID OR FULL NAME: ");
			fullName = scanner.nextLine().trim();
			for(int j = 0; j < id.length; j++) {
				check = fullName.equalsIgnoreCase(names[j]) || fullName.equals(String.valueOf(id[j]));
				if(check) {
					names[j] = null;
					scores[j] = 0;
					validYes = true;
					System.out.println(border);
					System.out.printf("STUDENT REMOVED: [%d] %s", id[j], names[j]);
					break;
				}
			}
			
			if(!validYes) {
				System.out.println("ID/NAMES NOT FOUND");
			}
		}
		else{
			System.out.println("INVALID OPTION");
			System.out.println(border);
		}		
	}
	// BREAK
	static void scoreUpdate(String[] names, double[] scores, int[] id) {
		String target;
		boolean check;
		boolean validYes = false;
		double newScore;
		
		System.out.print("ENTER ID OR FULL NAME: ");
		target = scanner.nextLine();
		for(int i = 0; i < id.length; i++) {
			check = target.equalsIgnoreCase(names[i]) || target.equals(String.valueOf(id[i]));
			if(check) {
				while(!validYes) {
					System.out.printf("[%d] %s %.2f\n", id[i], names[i], scores[i]);
					System.out.print("ENTER NEW SCORE: ");
					newScore = scanner.nextDouble();
					if(newScore >= 0 && newScore <= 100) {
						scores[i] = newScore;
					validYes = true;
					System.out.printf("SCORE UPDATED: [%d] %s %.2f\n", id[i], names[i], scores[i]);
					break;
					}
					else {
						System.out.println("INVALID SCORE");
					}
				}
			}
		}
		
		if(!validYes) {
			System.out.println("ID/NAME NOT FOUND");
		}
	}
	// BREAK
}

/* bugs & improvement
> giving invalid check neccesitate me to make an exit in case the user wants to go back. I'm lazy atm, maybe in the future'
> fullName capitalization issues:
	[1] Doesn't work with names that is more than 2 words
	[2] Doesn't work with single word name'
> names check issues:
	[1] Will work even if only 1 letter match if using contains
	[2] Verbose and must be precise with .equals
> maybe add more info after student addes/removed
*/