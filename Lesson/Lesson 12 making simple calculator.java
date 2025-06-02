import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		// DECLARATION
		double num1;
		double num2;
		char operator;
		double result = 0;
		boolean operatorValid = true;
		
		System.out.print("Enter your first number: ");
		num1 = scanner.nextDouble();
		
		System.out.print("Enter the operator (+, -, *, /, ^): ");
		operator = scanner.next().charAt(0);
		
		System.out.print("Enter your second number: ");
		num2 = scanner.nextDouble();
		
		switch(operator) {
			case '+':
				result = num1 + num2;
			break;
			case '-':
				result = num1 - num2;
			break;
			case '*':
				result = num1 * num2;
			break;
			case '/':
				if(num2 != 0) {
					result = num1 / num2;
				}
				else {
					System.out.println("\nCan't divide by 0!");
					operatorValid = false;
				}
			break;
			case '^':
				result = Math.pow(num1, num2);
			break;
			default:
				System.out.println("\nOperator invalid!");
				operatorValid = false;
		}
		
		if(operatorValid) {
			System.out.printf("\nResult: %.2f", result);
		}
		
		scanner.close();
	}
}