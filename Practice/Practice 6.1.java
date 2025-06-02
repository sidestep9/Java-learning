import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String name;
		String colon;
		int lvl;
		int gold;
		double hp;
		double mp;
		char g;
		
		colon = ":";
		g = 'G';
		
		System.out.println("Hello, adventurer! This is an Adventurer Report generator. Please fill in your information.\n");
		System.out.print("Enter your name: ");
		name = scanner.nextLine();
		System.out.print("Enter your level: ");
		lvl = scanner.nextInt();
		System.out.print("Enter your hp: ");
		hp = scanner.nextDouble();
		System.out.print("Enter your mp: ");
		mp = scanner.nextDouble();
		System.out.print("Enter how much gold you have: ");
		gold  = scanner.nextInt();
		
		System.out.println("");
		
		System.out.printf("=== Adventurer Report ===\n");
		System.out.printf("Name %3s %s\n", colon, name);
		System.out.printf("Level %2s %d\n", colon, lvl);
		System.out.printf("HP %5s %.2f\n", colon, hp);
		System.out.printf("MP %5s %.2f\n", colon, mp);
		System.out.printf("Gold %3s %d%c\n", colon, gold, g);
		System.out.printf("========================\n");
		
		scanner.close();
		
		//Is there a way to do it with other method? I think having colon string is kinda verbose/dumb
		//also adding so many == is annoying
	}
}