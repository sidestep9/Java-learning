import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int height;
		int width;
		char symbol;
		
		height = 5;
		width = 5;
		symbol = '*';
		
		
		for(int i = 0; i < height; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(symbol + " ");
			}
			System.out.println();
		}
		
		
		scanner.close();
	}
}