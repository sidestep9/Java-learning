import java.util.Scanner;
import java.util.Random;

public class Main {
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		//var
		String name;
		
		String item1 = "Sword of Flames";
		String item2 = "Shield of Frost";
		String item3 = "Amulet of Luck";
		String item4 = "Potion of Strength";
		String item5 = "Bag of Gold";
		String item6 = "Potato";
		
		String input;
		
		int lootGet = random.nextInt(6) + 1;
		int goldBag = random.nextInt(400) +101;
		
		boolean chestOpen;
		boolean magical;
		
		//out
		System.out.print("Hello, adventurer! This is a loot box generator. Please enter your name: ");
		name = scanner.nextLine();
		
		System.out.println("\nHello, " + name + ", would you like to open the chest? (yes/no)");
		input = scanner.nextLine().toLowerCase();
		chestOpen = input.equals("yes") || input.equals("y") || input.equals("ya");
		
		if (chestOpen) {
			if (lootGet >= 1 && lootGet <= 3) {
				magical = true;
				if (magical) {
					if (lootGet == 1) {
						System.out.println("\nThe chest before you seems to glow with magic.");
						System.out.println(name + " opened the chest...");
						System.out.println("He found: " + item1+ "!");
						System.out.println("The sword emenates a hot air around it. You can faintly see the burning embers surrounding it.");
					}
					else if (lootGet == 2) {
						System.out.println("\nThe chest before you seems to glow with magic.");
						System.out.println(name + " opened the chest...");
						System.out.println("He found: " + item2 + "!");
						System.out.println("The shield felt cold to touch. It's covered in thin sheet of ice.");
					}
					else if (lootGet == 3) {
						System.out.println("\nThe chest before you seems to glow with magic.");
						System.out.println(name + " opened the chest...");
						System.out.println("He found: " + item3 + "!");
						System.out.println("The amulet seems to glow with power.");
					}
				}				
			}
			else {
				if (lootGet == 4) {
					System.out.println("\nThe chest before you seems ordinary.");
						System.out.println(name + " opened the chest...");
						System.out.println("He found: " + item4 + "!");
						System.out.println("A vial with a deep red liquid inside. You wonder what it does.");
				}
				else if (lootGet == 5) {
					System.out.println("\nThe chest before you seems ordinary.");
						System.out.println(name + " opened the chest...");
						System.out.println("He found: " + item5 + "!");
						System.out.println("You opened it to find " + goldBag + " gold Coins inside!");
				}
				else if (lootGet == 6) {
					System.out.println("\nThe chest before you seems ordinary.");
						System.out.println(name + " opened the chest...");
						System.out.println("He found: " + item6 + "!");
						System.out.println("...Well, better than nothing, they said.");
				}
			}
		}
		else {
			System.out.println("\nOh well, your loss. Have a good day!");
		}
		
		
		
		scanner.close();
		
		//Seems too verbose, too many if statements
		//I wonder if I can combine all the Strings variable into one...
		//Actually, I wonder how to shorten this whole program...
	}
}