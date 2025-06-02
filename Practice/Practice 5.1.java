import java.util.Scanner;
import java.util.Random;

public class Main {
	public static void main (String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	Random random = new Random();
	
	String name;
	String spellName;
	String rank;
	String force;
	String surge;
	double magicPower;
	int chaosMultiplier;
	double damage;
	boolean surgeYes;
	boolean forceYes;
	
	chaosMultiplier = random.nextInt(10) + 1;
	
	System.out.println("Hello, adventurer. Welcome to the Arcane Arena. Here you will test your magic spell. But before that, please enter your information.");
	System.out.print("\nEnter your name: ");
	name = scanner.nextLine();
	System.out.print("Enter your spell: ");
	spellName = scanner.nextLine();
	System.out.print("Enter your magic power level: ");
	magicPower = scanner.nextDouble();
	if(magicPower > 10) {
		rank = "Archmage";
	}
	else if(magicPower >= 8 && magicPower < 10) {
		rank = "Expert";
	}
	else if(magicPower >= 5 && magicPower < 8) {
		rank = "Adept";
	}
	else {
		rank = "Novice";
	}
	
	System.out.println("\nYou are " + name + ", the spell you will be testing is " + spellName + ", your power level is " + rank + ".");
	
	System.out.println("\nTesting commence");
	System.out.println(".");
	System.out.println(".");
	System.out.println(".");
	
	damage = Math.pow(magicPower, 1.2) * chaosMultiplier;
	surgeYes = chaosMultiplier == 10;
	forceYes = damage >= 100;
	if(surgeYes) {
		surge = "A surge of arcane chaos! Maximum potential!";
		System.out.println("\n" + surge);
	}
	else {
		surge = "The arcane gathers around you.";
		System.out.println("\n" + surge);
	}
	
	
	System.out.println("\n" + name + " casts " + spellName);
	System.out.println("Chaos multiplier: " + chaosMultiplier);
	System.out.printf("Final damage: %.2f \n", damage);	
	
	if(forceYes) {
		force = "The spell explodes with devastating force!";
		System.out.println("\n" + force);
	}
	else {
		force = "A solid strike.";
		System.out.println("\n" + force);
	}
	
	
	
	scanner.close();
	
	/*
	Verbose, still.
	Think of how to shorten/sharpen all of these codes.
	*/
	}
}