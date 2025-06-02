import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double totalSum;
		double split;
		int numPeople;
		
		System.out.println("This is a bill calculator\n");
		System.out.print("Enter your total bill: ");
		totalSum = scanner.nextDouble();
		System.out.print("Enter the number of people: ");
		numPeople = scanner.nextInt();
		
		split = totalSum / numPeople;
		
		if(totalSum % numPeople == 0) {
			System.out.printf("\n\nEach person pays: %.2f G", split);
		}//fixed changed split to totalSum
		else {
			split = Math.ceil(split * 100) / 100;//fixed added split = and * 100 / 100 to round up to the next cent
			System.out.printf("\n\nEach person pays approximately: %.2f G", split);
		}
		
		scanner.close();
	}
}