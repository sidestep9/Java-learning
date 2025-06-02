import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Enter your name and title: ");
		nameTitle(scanner.nextLine(), scanner.nextLine());
		
		int won;
		System.out.print("\nEnter how many battles you've won: ");
		won = calcXP(scanner.nextInt());
		
		String title = levelTitle(won);
		System.out.printf("You are %s adventurer!\n", title);
		
		int lvl = 0;
		switch(title.toLowerCase()) {
			case "novice":
				lvl = 5;
			break;
			case "intermediate":
				lvl = 10;
			break;
			case "pro":
				lvl = 15;
			break;
			case "expert":
				lvl = 20;
			break;
		}
		
		if(entry(lvl)) {
			System.out.println("You may enter the dungeon");
		}
		else {
			System.out.println("Thou shalt not pass!");
		}
		
		
		scanner.close();
	}
	static void nameTitle (String name, String title) {
		System.out.printf("Ad astra abyssosque, %s %s\n", title, name);
	}
	static int calcXP(int battlesWon) {
		return battlesWon * 150;
	}
	static String levelTitle(int xp) {
		 if(xp < 500) {
			return "Novice";	
		}
		else if(xp < 1000) {
			return "Intermediate";
		}
		else if(xp < 2000) {
			return "Pro";
		}
		else{
			return "Expert";
		}
	}
	static boolean entry(int lvl) {
		return lvl >= 10;
	}
}