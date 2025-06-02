import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		///declaration
		Scanner scanner = new Scanner(System.in);
		
		String sigil1;
		String sigil2;
		String sigil3;
		String input;
		String letters;
		String numbers;
		
		sigil1 = "FIR-402";
		sigil2 = "ICE-777";
		sigil3 = "LUX-975";
		
		//out
		System.out.print("Enter the sigil code: ");
		input = scanner.nextLine().toUpperCase();
		
		
		switch(input) {
			case "FIR-402":
				letters = sigil1.substring(0, 3);
				numbers = sigil1.substring(4);
				System.out.println(letters + " -> Fire magic. Volatile but strong.");
				System.out.println("Spell power level: " + numbers);
			break;
			case "ICE-777":
				letters = sigil2.substring(0, 3);
				numbers = sigil2.substring(4);
				System.out.println(letters + " -> Ice magic. Cold and calculated.");
				System.out.println("Spell power level: " + numbers);
			break;
			case "LUX-975":
				letters = sigil3.substring(0, 3);
				numbers = sigil3.substring(4);
				System.out.println(letters + " -> Light magic. Rare and radiant.");
				System.out.println("Spell power level: " + numbers);
			break;
			default:
				System.out.println("Unknown sigil type...");
		}
		
		
		
		scanner.close();
		// I should just yeet letters and number and use input.substring instead
	}
}