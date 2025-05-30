import java.util.Random;

public class Main {
	public static void main (String[] args) {
		
		Random random = new Random();
		
		int number;
		boolean coin;
		
		number = random.nextInt(6) + 1;//min max random.nextInt (min, max); only works for Java 17+.
		coin = random.nextBoolean();
		
		System.out.println(number);
		
		if (coin) {
			System.out.println("HEAD");
		}
		else {
			System.out.println("TAIL");
		}
		
	}
}