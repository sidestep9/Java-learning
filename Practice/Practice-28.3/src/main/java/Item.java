public class Item {
	String name;
	double price;
	int qty;
	double total;
	
	Item(String name, double price, int qty) {
		this.name = name;
		this.price = price;
		this.qty = qty;
		total = totalPrice();
	}
	
	double totalPrice() {
		return price * qty;
	}
	
}