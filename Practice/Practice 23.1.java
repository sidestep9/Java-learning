import java.util.Random;

public class Main {
	static Random random = new Random();
	
	public static void main(String[] args) {
		String[] names = {"Goblin", "Wraith", "Dragon", "Kobold", "Werewolf"};
		int[] hits = new int[random.nextInt(10) +1];
		
		for(int i = 0; i < hits.length; i++) {
			hits[i] = random.nextInt(99) + 1;
		}
		
		battle(names, hits);
	}
	static void battle(String[] names, int... hits) {
		String name;
		int num = 0;
		int total = 0;
		
		name = names[random.nextInt(names.length)];
		
		System.out.println("Attacker: " + name);
		
		for(int hit : hits) {
			total += hit;
			num++;
			System.out.printf("Hit %d: %d\n", num, hit);
		}
		
		System.out.println("Total damage: " + total);
		System.out.printf("Average damage: %.2f\n", (double) total / hits.length);
	}
}