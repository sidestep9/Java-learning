import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int potion = 5;
		int potionHeal = 25;
		int playerHP = 60;
		int maxHP = 100;
		int potionUse;
		
		System.out.print("How many potions you'd like to use: ");
		potionUse = scanner.nextInt();
		
		if(potionUse <= potion) {
			potion -= potionUse;
			playerHP = Math.min(playerHP + (potionHeal * potionUse), maxHP);
			System.out.println("\nYou used " + potionUse + " potion" + (potionUse == 1 ? "" : "s"));
			System.out.println("HP restored: " + (potionUse * potionHeal));
			System.out.println("Current HP: " + playerHP);
			System.out.println("Potion" + (potion == 1 ? "" : "s") + " left: " + potion);
		}
		else {
			System.out.println("\nYou don't have enough potions");
		}
		
		scanner.close();
	}
}