import java.util.Scanner;
import java.util.Random;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	static Random random = new Random();
	
	static String border = "***************************";
	
	public static void main(String[] args) {
		
		int balance;
		int bet;
		int payout;
		char[] symbols = {'C', 'W', 'L', 'B', 'S'};
		char[][] grid = new char[3][3];
		String playAgain = "yes";
		
		balance = 300;
		
		do {
			System.out.println(border);
			System.out.println("SLOT MACHINE SIMULATOR");
			System.out.print("Symbols: ");
			for(char symbol : symbols) {
				System.out.print(symbol + " ");
			}
			System.out.println();
			System.out.println("Your balance: " + balance);
			System.out.println(border);
			System.out.print("Enter your bet: ");
			bet = sc.nextInt();
			sc.nextLine();
			if(bet <= 0) {
				System.out.println("Invalid amount");
				continue;
			}
			else if(bet > balance) {
				System.out.println("Not enough balance");
				continue;
			}
			
			balance -= bet;
			slot(grid, symbols);
			payout = payout(grid, symbols, balance, bet);
			balance += payout;
			System.out.println("Balance: " + balance);
			
			do {
				System.out.println(border);
				System.out.print("Continue (yes/no): ");
				playAgain = sc.nextLine().trim().toLowerCase();
				if(!playAgain.equals("yes") && !playAgain.equals("no")) {
				System.out.println("Invalid choice");
				}
			} while(!playAgain.equals("yes") && !playAgain.equals("no"));
			
		}while(playAgain.equals("yes"));
		
		System.out.println("Goodbye and have a nice day!");
		
		sc.close();
	}
	
	static void slot(char[][] grid, char[] symbols) {
		int rng;
		
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[i].length; j++) {
				rng = random.nextInt(100);
				
				if(rng < 20) {
					grid[i][j] = symbols[0];	
				}
				else if(rng < 40) {
					grid[i][j] = symbols[1];
				}
				else if(rng < 60) {
					grid[i][j] = symbols[2];
				}
				else if(rng < 80) {
					grid[i][j] = symbols[3];
				}
				else {
					grid[i][j] = symbols[4];
				}
				System.out.printf("|   %c   |", grid[i][j]);
			}
			System.out.println();
		}
	}
	
	static int payout (char[][] grid, char[] symbols, int balance, int bet) {
		boolean[] horizontal = {false, false, false};
		boolean[] diagonal ={false, false};
		int total = 0;
		
		for(char symbol : symbols) {
			horizontal[0] = symbol == grid[0][0] && symbol == grid[0][1] && symbol == grid[0][2];
			horizontal[1] = symbol == grid[1][0] && symbol == grid[1][1] && symbol == grid[1][2];
			horizontal[2] = symbol == grid[2][0] && symbol == grid[2][1] && symbol == grid[2][2];
			diagonal[0] = symbol == grid[0][0] && symbol == grid[1][1] && symbol == grid[2][2];
			diagonal[1] = symbol == grid[2][0] && symbol == grid[1][1] && symbol == grid[0][2];
			
			if(horizontal[0]) {
				total += (bet * 1.5);
			}
			if(horizontal[1]) {
				total += (bet * 1.5);
			}
			if(horizontal[2]) {
				total += (bet * 1.5);
			}
			if(diagonal[0]) {
				total += (bet * 1.5);
			}
			if(diagonal[1]) {
				total += (bet * 1.5);
			}
		}
		
		return total;
	}
}

/* bugs & improvements

> rate are currently similaf across all symbols
> win checks might be a bit verbose
> if I can do ^^ make more winning possibilities
*/