public class Main {
	public static void main(String[] args) {
		
		// TERNARY OPERATOR
		
		// variable = (condition) ? ifTrue : ifFalse;
		
		int score = 75;
		int number = 4;
		int hours = 14;
		int income = 120000;
		
		String passOrFail = (score > 50) ? "PASS" : "FAIL";
		String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";
		String timeOfDay = (hours < 12) ? "A.M." : "P.M.";
		double taxRate = (income >= 60000) ? 0.25 : 0.15;
		
		System.out.println(passOrFail);
		System.out.println(evenOrOdd);
		System.out.println(timeOfDay);
		System.out.println(taxRate);
		
	}
}