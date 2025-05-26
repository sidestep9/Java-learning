import java.util.Scanner;

public class Main {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int width;
		int height;
		
		System.out.print("Input width: ");
		width = scanner.nextInt();
		System.out.print("Input height: ");
		height = scanner.nextInt();
		
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				if(i == 0 || j == 0 || i == height - 1 || j == width - 1) {
					System.out.print("#" + " ");
				}
				else {
					System.out.print(" " + " ");
				}
			}
			System.out.println();
		}
		
		scanner.close();
	}
}