import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double bill;
		double tip;
		
		System.out.print("Enter your bill: ");
		bill = scanner.nextDouble();
		System.out.print("Enter the tip you want to leave (5/10/15)%: ");
		tip = scanner.nextDouble();
		
		
		System.out.println("Your total is: ");
		System.out.printf("Your bill: %.2f\n", bill);
		System.out.printf("Your tip: %.2f\n", calculateTip(bill, tip));
		System.out.printf("Total amount: %.2f", bill + calculateTip(bill, tip));
		
		
		scanner.close();
	}
	
	static double calculateTip(double bill, double tip) {
		return bill * tip/100;
	}
}

