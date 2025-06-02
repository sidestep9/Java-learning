public class Main {
	public static void main(String[] args) {
		
		Item item1 = new Item("apple", 0.72, 7);
		Item item2 = new Item("Pineapple", 1.22, 3);
		Item item3 = new Item("Sausage", 0.27, 12);
		
		Customer customer1 = new Customer("Alice", 15);
		
		customer1.addToCart(item1.total, item2.total, item3.total);
		
		customer1.checkout();
	}
}