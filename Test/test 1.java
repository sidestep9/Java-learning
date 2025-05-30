import java.util.Scanner;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		//variables
		String playerName;
		String title;
		String titleInput;
		String wepName;
		String wepType;
		String wepGrade;
		String gateName;
		String gateInput;
		double baseAttack;
		double attack;
		double critRate;
		double critDamage;
		double damage;
		double enemyDamage;
		double rqm;
		double rcm;
		double rcm2;
		double enemyPower;
		boolean winYes;
		boolean trialDone;
		
		gateName = "skye";
		
		//part 1
		System.out.println("As you walk up, you find yourself inside a massive circular room. At the opposite of where you came is a massive ancient gate. On the right side of you is a contraption you never see before, and on the opposite is what seemed to be a golem.\n");
		System.out.println("\"Welcome, challenger, to the Trial of Echoflame.\" Boom a loud voice, echoing throughout the room.\n");
		System.out.println("\"If thou seeek to undertake the trial, present thyself and thine truths. Thy name and thine purposes.\"\n");
		System.out.println("A pillat rose up from the ground in front of you. You inspect it, it seems to be some sort of contraption where you are supposed to enter your information.\n");
		System.out.print("Enter your name: ");
		playerName = scanner.nextLine();
		playerName = playerName.trim();
		System.out.print("Choose your title [1. Champion] [2. Wizard]: ");
		titleInput = scanner.nextLine();
		if (titleInput.toLowerCase().equals("1") || titleInput.toLowerCase().equals("champion")) {
			title = "Champion";
			System.out.println("\n" + title + " " + playerName);
		}
		else if (titleInput.toLowerCase().equals("2") || titleInput.toLowerCase().equals("wizard")) {
			title = "Wizard";
			System.out.println("\n" +
			title + " " + playerName);
		}
		else {
			title = "";
			System.out.println("\nYou may only choose from one of the options");
		}
		
		System.out.println("");
		System.out.println("");
		
		//part 2
		System.out.println("\"" + title + " " + playerName + ", thy first task is to forge a weapon of thine own for the trial. Head to the forging station on thine right side.\"\n");
		System.out.println("You head to the forging station. In front of you is a similar pillar as the first one, but this one is asking about the details of the weapon you want to forge. You only need to fill it, the rest of the process is automatic it seems.\n");
		System.out.println("Select the weapon type: ");
		System.out.println("[1.Dagger] [2.Shortsword] [3.Longsword] [4.Greatsword] [5.Rapier] [6.Axe (1h)] [7.Great Axe] [8.Rapier] [9.Mace] [10.Warhammer] [11.Spear] [12.Halberd] [13.Bow] [14.Crossbow] [15.Gloves]");
		wepType = scanner.nextLine();
		wepType = wepType.toLowerCase();
		rqm = random.nextDouble() * 1 + 1;
		System.out.println("");
		
		if(wepType.equals("1") || wepType.equals("dagger")) {
			wepType = "Dagger";
			baseAttack = 4 + random.nextDouble() * 2;
			attack = Math.pow(baseAttack * rqm, 1.3);
			critRate = 10;
			critDamage = 2;
			System.out.println("You have choosen " + wepType);
		}
		else if(wepType.equals("2") || wepType.equals("shortsword")) {
			wepType = "Shortsword";
			baseAttack = 6 + random.nextDouble() * 2;
			attack = Math.pow(baseAttack * rqm, 1.3);
			critRate = 5;
			critDamage = 1.8;
			System.out.println("You have choosen " + wepType);
		}
		else if(wepType.equals("3") || wepType.equals("longsword")) {
			wepType = "Longsword";
			baseAttack = 8 + random.nextDouble() * 4;
			attack = Math.pow(baseAttack * rqm, 1.3);
			critRate = 5;
			critDamage = 2;
			System.out.println("You have choosen " + wepType);
		}
		else if(wepType.equals("4") || wepType.equals("greatsword")) {
			wepType = "Greatsword";
			baseAttack = 12 + random.nextDouble() * 6;
			attack = Math.pow(baseAttack * rqm, 1.3);
			critRate = 3;
			critDamage = 2.5;
			System.out.println("You have choosen " + wepType);
		}
		else if(wepType.equals("5") || wepType.equals("rapier")) {
			wepType = "Rapier";
			baseAttack = 6 + random.nextDouble() * 3;
			attack = Math.pow(baseAttack * rqm, 1.3);
			critRate = 15;
			critDamage = 1.7;
			System.out.println("You have choosen " + wepType);
		}
		else if(wepType.equals("6") || wepType.equals("axe")) {
			wepType = "Axe";
			baseAttack = 7 + random.nextDouble() * 3;
			attack = Math.pow(baseAttack * rqm, 1.3);
			critRate = 2;
			critDamage = 2.2;
			System.out.println("You have choosen " + wepType);
		}
		else if(wepType.equals("7") || wepType.equals("greataxe")) {
			wepType = "Greataxe";
			baseAttack = 14 + random.nextDouble() * 6;
			attack = Math.pow(baseAttack * rqm, 1.3);
			critRate = 1;
			critDamage = 2.7;
			System.out.println("You have choosen " + wepType);
		}
		else if(wepType.equals("8") || wepType.equals("mace")) {
			wepType = "Mace";
			baseAttack = 8 + random.nextDouble() * 2;
			attack = Math.pow(baseAttack * rqm, 1.3);
			critRate = 4;
			critDamage = 2.1;
			System.out.println("You have choosen " + wepType);
		}
		else if(wepType.equals("9") || wepType.equals("warhammer")) {
			wepType = "Warhammer";
			baseAttack = 10 + random.nextDouble() * 4;
			attack = Math.pow(baseAttack * rqm, 1.3);
			critRate = 2;
			critDamage = 2.6;
			System.out.println("You have choosen " + wepType);
		}
		else if(wepType.equals("10") || wepType.equals("spear")) {
			wepType = "Spear";
			baseAttack = 6 + random.nextDouble() * 4;
			attack = Math.pow(baseAttack * rqm, 1.3);
			critRate = 6;
			critDamage = 1.9;
			System.out.println("You have choosen " + wepType);
		}
		else if(wepType.equals("11") || wepType.equals("halberd")) {
			wepType = "Halberd";
			baseAttack = 10 + random.nextDouble() * 6;
			attack = Math.pow(baseAttack * rqm, 1.3);
			critRate = 5;
			critDamage = 2.2;
			System.out.println("You have choosen " + wepType);
		}
		else if(wepType.equals("12") || wepType.equals("bow")) {
			wepType = "Bow";
			baseAttack = 6 + random.nextDouble() * 6;
			attack = Math.pow(baseAttack * rqm, 1.3);
			critRate = 7;
			critDamage = 1.8;
			System.out.println("You have choosen " + wepType);
		}
		else if(wepType.equals("13") || wepType.equals("crossbow")) {
			wepType = "Crossbow";
			baseAttack = 8 + random.nextDouble() * 6;
			attack = Math.pow(baseAttack * rqm, 1.3);
			critRate = 5;
			critDamage = 2;
			System.out.println("You have choosen " + wepType);
		}
		else if(wepType.equals("14") || wepType.equals("staff")) {
			wepType = "Staff";
			baseAttack = 4 + random.nextDouble() * 4;
			attack = Math.pow(baseAttack * rqm, 1.3);
			critRate = 5;
			critDamage = 1.5;
			System.out.println("You have choosen " + wepType);
		}
		else if(wepType.equals("15") || wepType.equals("gloves")) {
			wepType = "Gloves";
			baseAttack = 2 + random.nextDouble() * 3;
			attack = Math.pow(baseAttack * rqm, 1.3);
			critRate = 3;
			critDamage = 1.5;
			System.out.println("You have choosen " + wepType);
		}
		else {
			wepType = "";
			attack = 0;
			System.out.println("You may only choose from among the list");
		}
		
		System.out.println("");
		
		System.out.println("Forging weapon.");
		System.out.println(".");
		System.out.println(".");
		System.out.println(".");
		System.out.println("Forging finished!\n");
		
		if(rqm < 1.4) {
			wepGrade = "Common";
			System.out.println("You have forged [" + wepGrade + " " + wepType + "]!");
			System.out.printf("Attack: %.2f\n", attack);
			System.out.printf("Quality: %.2f\n", rqm);
		}
		else if(rqm < 1.7) {
			wepGrade = "Rare";
			System.out.println("You have forged [" + wepGrade + " " + wepType + "]!");
			System.out.printf("Attack: %.2f\n", attack);
			System.out.printf("Quality: %.2f\n", rqm);
		}
		else if(rqm < 1.9) {
			wepGrade = "Epic";
			System.out.println("You have forged [" + wepGrade + " " + wepType + "]!");
			System.out.printf("Attack: %.2f\n", attack);
			System.out.printf("Quality: %.2f\n", rqm);
		}
		else {
			wepGrade = "Legendary";
			System.out.println("You have forged [" + wepGrade + " " + wepType + "]!");
			System.out.printf("Attack: %.2f\n", attack);
			System.out.printf("Quality: %.2f\n", rqm);
		}
		
		System.out.println("\nYou head to closer to the forge and grab your freshly made weapon.\n");
		
		System.out.println("\"Thou has forged thine arms. Now it's time to test it. Head into the middle of the arena for thy next trial\"\n");
		System.out.println("You do as instructed, at the same time, the golem opposite of you also move towards the same direction.\n");
		System.out.println("\"Thy must defeat this golem if thy wish to proceed.\"\n");
		System.out.println("FIGHT!");
		System.out.println(".");
		System.out.println(".");
		System.out.println(".");
		
		rcm = 1 + random.nextDouble() * 9;
		rcm2 = random.nextDouble() * 9 + 1;
		enemyPower = random.nextDouble() * 10 + 5;
		damage = Math.pow(attack, 1.2) * rqm;
		enemyDamage = Math.pow(enemyPower, 1.2) * rcm2;
		
		System.out.printf("\nPlayer's chaos modifier: %.2f\n", rcm);
		System.out.printf("Enemy's power: %.2f\n", enemyPower);
		System.out.printf("Enemy's chaos modifier: %.2f\n", rcm2);
		System.out.printf("\n[%s %s] hits [Golem] with %.2f!\n", title, playerName, damage);
		System.out.printf("[Golem] hits [%s %s] with %.2f!\n", title, playerName, enemyDamage);
		
		if(damage > enemyDamage) {
			winYes = true;
			System.out.println("\nYOU WIN!");
			System.out.println("The Golem crumbles before you.");
		}
		else if(damage == enemyDamage) {
			winYes = false;
			System.out.println("\nIT'S A DRAW!");
			System.out.println("Although you hit the golem pretty bad, you were unable to take it down.");
		}
		else {
			winYes = false;
			System.out.println("\nYOU LOSE");
			System.out.println("The Golem hits you pretty bad, while looking barely wounded itself.");
		}
		
		if(winYes) {
			System.out.println("\n\"Congratulations, " + title + "! Thou may now proceed to the next trial. Please head towards the Gate of Names.\"");
		}
		else {
			System.out.println("\n\"Unfortunately thou hast failed, " + title + ". Perhaps thou shall fare better at the next opportunity.\"");
		}
		
		System.out.println("\nYou make your way to the giant door.\n");
		System.out.println("\nThe door hums in arcane power.");//I don't like this sentence, so weird, but idk how to phrase it better.
		System.out.println("\n\"Thine next trial shall be to say the Gate's true Name. Thy have as many chances as thy like.\"");
		System.out.print("\nEnter the gate's name: ");
		gateInput = scanner.nextLine();
		gateInput = gateInput.trim();
		gateInput = gateInput.toLowerCase();
		
		System.out.println("");
		
		if (gateInput.toLowerCase().equals(gateName)) {
			trialDone = true;
			gateName = gateName.replace("s", "S");
			System.out.println("\nThe gate make a loud noise before opening outwards.");
			System.out.println("\n" + title + ", thou have answered correctly. The Gate of " + gateName + ". Thou hast passed the Trial of Echoflame. Thou may proceed.");
		}
		else if(gateInput.equals("s")) {
			trialDone = false;
			System.out.println("\n\"Hmm... A bold start.\"");
		}
		else if(gateInput.equals("sky")) {
			trialDone = false;
			System.out.println("\n\"Thou art near.\"");
		}
		else if(gateInput.equals("")) {
			trialDone = false;
			System.out.println("\n\"Silence is not the answer.\"");
		}
		else {
			trialDone = false;
			System.out.println("\n\"Try again.\"");
		}
		
		if(trialDone) {
			System.out.println("\n\nYou step on towards the Gate. A new adventure awaits.");
		}
		
		scanner.close();
		//there's no return in case the player's name is blank, the program will still proceed.
		//the weapon type have the same problem as above
		//winYes check also the same
		//the nextDouble never exactly get the highest number (e.g 4-5.99 (never 4-6), 1-1.99 (never 1-2). I don't know how to include the highest number. Seems like a bunch of maths
		//the weapons are unbalances because I don't consider the speed factor. For instance, gloves might have low crit rate and damage but it hits fast. Idk how to implement speed yet
		//I'm skipping the elements for the weapon, I thought it's kinda redundant since i've not yet implemented resistance and such, tho I could say the same for the weapon.
		//writing story isn't my forte.
		//done. My largest coding so far.
	}
}