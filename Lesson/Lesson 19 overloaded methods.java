public class Main {
	public static void main(String[] args) {
		
		// Overloaded methods = method that share the same name but different parameters
		// signature = name + parameters
		
		String pizza = bakePizza("Thick crust", "mozzarella", "mushroom");
		
		System.out.println(pizza);
	}
	
	static String bakePizza(String bread) {
		return bread + " pizza";
	}
	static String bakePizza(String bread, String cheese) {
		return bread + " " + cheese + " pizza";
	}
	static String bakePizza(String bread, String cheese, String topping) {
		return bread + " " + cheese + " " + topping + " pizza";
	}
}