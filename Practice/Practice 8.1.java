import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String gateName = "Azural";
		String gateInput;
		
		System.out.println("Before you stands a giant ancient magical gate. Only by saying its true name can you activate it.");
		System.out.print("Enter the name: ");
		gateInput = scanner.nextLine();
		
		gateInput.trim();
		if(gateInput.contains("z")) {
			gateInput.replace("z", "Z");
		}
		
		System.out.println("\nName entered: " + gateInput + "\nCharacters used: " + gateInput.length() + "\n");
		
		if(gateInput.equals("Azural")) {
			System.out.println("Access granted. Please proceed, champion.");
		}
		else if(gateInput.toLowerCase().contains("zur")) {
			System.out.println("Hmm... close, but not quite there yet.");
		}
		else if(gateInput.equals("")) {
			System.out.println("Silence holds no power.");
		}
		else if(gateInput.toLowerCase().charAt(0) == 'a') {
			System.out.println("At least you start strong...");
		}
		
		
		
		scanner.close();
		
		//Everything works except line 17. It won't replace the z for some reason.
	}
}