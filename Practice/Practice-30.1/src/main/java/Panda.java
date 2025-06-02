public class Panda extends Animal{
	
	Panda(String type, String name, int age) {
		this.name = name;
		this.type = type;
		this.age = age;
		isCarnivore = false;
	}
	
	void sound() { 
		System.out.println(name + " the panda yelp(?)");
	}
}