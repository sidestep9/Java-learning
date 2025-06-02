import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		// DECL
		Scanner scanner = new Scanner(System.in);
		
		double num1;
		double num2;
		double num3;
		double num4;
		double num5;
		double num6;
		double result1 = 0;
		double result2 = 0;
		double result3 = 0;
		char operator1;
		char operator2;
		char operator3;
		boolean valid = true;
		
		// out
		System.out.println("This is a calculator to test three alchemical reactions at the same time.");
		
		System.out.print("Enter your first reaction base essence: ");
		num1 = scanner.nextDouble();
		System.out.print("Enter your first reaction operator: ");
		operator1 = scanner.next().charAt(0);
		System.out.print("Enter your first reaction catalysts charge:  ");
		num2 = scanner.nextDouble();
		
		System.out.print("\nEnter your second reaction base essence: ");
		num3 = scanner.nextDouble();
		System.out.print("Enter your second reaction operator: ");
		operator2 = scanner.next().charAt(0);
		System.out.print("Enter your second reaction catalysts charge:  ");
		num4 = scanner.nextDouble();
		
		System.out.print("\nEnter your third reaction base essence: ");
		num5 = scanner.nextDouble();
		System.out.print("Enter your third reaction operator: ");
		operator3 = scanner.next().charAt(0);
		System.out.print("Enter your third reaction catalysts charge:  ");
		num6 = scanner.nextDouble();
		
		switch(operator1) {
			case '+':
				result1 = num1 + num2;
			break;
			case '-':
				result1 = num1 - num2;
			break;
			case '*':
				result1 = num1 * num2;
			break;
			case '/':
				if(num2 == 0) {
					System.out.println("Not enough catalysts!");
					valid = false;
				}
				else {
					result1 = num1 / num2;
				}
			break;
			case '^':
				result1 = Math.pow(num1, num2);
			break;
			case '%':
				result1 = num1 % num2;
			break;
			default:
				System.out.println("Invalid operator.");
				valid = false;
		}
		
		switch(operator2) {
			case '+':
				result2 = num3 + num4;
			break;
			case '-':
				result2 = num3 - num4;
			break;
			case '*':
				result2 = num3 * num4;
			break;
			case '/':
				if(num4 == 0) {
					System.out.println("Not enough catalysts!");
					valid = false;
				}
				else {
					result2 = num3 / num4;
				}
			break;
			case '^':
				result2 = Math.pow(num3, num4);
			break;
			case '%':
				result2 = num3 % num4;
			break;
			default:
				System.out.println("Invalid operator.");
				valid = false;
		}
		
		switch(operator3) {
			case '+':
				result3 = num5 + num6;
			break;
			case '-':
				result3 = num5 - num6;
			break;
			case '*':
				result3 = num5 * num6;
			break;
			case '/':
				if(num6 == 0) {
					System.out.println("Not enough catalysts!");
					valid = false;
				}
				else {
					result3 = num5 / num6;
				}
			break;
			case '^':
				result3 = Math.pow(num5, num6);
			break;
			case '%':
				result3 = num5 % num6;
			break;
			default:
				System.out.println("Invalid operator.");
				valid = false;
		}
		
		if(valid) {
			System.out.printf("\nReaction 1: %.2f mana", result1);
			System.out.printf("\nReaction 2: %.2f mana", result2);
			System.out.printf("\nReaction 3: %.2f mana", result3);
		}
		
		scanner.close();
	}
}