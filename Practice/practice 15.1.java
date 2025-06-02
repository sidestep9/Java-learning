import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		
		Scanner scanner = new Scanner(System.in);
		
		int torch;
		
		System.out.print("How many torches did you pass? ");
		torch = scanner.nextInt();
		
		for(int i = 1; i <= torch; i++) {
			System.out.println("Torch " + i + " flickers...");
			Thread.sleep(500);
		}
		
		if(torch <= 0) {
			System.out.println("You wandered in darkness...");
		}
		else {
			System.out.println("\nAll torch" + (torch > 1 ? "es" : "") + " passed: " + torch + " in total.");
		}
		
		
		scanner.close();
		
		// Better move line 18 to before *for* to prevents unintentional flicker prints
	}
}