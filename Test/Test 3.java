import java.util.Scanner;
import java.util.Random;

public class Main{
	public static void main(String[] args){
		
		// DECLARATION
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		// PHASE1 DECLARATIONS
		String name;
		String title = "";
		String titleInput;
		boolean titleYes;
		boolean titleNo;
		String code =  "FLA-942-SOL";
		String prefix = code.substring(0, code.indexOf("-"));
		String number = code.substring(code.indexOf("-") + 1, code.lastIndexOf("-"));
		String suffix = code.substring(code.lastIndexOf("-") + 1);
		String prefixInput;
		String numberInput;
		String suffixInput;
		boolean pass = false;
		// PHASE 2 DECLARATIONS
		String vocation;
		boolean vocationYes = false;
		// PHASE 3 DECLARATIONS
		double basePower;
		int relics = 1;
		double rcm = random.nextDouble() + 1;
		double finalPower;
		String relicInput;
		boolean relicYes;
		boolean relicNo;
		//PHASE 4 DECLARATION
		int attempts = 5;
		int min = 1;
		int max = 20;
		int randomNumber = random.nextInt(max) + min;
		int guess;
		boolean correctYes = false;
		
		
		// PHASE 1
		System.out.println("Welcome, adventurer!\n");
		System.out.println("You have been choosen to ascend the Tower of Seven Flames.");
		System.out.println("Before we begin though, please introduce yourself.\n");
		System.out.print("Enter your name: ");
		name = scanner.nextLine();
		do{
			System.out.print("\nDo you wish to display your title? ");
			titleInput = scanner.nextLine();
			titleYes = titleInput.equalsIgnoreCase("yes") || titleInput.equalsIgnoreCase("ye") || titleInput.equalsIgnoreCase("y") || titleInput.equalsIgnoreCase("ya");
			titleNo = titleInput.equalsIgnoreCase("no") || titleInput.equalsIgnoreCase("n");
			
			if(titleYes){
			System.out.print("Enter your title: ");
			title = scanner.nextLine();
			}
			else if(titleNo){
				System.out.println("Very well.");
			}
			else{
				System.out.println("Please input yes or no");
			}
			}while(!titleYes && !titleNo);
		
		System.out.println("\nPlease enter the password to proceed.");
		
		do{
			System.out.print("Enter the type: ");
			prefixInput = scanner.nextLine();
			System.out.print("Enter the number: ");
			numberInput = scanner.nextLine();
			System.out.print("Enter the keyword: ");
			suffixInput = scanner.nextLine();
			
			if(prefixInput.equalsIgnoreCase(prefix) && numberInput.equalsIgnoreCase(number) && suffixInput.equalsIgnoreCase(suffix)){
				System.out.println("Password correct.");
				System.out.println("You may proceed.\n");
				pass = true;
			}
			else{
				System.out.println("Password incorrect");
				System.out.println("Try again.\n");
			}
		}while(!pass);
		
		System.out.println("Welcome, " + title + (titleYes ? " " : "") + name);
	
		
		// PHASE 2
		
		System.out.println("\nTo proceed, please enter your elemental vocation.");
		do{
			System.out.print("Enter you vocation: ");
			vocation = scanner.nextLine().toLowerCase();
			switch(vocation){
				case "fire":
					System.out.println("You wield burning will.");
					vocation = "Fire";
					vocationYes = true;
				break;
				case "ice":
					System.out.println("Chill focus runs through you.");
					vocation = "Ice";
					vocationYes = true;
				break;
				case "earth":
					System.out.println("Steady as stone.");
					vocation = "Earth";
					vocationYes = true;
				break;
				case "storm":
					System.out.println("Wild and unpredictable.");
					vocation = "Storm";
					vocationYes = true;
				break;
				default:
					System.out.println("That element has no place in this tower.");
			}
		}while (!vocationYes);
		
		System.out.println("Element confirmed: " + vocation);
		
		// PHASE 3
		do{
			System.out.print("\nPlease enter your magic power level: ");
			basePower = scanner.nextDouble();
			scanner.nextLine();
			if(basePower <= 0){
				System.out.println("Invalid number.");
				System.out.println("Please try again.");
			}
		}while (basePower <= 0);
		do{
			System.out.print("Do you have any relics with you? ");
			relicInput = scanner.nextLine();
			relicYes = relicInput.equalsIgnoreCase("yes");
			relicNo = relicInput.equalsIgnoreCase("no");
			if(relicYes){
				do{
					System.out.print("How many relics do you have? ");
					relics = scanner.nextInt();
					scanner.nextLine();
					if(relics <= 0){
						System.out.println("Invalid amount.");
						System.out.println("Please enter again.");
					}
				}while(relics <= 0);
			}
			else if(relicNo){
				System.out.println("Very well.");
			}
			else{
				System.out.println("Please answer with Yes or No.");
			}
		}while(!relicYes && !relicNo);
		
		finalPower = Math.pow((basePower + relics * 10) * rcm, 1.15);
		
		System.out.println("Checking power levels\n.\n.\n.");
		if(finalPower >= 300){
			System.out.println("Your energy surges. You are worthy of ascencion.");
		}
		else{
			System.out.println("The flame dims... You lack the sparks.");
			// Program ends but idk how to do it
		}
		
		// PHASE 4
		System.out.println("\nFor the final trial, you must resonate your magic with the tower's.\nYou have " + attempts + " attempts.");
		do{
			System.out.println("Attempts left: " + attempts);
			System.out.print("Resonate your magic (enter a number between " + min + " - " + max + "): ");
			guess = scanner.nextInt();
			scanner.nextLine();
			if(guess > randomNumber){
				System.out.println("Flame too strong.");
				attempts--;
			}
			else if(guess < randomNumber){
				System.out.println("Flicker too faint");
				attempts--;
			}
			else{
				System.out.println("The crystal resonates with your soul!");
				correctYes = true;
				attempts--;
			}
		}while(!correctYes && attempts > 0);
		
		if(!correctYes){
			System.out.println("You've failed the trials.");
			// Program ends
		}
		
		
		System.out.println("\n\n=== Trial Complete ===");
		System.out.printf("Name     : %s\n", name);
		if(!title.equals("")){
			System.out.printf("Title    : %s\n", title);
		}
		System.out.printf("Element  : %s\n", vocation);
		System.out.printf("Power    : %.2f\n", finalPower);
		System.out.println("======================");
		
		
		
		scanner.close();
		
		// loop for titleYes -> done
		// checks for titleYes and else if are very verbose.
		// do I really need both titleYes & titleNo? maybe there's a way to just re-use one of them
		// the code check is also very verbose
		// Do I really need a boolean for every do-while loop checks?
		// Damn, so many do inside of if inside of do inside of if, is this normal? verbose? try simplify it? how?
		
		/* Things I can expand (if I want):
			 - Limit attempts for password checks
			 - Add more variations for relicYes/No, I was a bit lazy
		*/
	}
}