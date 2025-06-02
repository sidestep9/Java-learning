import java.util.Random;

public class Main {
	
	static Random random = new Random();
	
	public static void main(String[] args) {
		
		char[][] map = new char[5][10];
		
		tile(map);
		System.out.println();
		count(map);
		
	}
	
	static void tile(char [][] map) {
		int playerRow, playerCol;
		int treasureRow, treasureCol;
		int rng;
		
		playerRow = random.nextInt(map.length);
		playerCol = random.nextInt(map[0].length);
		do {
			treasureRow = random.nextInt(map.length);
			treasureCol = random.nextInt(map[0].length);
		}while(treasureRow == playerRow && treasureCol == playerCol);
		
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				rng = random.nextInt(100);
				if(i == playerRow && j == playerCol) {
					map[i][j] = '@';
				}
				else if(i == treasureRow && j == treasureCol) {
					map[i][j] = 'T';
				}
				else if(rng < 50) {
					map[i][j] = '.';
				}
				else if(rng < 70) {
					map[i][j] = 'X';
				}
				else if(rng < 85) {
					map[i][j] = '~';
				}
				else {
					map[i][j] = '.';
				}
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	static void count(char[][] map) {
		int walkable = 0;
		int blocked = 0;
		int water = 0;
		int player = 0;
		int treasure = 0;
		
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				if (map[i][j] == '.') {
					walkable++;
				}
				else if (map[i][j] == 'X') {
					blocked++;
				}
				else if (map[i][j] == '~') {
					water++;
				}
				else if (map[i][j] == '@') {
					player++;
				}
				else {
					treasure++;
				}
			}
		}
		
		System.out.printf("Walkable (.): %d\n", walkable);
		System.out.printf("Blocked (X): %d\n", blocked);
		System.out.printf("Water (~): %d\n", water);
		System.out.printf("Player (@): %d\n", player);
		System.out.printf("Treasure (T): %d\n", treasure);
	}
}

// bugs & improvements

// how to make @ & T appear with 10% and 5% chance respectively, while making sure they appear at least once, doesn't overlap with each others, and only appear once.

/*
for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				rng = random.nextInt(100);
				if(rng < 50) {
					map[i][j] = '.';
				}
				else if(rng < 70) {
					map[i][j] = 'X';
				}
				else if(rng < 85) {
					map[i][j] = '~';
				}
				else if(rng < 95 && i == playerRow && j == playerCol) {
					map[i][j] = '@';
				}
				else if(rng < 100 && i == treasureRow && j == treasureCol) {
					map[i][j] = 'T';
				}
*/

// I tries with that above but it didn't guarantee them appear'

// with my current code at most it's 50-20-15-7-7 chances for .-X-~-@-T respectively