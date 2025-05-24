import java.util.Scanner;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int numOfDie;
		int total = 0;
		int roll;
		
		System.out.print("Enter the number of die: ");
		numOfDie = scanner.nextInt();
		
		if(numOfDie > 0) {
			for(int i = 1; i <= numOfDie; i++) {
				roll = random.nextInt(6) + 1;
				printDie(roll);
				System.out.println("You rolled: " + roll);
				total += roll;
			}
			System.out.println("Your total roll: " + total);
		}
		else {
			System.out.println("INVALID AMOUNT");
		}

		// ascii art
		
		scanner.close();
	}
	
	static void printDie(int roll) {
	
		/*String dice1 = """
		 -------
		|        |
		|    •   |
		|        |
		 -------
		 """; only works for Java 15+ :(*/
		 
		 String dice1 = 
		 " -------\n" +
		 "|       |\n" +
		 "|   •   |\n" +
		 "|       |\n" +
		 " -------\n";
		 String dice2 = 
		 " -------\n" +
		 "|•      |\n" +
		 "|       |\n" +
		 "|      •|\n" +
		 " -------\n";
		 String dice3 = 
		 " -------\n" +
		 "|•      |\n" +
		 "|   •   |\n" +
		 "|      •|\n" +
		 " -------\n";
		 String dice4 = 
		 " -------\n" +
		 "|•     •|\n" +
		 "|       |\n" +
		 "|•     •|\n" +
		 " -------\n";
		 String dice5 = 
		 " -------\n" +
		 "|•     •|\n" +
		 "|   •   |\n" +
		 "|•     •|\n" +
		 " -------\n";
		 String dice6 = 
		 " -------\n" +
		 "|•     •|\n" +
		 "|•     •|\n" +
		 "|•     •|\n" +
		 " -------\n";
		 
		 switch(roll) {
		 	case 1:
		 	 System.out.println(dice1);
		 	break;
		 	case 2:
		 	 System.out.println(dice2);
		 	break;
		 	case 3:
		 	 System.out.println(dice3);
		 	break;
		 	case 4:
		 	 System.out.println(dice4);
		 	break;
		 	case 5:
		 	 System.out.println(dice5);
		 	break;
		 	case 6:
		 	 System.out.println(dice6);
		 	break;
		 	default:
		 		System.out.println("INVALID ROLL");
		 }
	}
}