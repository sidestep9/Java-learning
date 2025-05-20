import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//compound interest calculator
		
		double principal;
		double rate;
		int timesCompounded;
		int years;
		double amount;
		
		System.out.print("Enter your principal: ");
		principal = scanner.nextDouble();
		
		System.out.print("Enter the interest rate (in%): ");
		rate = scanner.nextDouble() / 100;
		
		System.out.print("Enter the # of times compounded: ");
		timesCompounded = scanner.nextInt();
		
		System.out.print("Enter the # of years: ");
		years = scanner.nextInt();
		 
		amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);
		
		System.out.printf("The amount after %d years is %.2f", years, amount);
		
		
		
		scanner.close();
	}
}