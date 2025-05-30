public class Animal {
	
	String type;
	String name;
	int age;
	boolean isCarnivore;
	
	void displayInfo() {
		System.out.println("Type: " + type);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Diet: " + (isCarnivore ? "Carnivore" : "Herbivore"));
	}
}