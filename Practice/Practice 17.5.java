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
		
		for(int i = 1; i <= height; i++) {
			for(int j = 1; j <= height - i; j++) {
				System.out.print("x");
			}
			for(int k = 1; k <= 2 * i - 1; k++) {
				System.out.print(symbol);
			}
			
			System.out.println();
		}
		
		
		scanner.close();
		
	}
}