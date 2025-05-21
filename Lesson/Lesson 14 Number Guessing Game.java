import java.util.Scanner;
import java.util.Random;

public class Main{
	public static void main(String[] args){
		
		// NUMBER GUESSING GAME
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int guess;
		int attempts = 0;
		int min = 1;
		int max= 100;
		int randomNumber = random.nextInt(max) + min;
		
		System.out.println("Number guessing game.");
		System.out.printf("Guess the number between %d-%d.\n", min, max);
		
		
		do{
			System.out.print("Guess the number: ");
			guess = scanner.nextInt();
			attempts++;
			
			if(guess < randomNumber){
				System.out.println("TOO LOW!");
			}
			else if(guess > randomNumber){
				System.out.println("TOO HIGH!");
			}
			else{
				System.out.println("You have guessed correctly!");
				System.out.println("Number of attempts: " + attempts);
			}
			
		}while(guess != randomNumber);
		
		scanner.close();
	}
}