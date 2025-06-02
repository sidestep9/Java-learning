import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int herbs = 1;
		int cost = 5;
		int potions = 0;
		int brew = 0;
		String input = "";
		
		System.out.println("This is a potion maker simulator.");
		System.out.print("Do you want to brew potions (yes/no)? ");
		input = scanner.nextLine().toLowerCase();
		
		
		if(!input.equals("no")) {
				System.out.print("Enter how many herbs you have: ");
				herbs = scanner.nextInt();
				scanner.nextLine();
				System.out.print("How many potions do you want to brew? ");
				brew = scanner.nextInt();
				scanner.nextLine();
				if(brew > herbs / 5) {
						System.out.println("Not enough herbs!");	
				}
				else {
						System.out.println("Potion" + (brew > 1 ? "s" : "") + " brewed!");
						potions += brew;
						herbs -= brew * cost;
						System.out.println("Potions: " + potions);
						System.out.println("Herbs left: " + herbs);
				}
				
				if(herbs > 4) {
					do {
						System.out.print("Would you like to continue (yes/no)? ");
						input = scanner.nextLine().toLowerCase();
						if(!input.equals("no")) {
							System.out.print("How many potions do you want to brew? ");
							brew = scanner.nextInt();
							scanner.nextLine();
							if(brew > herbs / 5) {
								System.out.println("Not enough herbs!");	
							}
							else {
								System.out.println("Potion" + (brew > 1 ? "s" : "") + " brewed!");
								potions += brew;
								herbs -= brew * cost;
								System.out.println("Potions: " + potions);
								System.out.println("Herbs left: " + herbs);
							}
						}
						} while(herbs > 4);
				}
				System.out.println("Not enough herbs left to continue.");				
		}
		else {
				System.out.println("...Why are you here then?");
			}
		
		if(herbs == 0)
		System.out.println("You don't have enough herbs left to continue.");
		
		scanner.close();
		
		// In case the player choose not to potions at the start, idk how to just terminate the program withouth printing line "You don't have enough herbs." -> nvm fixed.
		// This is verbose, is there a way to make it more efficient?
	}
}