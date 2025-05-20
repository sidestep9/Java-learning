import java.util.Scanner;
import java.util.Random;

public class Main {
	public static void main (String[] args){
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		
		//Var
		int playerRoll;
		int enemyRoll;
		int enemyCheat;
		int enemyDice;
		String name;
		boolean ready;
		
		playerRoll = random.nextInt(6) + 1;
		enemyRoll = random.nextInt(6) + 1;
		enemyCheat = random.nextInt(2);
		enemyDice = Math.min(enemyRoll + enemyCheat, 6);
		boolean cheat = enemyCheat > 0;
		
		//out
		System.out.print("Enter your name: ");
		name = scanner.nextLine();
		
		System.out.println("\n\"Welcome, " + name + ", to the Dice Arena!");
		System.out.println("\"Are you ready for your first match?\"");
		
		System.out.print("\nAre you ready (true/false)? ");
		ready = scanner.nextBoolean();
		if (ready) {
			System.out.println("\n\"Then without further ado, let the fight begin!\"");
		}
		else {
			System.out.println("\n\"Well then, talk to me when you're ready.\"");
		}
		
		System.out.println("\nYou and your opponent stare menacingly at each other, then rolled your die at the same time");
		
		System.out.println("\nYour dice: " + playerRoll + " point" + (playerRoll == 1 ? "" : "s") + ".");
		System.out.println("Opponent's dice: " + enemyDice + " point" + (enemyDice == 1 ? "" : "s") + ".");
		
		if (playerRoll == enemyDice){
			if (cheat) {
				System.out.println("\n\"It's a draw!\" Although it's a draw, you sense something suspicious from your opponent.");
			}
			else {
				System.out.println("\n\"It's a draw!\" It's a draw. You have to roll again.");
			}
		}
		else if (playerRoll > enemyDice)  {
			if (cheat) {
				System.out.println("\n\"Aaaannddd it's a win for " + name + "!!!\"");
				System.out.println("Although you sensed something suspicious from your opponent, you still managed win.");
			}
			else {
				System.out.println("\n\"Aaaannddd it's a win for " + name + "!!!\"");
				System.out.println("You won.");
			}
		}
		else {
			if (cheat) {
				System.out.println("\n\"And unfortunately it's a loss for " + name + ". Better luck next time!\"");
				System.out.println("You sensed something suspicious from your opponent that may or may not be the cause for your loss.");
			}
			else {
				System.out.println("\n\"And unfortunately it's a loss for " + name + ". Better luck next time!\"");
				System.out.println("You lost fair and square.");
			}
		}
		
		scanner.close();
	}
}