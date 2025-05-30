import java.util.Scanner;

public class Main {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		double balance = 0;
		int choice;
		boolean isRunning = true;
		
		while(isRunning) {
			
			System.out.println("*****************");
			System.out.println("BANKING SIMULATOR");
			System.out.println("*****************");
			System.out.println("[1] SHOW BALANCE");
			System.out.println("[2] DEPOSIT");
			System.out.println("[3] WITHDRAW");
			System.out.println("[4] EXIT");
			System.out.println("*****************");
			System.out.print("Enter your choice (1-4): ");
			choice = scanner.nextInt();
			System.out.println("*****************");
			switch(choice) {
				case 1:
					showBalance(balance);
				break;
				case 2:
					balance += deposit();
				break;
				case 3:
					balance -= withdraw(balance);
				break;
				case 4:
					isRunning = false;
				break;
				default:
					System.out.println("INVALID CHOICE");
			}
			System.out.println("PRESS ENTER TO CONTINUE");
			scanner.nextLine();
			scanner.nextLine();
			// How to make a user input click so that it'll proceed manually rather than automatically?' -> found ✓
		}
		
		System.out.println("***************************");
		System.out.println("Thank you! Have a nice day!");
		System.out.println("***************************");
				
		scanner.close();
	}
	
	static void showBalance(double balance) {
		System.out.printf("$%.2f\n", balance);
		System.out.println("*****************");
	}
	static double deposit() {
		
		double amount;
		
		System.out.print("ENTER THE AMOUNT: ");
		amount = scanner.nextDouble();
		System.out.println("*****************");
		
		if(amount < 0) {
			System.out.println("INVALID AMOUNT");
			System.out.println("*****************");
			return 0;
		}
		else {
			return amount;
		}
		
	}
	static double withdraw(double balance) {
		
		double amount;
		
		System.out.print("ENTER THE AMOUNT: ");
		amount = scanner.nextDouble();
		System.out.println("*****************");
		
		if(amount < 0) {
			System.out.println("INVALID AMOUNT");
			System.out.println("*****************");
			return 0;
		}
		else if(amount > balance) {
			System.out.println("INSUFFICIENT FUNDS");
			System.out.println("*****************");
			return 0;
		}
		else {
			return amount;
		}
		
	}
}