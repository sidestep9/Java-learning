import java.util.Scanner;
import java.util.Random;

public class Main {
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		//var
		String name;
		
		double min = 0.25;
		double max = 0.75;
		
		String wepName1;
		int wepDamage1 = 12;
		int cRate1 = 6;
		double cDamage1 = wepDamage1 +  wepDamage1 * (min - random.nextDouble() + (max - min));
		
		String wepName2;
		int wepDamage2 = 4;
		int cRate2 = 20;
		double cDamage2 = wepDamage2 + wepDamage2 * (min - random.nextDouble() + (max - min));
		
		int baseCrit = random.nextInt(100) + 1;
		boolean yesCrit1 = baseCrit + cRate1 >= 100;
		boolean yesCrit2 = baseCrit + cRate2 >= 100;
		
		double damage1 = yesCrit1 ? cDamage1 : wepDamage1;
		double damage2 = yesCrit2 ? cDamage2 : wepDamage2;
		
		//out
		System.out.println("Hello, player! This is a calculator for damage. Simply put your details and we'll do the rest.");
		
		System.out.print("\nEnter your name: ");
		name = scanner.nextLine();
		System.out.print("Enter your weapon name: ");
		wepName1 = scanner.nextLine();
		System.out.print("Enter your second weapon name: ");
		wepName2 = scanner.nextLine();
		
		System.out.println("\nCalculating damage...");
		
		if (yesCrit1 || yesCrit2) {
			System.out.println("\n" + name + " strikes with " + wepName1 + " and " + wepName2 + "!");
			if (yesCrit1) {
			System.out.println(wepName1 + " deals " + damage1 + " point" + (damage1 == 1 ? "" : "s") + "! (Critical hit)");
			}
			else {
			System.out.println(wepName1 + " deals " + damage1 + " point" + (damage1 == 1 ? "" : "s") + "!");
			}
			
			if (yesCrit2) {
			System.out.println(wepName2 + " deals " + damage2 + " point" + (damage2 == 1 ? "" : "s") + "! (Critical hit)");
			}
			else {
				System.out.println(wepName2 + " deals " + damage2 + " point" + (damage2 == 1 ? "" : "s") + "!");
			}
		}
		else {
			System.out.println("\n" + name + " strikes with " + wepName1 + " and " + wepName2 + "!");
			System.out.println(wepName1 + " deals " + damage1 + " point" + (damage1 == 1 ? "" : "s") + "!");
			System.out.println(wepName2 + " deals " + damage2 + " point" + (damage2 == 1 ? "" : "s") + "!");
		}
		
		scanner.close();
		//Don't forget to ask how to make yesCrit1 and yesCrit2 in one variable.
		//wepName2 have no boolean.
		//how to limit the decimals in damages
	}
}