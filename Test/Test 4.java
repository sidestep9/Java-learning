import java.util.Scanner;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		
		// DECLARATION
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		// P1
		String name;
		String role;
		boolean roleYes;
		int age = 0;
		int baseHp;
		int basePower;
		// P2
		int roomRng = random.nextInt(5) + 1;
		String action;
		boolean invalidCommand = false;
		// P3
		int textRng;
		int enemyHp = wraithHp(1);
		int enemyPower = wraithAtk(1);
		
		// PHASE 1
		System.out.println("In front of you is the dungeon of Black Hollow.");
		System.out.println("You must prove yourself before you can proceed.\n");
		System.out.print("Enter your name: ");
		name = scanner.nextLine();
		name = name.trim();
		name = capitalize(name);
		do {
			System.out.print("What is your role (Knight/Mage/Rogue): ");
			role = scanner.nextLine();
			role = role.trim();
			role = capitalize(role);
			roleYes = role.equalsIgnoreCase("knight") || role.equalsIgnoreCase("mage") || role.equalsIgnoreCase("rogue");
			if(!roleYes) {
				System.out.println("That role doesn't exist.\n");
			}
		}while(!roleYes);
		do {
			System.out.print("Enter your age: ");
			age = scanner.nextInt();
			scanner.nextLine();
			if(age < 16){
				System.out.println("You're not old enough. Turn back.");
				System.out.println("P.S because idk how to forcefully end the program, I will loop this until you enter the minimum age which is 16 yo.\n");
			}
			else {
				System.out.println();	
			}
		}while(!isOldEnough(age));
			
		System.out.println("You are worthy.");
		welcome(name, role);
		
		baseHp = baseHp(role);
		basePower = basePower(role);

		// PHASE 2
		do {
			baseHp = baseHp(role);
			for(int i = 1; i <= roomRng; i++) {
				do {
					System.out.println("You enter the " + numberToWord(i) + " room.");
					System.out.println("[Fight] [Sneak] [Run]");
					action = scanner.nextLine().toLowerCase();
					invalidCommand = false;
					switch(action) {
						case "fight":
							System.out.println("You fought some monsters inside.");
							baseHp -= chooseAction(action);
						break;
						case "sneak":
							System.out.println("You choose to sneak ahead.");
						if(chooseAction(action) > 50) {
							System.out.println("You succeded.");
						}
						else {
							System.out.println("You failed and took some damage.");
							baseHp -= random.nextInt(11) + 10;
						}
						break;
						case "run":
							System.out.println("You sprint, avoiding most of the monsters and traps.");
							baseHp -= chooseAction(action);
						break;
						default:
							System.out.println("Invalid command.");
							invalidCommand = true;
					}
				}while(invalidCommand);	
			}
			if(baseHp <= 0) {
				System.out.println("You are dead.");
				System.out.println("Try again.");
				// idk how to end the program here in case the player ded.
			}
			else {
				System.out.println("\nYou passed all the rooms.");
			}
		}while(baseHp <= 0);


		// PHASE 3
		System.out.println("\nYou enter the final room.");
		System.out.println("In the middle of the room, stood a fearsome wraith.");
		System.out.println("You must defeat it if you want to clear the dungeon.\n");
		do{
			textRng = random.nextInt(5) + 1;
			switch(textRng) {
				case 1:
					System.out.println("You hit its sides, but the Wraith hit you back.");
				break;
				case 2:
					System.out.println("You dodge and evade while trying to break through its defenses");
				break;
				case 3:
					System.out.println("The Wraith and you have an epic tumble.");
				break;
				case 4:
					System.out.println("You and the Wraith traded hit with each other.");
				break;
				case 5:
					System.out.println("You gave it your all, and both you and the Wraith are taking injuries.");
				break;
				default:
					System.out.println();
			}
			enemyHp -= basePower * ((random.nextInt(100) + 1)/100);
			baseHp -= enemyPower * ((random.nextInt(100) + 1)/100);
		}while(baseHp > 0 || enemyHp > 0);
		
		System.out.println();
		
		// SUMARRY
		if(baseHp <= 0 && enemyHp <= 0) {
			System.out.println("Although you killed the Wraith, you're too wounded to make it.");
			System.out.println("Hp left: " + baseHp);
			System.out.println("Power: " + basePower);
			System.out.println("Role: " + role);
		}
		else if(enemyHp <= 0) {
			System.out.println("You conquered the dungeon. Congratulations!");
			System.out.println("Hp left: " + baseHp);
			System.out.println("Power: " + basePower);
			System.out.println("Role: " + role);
		}
		else {
			System.out.println("You died.");
			System.out.println("Hp left: " + baseHp);
			System.out.println("Power: " + basePower);
			System.out.println("Role: " + role);

		
		scanner.close();	
		}
	}
	
	// PHASE 1 METHODS
	static void welcome(String name, String role) {
		System.out.printf("Welcome, %s the %s\n", name, role);
	}
	static String capitalize(String cap) {
		return cap.substring(0, 1).toUpperCase() + cap.substring(1).toLowerCase();
	}
	static boolean isOldEnough(int age) {
		return age >= 16;
	}
	static int baseHp(String role) {
		if(role.equals("Knight")){
			return 200;
		}
		else if(role.equals("Mage")) {
			return 100;
		}
		else if(role.equals("Rogue")) {
			return 150;
		}
		else{
			return 0;	
		}
	}
	static int basePower(String role) {
		if(role.equals("Knight")) {
			return 20;
		}
		else if(role.equals("Mage")) {
			return 30;
		}
		else if(role.equals("Rogue")) {
			return 25;
		}
		else {
			return 0;
		}
	}
	
	// PHASE 2 METHODS
	static int chooseAction(String action) {
		Random random = new Random();
		int fightRng = random.nextInt(21) + 10;
		int sneakRng = random.nextInt(100) + 1;
		int runRng = random.nextInt(11) + 10;
		
		if(action.equalsIgnoreCase("fight")) {
			return fightRng;
		}
		else if(action.equalsIgnoreCase("sneak")) {
			return sneakRng;
		}
		else {
			return runRng;
		}
	}
	static String numberToWord(int num) {
			switch(num) {
				case 1: return "first";
				case 2: return "second";
				case 3: return "third";
				case 4: return "fourth";
				case 5: return "fifth";
				default: return num + "th";
			}
		}
		
	// PHASE 3 METHODS
	static int wraithHp(int hp) {
		Random random = new Random();
		
		int mobHp = random.nextInt(101) + 100;
		
		return mobHp;
	}
	static int wraithAtk(int atk) {
		Random random = new Random();
		
		int mobAtk = random.nextInt(21) + 10;
		
		return mobAtk;
	}
}