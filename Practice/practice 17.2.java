import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int height;
		int width;
		char symbol;
		
		/*System.out.print("Enter the height: ");
		height = scanner.nextInt();
		System.out.print("Enter the width: ");
		width = scanner.nextInt();
		System.out.print("Enter the symbol: ");
		symbol = scanner.next().charAt(0);*/
		
		height = 5;
		width = 6;
		symbol  = '*';
		
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				if(j == 0 || j == i || (i == height - 1 && j <= 1)){
					System.out.print(symbol + " ");	
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		scanner.close();
	}
}