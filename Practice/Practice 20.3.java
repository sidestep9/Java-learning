import java.util.Scanner;

public class Main {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		String input;
		int vowelCount;
		
		System.out.print("Enter the sentence: ");
		input = scanner.nextLine().trim();
		vowelCount = countVowel(input);
		
		System.out.println("Sentence: " + input);
		System.out.println("Vowel count: " + vowelCount);
		
		
		scanner.close();
	}
	
	static int countVowel(String input) {
		int count = 0;
		input = input.toLowerCase();
		char counter;
		
		if(input.contains("a")  || input.contains("e") || input.contains("i") || input.contains("o") || input.contains("u")) {
			for(int i = 1; i <= input.length(); i++) {
				counter = input.charAt(i - 1);
				if(counter == 'a' || counter == 'e' || counter == 'i' || counter == 'o' || counter == 'u') {
					count++;
				}
			}
		}
		
		return count;
	}
}