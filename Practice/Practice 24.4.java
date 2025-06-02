import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String word = "";
		String revWord = "";
		char rw;
		boolean palindrome = false;
		
		System.out.print("Enter a word: ");
		word = sc.nextLine().trim();
		for(int i = 0; i < word.length(); i++) {
			rw = word.charAt(word.length() - i - 1);
			revWord += rw;
		}
		palindrome = word.equalsIgnoreCase(revWord);
		
		System.out.println("\nYour word: " + word);
		System.out.println("Reversed word: " + revWord);
		System.out.println("Palindrome: " + palindrome);
	}
}