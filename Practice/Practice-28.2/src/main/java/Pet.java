public class Pet {
	String name;
	String species;
	int age;
	
	Pet(String name, String species, int age) {
		this.name = name;
		this.species = species;
		this.age = age;
	}
	
	void displayInfo(){
		System.out.println("*********");
		System.out.println("Name   : " + name);
		System.out.println("Species: " + species);
		System.out.println("Age    : " + age + " years old");
		System.out.println("*********");
	}
}