import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	static Random random = new Random();
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		char[][] dungeon = new char[5][7];
		
		generator(dungeon);
		search(dungeon);
		
		scanner.close();	
	}
	
	static void generator(char[][] dungeon) {
		int playerRow, playerCol;
		int treasureRow, treasureCol;
		
		playerRow = random.nextInt(dungeon.length);
		playerCol = random.nextInt(dungeon[0].length);
		
		do {
			treasureRow = random.nextInt(dungeon.length);
			treasureCol = random.nextInt(dungeon[0].length);
		}while(treasureRow == playerRow && treasureCol == playerCol);
		
		for(int i = 0; i < dungeon.length; i++) {
			for(int j = 0; j < dungeon[i].length; j++) {
				if(i == playerRow && j == playerCol) {
					dungeon[i][j] = '@';
				}
				else if(i == treasureRow && j == treasureCol) {
					dungeon[i][j] = 'T';
				}
				else {
					dungeon[i][j] = random.nextInt(100) < 60 ? '.' : 'X';	
				}
				System.out.print(dungeon[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	static void search(char[][] dungeon) {
		char target;
		boolean found = false;
		
		System.out.print("Enter the tile you're looking for (T/@):  ");
		target = scanner.next().charAt(0);
		
		for(int i = 0; i < dungeon.length; i++) {
			for(int j = 0; j < dungeon[i].length; j++) {
				if(target == dungeon[i][j]) {
					System.out.printf("%c found at: row %d, column %d", target, i + 1, j + 1);
					found = true;
					break;
				}
			}
			if(found) {
				break;
			}
		}
	}
}