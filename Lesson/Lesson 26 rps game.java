import java.util.Scanner;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		String[] choices = {"rock", "paper", "scissors"};
		String player;
		String computer;
		String playAgain = "yes";
		boolean win = false;
			
		do {
			System.out.print("Enter your choice (rock/paper/scissors): ");
			player = scanner.nextLine().toLowerCase().trim();
			
			if(!player.equals("rock") && !player.equals("paper") && !player.equals("scissors")) {
				System.out.println("INVALID CHOICE");
				continue;
			}
			
			computer = choices[random.nextInt(3)];
			System.out.print("Computer choice: " + computer);
			
			System.out.println();
			
			win = player.equals("rock") && computer.equals("scissors") || player.equals("paper") && computer.equals("rock") || player.equals("scissors") && computer.equals("paper");
			if(player.equals(computer)) {
				System.out.println("It's a tie!");
			}
			else if(win) {
				System.out.println("You win!");
			}
			else {
				System.out.println("You lose!");
			}
			
			do{
				System.out.print("Play again (yes/no): ");
				playAgain = scanner.nextLine().toLowerCase().trim();
				if(!playAgain.equals("yes") && !playAgain.equals("no")){
					System.out.println("INVALID CHOICE");
				}
			}while(!playAgain.equals("yes") && !playAgain.equals("no"));
			
		}while(playAgain.equals("yes"));
		
		System.out.println("Goodbye and have a nice day!");
	}
}