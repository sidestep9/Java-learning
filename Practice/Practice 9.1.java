import java.util.Scanner;

public class Main  {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String phrase;
		String first;
		String second;
		String third;
		String input;
		
		phrase = "chicken-123-pox";
		
		System.out.print("Enter the secret phrase (prefix-id-suffix): ");
		input = scanner.nextLine();
		
		
		first = phrase.substring(0, phrase.indexOf("-"));
		second = phrase.substring(phrase.indexOf("-") + 1, phrase.lastIndexOf("-"));
		third = phrase.substring(phrase.lastIndexOf("-") +1);
		
		if(input.contains("-")) {
			if(input.equals(phrase)) {
				System.out.println("Secret Phrase found:");
				System.out.println("Prefix: " + first);
				System.out.println("ID: " + second);
				System.out.println("Suffix: " + third);
			}
			else{
				System.out.println("Incorrect phrase.");
			}
		}
		else {
			System.out.println("Secret phrase must contains two dash (-)");
		}
			
		
		scanner.close();
		
		//input == phrase won't work because == is used for mostly numbers and primitive type. Use .equals for Strings instead.
		//The analogy is like me and a friend write a box that has the exact same word but in different books
		//== says "Are you holding the exact same books?"
		//.equals says "Do our books says the same thing?"
	}
}