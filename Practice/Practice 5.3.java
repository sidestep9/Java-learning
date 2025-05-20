import java.util.Scanner;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		String pName;
		String wepName;
		String wepEle;
		String input;
		String wepGrade;
		double baseDamage;
		double rqm;
		double finDamage;
		boolean eleYes;
		boolean blessYes;
		
		rqm = 1 + random.nextDouble();
		blessYes = rqm > 1.9;
		
		System.out.println("Welcome player! This is Weapon Forge Simulator. Please enter your information.");
		System.out.print("Enter your name: ");
		pName = scanner.nextLine();
		System.out.print("Enter your weapon: ");
		wepName = scanner.nextLine();
		System.out.print("Enter your weapon damage: ");
		baseDamage = scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Does your weapon have an element? ");
		input = scanner.nextLine().toLowerCase();
		eleYes = input.equals("yes");
		if(eleYes) {
			System.out.print("Enter your weapon element: ");
			wepEle = scanner.nextLine();
		}
		else {
			System.out.println("Very well.");
			wepEle = "";
		}
		
		
		System.out.println("\nForging your weapon...");
		System.out.println(".");
		System.out.println(".");
		System.out.println(".");
		if(blessYes){
			System.out.print("The forge hums... This weapon is blessed by the ancients.");
		}
		System.out.println("Forging complete!");
		
		finDamage = Math.pow(baseDamage * rqm, 1.1);
		if(finDamage < 100) {
			wepGrade = "Common";
		}
		else if(finDamage < 200) {
			wepGrade = "Rare";
		}
		else if(finDamage < 300) {
			wepGrade = "Epic";
		}
		else {
			wepGrade = "Legendary";
		}
		
		System.out.println("\nForged weapon: " + wepName + (eleYes == true ? " (" + wepEle + ")" : ""));
		System.out.println("Base damage: " + baseDamage);
		System.out.printf("Quality Multiplier: %.2f\n" , rqm);
		System.out.printf("Final damage: %.2f\n", finDamage);
		System.out.println("Grade: " + wepGrade);
		
		scanner.close();
		
		//Line 66 wepEle might not be initialized
		//This won't run because of that, I don't get it. wepEle initialization is at line 36 tho? ✓ fixed
		//Line 32 problem. It didn't give me the chance to input anything, just straight up skip and made eleYes false. ✓ Fixed. Don't forget to add dummy nextLine after nextDouble.
	}
}