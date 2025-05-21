import java.util.Scanner;

public class Main {
	public static void main (String[] args) throws InterruptedException {
		
		// for loop = execute some codes a certain amount of times
		// for (initialization ; condition ; update)
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("How many seconds do you want to countdown? ");
		int start = scanner.nextInt();
		
		for (int i = start ; i > 0 ; i--) {
			System.out.println(i);
			Thread.sleep(1000);
		}
		
		System.out.println("HAPPY NEW YEAR!");
		
		
		
		scanner.close();
		
		
	}
}