import java.util.Scanner;
import java.util.Random;

public class Main {
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		String pName;
		String pSpName;
		String pRank;
		String enName;
		String enSpName;
		String enRank;
		double pMagPow;
		double enMagPow;
		double pDamage;
		double enDamage;
		int pChMul;
		int enChMul;
		boolean winYes;
		boolean drawYes;
		
		pChMul = random.nextInt(10) + 1;
		enName = "Rival Mage";
		enSpName = "Meteor";
		enMagPow = 5 + random.nextDouble() * 5;
		enChMul = random.nextInt(10) + 1;
		enDamage = Math.pow(enMagPow, 1.2) * enChMul;
		if(enMagPow < 5) {
			enRank = "Novice";
		}
		else if(enMagPow < 8) {
			enRank = "Adept";
		}
		else if(enMagPow < 10) {
			enRank = "Expert";
		}
		else {
			enRank = "Archmage";
		}
		
		System.out.println("Welcome player to the duel simulator. Please fill in your information: ");
		System.out.print("Enter your name: ");
		pName = scanner.nextLine();
		System.out.print("Enter your spell: ");
		pSpName = scanner.nextLine();
		System.out.print("Enter your power level: ");
		pMagPow = scanner.nextDouble();
		if(pMagPow < 5) {
			pRank = "Novice";
		}
		else if(pMagPow < 8) {
			pRank = "Adept";
		}
		else if(pMagPow < 10) {
			pRank = "Expert";
		}
		else {
			pRank = "Archmage";
		}
		
		
		 System.out.println("\nYou are " + pName + ", the spell you are using is " + pSpName + ", your power level is " + pRank + ".");
		 System.out.println("\nYour opponent is " + enName + ", they are " + enRank);
		 
		 System.out.println("\nPlayers, get ready.");
		 System.out.println(".");
		 System.out.println(".");
		 System.out.println(".");		 
		 System.out.println("Go!");
		 
		 pDamage = Math.pow(pMagPow, 1.2) * pChMul;
		 
		 winYes = pDamage > enDamage;
		 drawYes = pDamage == enDamage;
		 
		 if(winYes) {
		 	System.out.printf("\n" + pName + " casts " + pSpName + " with %.2f damage!", pDamage);
		 	System.out.printf(enName + " casts " + enSpName + " with %.2f damage!", enDamage);
		 	System.out.println("\nYou win!");
		 }
		 else if(drawYes) {
		 	System.out.printf("\n" + pName + " casts " + pSpName + " with %.2f damage!", pDamage);
		 	System.out.printf(enName + " casts " + enSpName + " with %.2f damage!", enDamage);
		 	System.out.println("\nIt's a draw!");
		 }
		 else {
		 	System.out.printf("\n" + pName + " casts " + pSpName + " with %.2f damage!", pDamage);
		 	System.out.printf(enName + " casts " + enSpName + " with %.2f damage!", enDamage);
		 	System.out.println("\nYou lose!");
		 }
		 
		scanner.close();	
		//Perhaps I can expand this more.
		//Nothing to add, I'm satisfied with this next would be to learn loop or method or class?
	}
}