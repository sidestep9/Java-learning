public class Main {
	public static void main(String[] args) {
		
		// inheritance = one class inherits the attribute and methods from another class. Child <- Parent <- Granparent <- and so and so
		
		Animal animal = new Animal();
		Plant plant = new Plant();
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		
		System.out.println(animal.isAlive);
		System.out.println(plant.isAlive);
		cat.eat();
		dog.eat();
		cat.speak();
		dog.speak();
	}
}