import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String password;
		String[] digits = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
		boolean digitYes = false;
		
		System.out.print("Enter your new password: ");
		password = scanner.nextLine();
		
		System.out.print("Password strength: ");
		for(int i = 0; i < digits.length; i++) {
			if(password.contains(digits[i])) {
				digitYes = true;
			}
		}
		if(password.length() < 6 && !digitYes) {
			System.out.println("weak");
		}
		else if(password.length() > 6 && digitYes) {
			System.out.println("strong");
		}
		else {
			System.out.println("moderate");
		}
	}
}