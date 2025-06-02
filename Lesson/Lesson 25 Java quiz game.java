import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] questions = {"What color of flame is the hottest?", "What is a female sheep called?", "What is a pencil lead made of?", "What is the fourth planet from the sun?", "What is the largest desert in the world?"};
		
		String[][] options = {{"A. Green", "B. Red", "C. Blue", "D. Yellow"}, {"A. Ewe", "B. Lamb", "C. Calf", "D. Kitten"}, {"A. Nickel", "B. Graphite", "C. Lead", "D. Charcoal"}, {"A. Earth", "B. Venus", "C. Mars", "D. Saturn"}, {"A. Sahara", "B. Arabian", "C. Gobi", "D. Antartica"}};
		
		char[] answers = {'C', 'A', 'B', 'C', 'D'};
		char guess;
		int score = 0;
		String border = "*******************";
		
		System.out.println(border);
		System.out.println("Welcome to the Quiz");
		System.out.println(border);
		for(int i = 0; i < questions.length; i++) {
			System.out.println("Question " + (1 + i));
			System.out.println(questions[i]);
			for(String option : options[i]) {
				System.out.println(option);
			}
			guess = sc.next().charAt(0);
			if(Character.toUpperCase(guess) == answers[i]) {
				score++;
			}
		}
		
		System.out.println(border);
		System.out.printf("Your score is: %d out of %d questions", score, questions.length);
		
		sc.close();
	}
}