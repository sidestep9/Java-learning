import java.util.Scanner;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		
		// Declaration
		Scanner scanner = new Scanner(System.in);
		
		Random random = new Random();
		
		String name;
		String title;
		String code;
		String codeInput;
		String prefix;
		String number;
		String suffix;
		String vocation;
		double basePower;
		double rcm;
		double finalPower;
		int relics;
		
		
		code = "Ascend-14045-BAL";
		prefix = code.toLowerCase().substring(0, 6);
		number = code.substring(code.indexOf("-") + 1, code.lastIndexOf("-"));
		suffix = code.substring(code.indexOf("-") + 1);
		rcm = random.nextDouble() + 1;
		
		
		// PHASE 1
		
		System.out.print("Enter your name: ");
		name = scanner.nextLine().trim();
		
		System.out.print("Enter your trial's registration phrase: ");
		codeInput = scanner.nextLine();
		
		if(codeInput.contains(prefix) &&  codeInput.contains(number) && codeInput.contains(suffix) && codeInput.contains("-")) {
			System.out.println("Identity confirmed. Welcome, apprentice " + name + ".");
		}
		else{
			System.out.println("The guardian frowns. Something is off...");
		}
		
		// PHASE 2
		
		System.out.print("Enter your vocation: ");
		vocation = scanner.nextLine().toLowerCase();
		
		switch(vocation) {
			case "fire":
				System.out.println("Flame surge in your hand.");
			break;
			case "ice":
				System.out.println("Ice encased your hand.");
			break;
			case "wind":
				System.out.println("Sharp blades of wind manifested on top of your hand.");
			break;
			case "earth":
				System.out.println("Rocks and soils gather around you.");
			break;
			case "light":
				System.out.println("Your hands glow dimly.");
			break;
			case "shadow":
				System.out.println("Darkness covers you.");
			break;
			default:
				System.out.println("The path is not recognized by the tower.");
				
		}
		
		vocation = vocation.toUpperCase().charAt(0) + vocation.substring(1);
		
		// PHASE 3
		
		System.out.println("Enter you power level: ");
		basePower = scanner.nextDouble();
		
		System.out.println("Enter how many relics you have: ");
		relics = scanner.nextInt();
		
		System.out.println("You test your power.");
		finalPower = Math.pow((basePower + relics * 10) * rcm, 1.1);
		
		if(finalPower > 200) {
			System.out.println("You pass");
		}
		else {
			System.out.println("You failed");
		}
		
		scanner.close();
		
		//  if else at phase 1 feels stoopid and redundant.
		// I have no idea why I had to seperate code into three substring. Am I misunderstanding the task?
		// vocation uppercase a bit redundant.
		// Feeling a bit sleepy, and maybe a bit burnout. Though I cleared the task, the result is lackluster.
	}
}