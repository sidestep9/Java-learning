import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// Var
		String vocation;
		
		System.out.print("Choose your vocation: (Fire, Ice, Lightning, Shadow, Healing) ");
		vocation = scanner.nextLine().toLowerCase();
		
		switch(vocation) {
			case "fire":
				System.out.println("You choose fire magic. Really, why does everyone like to blow things up so much...");
			break;
			case "ice":
				System.out.println("You choose ice magic. The cool guys magic. Heh, get it?");
			break;
			case "lightning":
				System.out.println("You choose lightning magic. Zip, zap. That's pretty much lightning magic.");
			break;
			case "shadow":
				System.out.println("You choose shadow magic. Ahh, likes to hides in the corner eh? Or maybe, you have some nefarious thought to your other classmates... you're not gonna do anything weird, are you?");
			break;
			case "healing":
				System.out.println("You choose healing magic. When everyone just want to throw blow things up, you choose to fix them instead.");
			break;
			default:
				System.out.println("That school of magic doesn't exist.");
		}
		
		
		scanner.close();
		
		//Less verbose than else if, but still verbose
	}
}