import java.util.ArrayList;

public class Inventory {
	ArrayList<Item> items = new ArrayList<>();
	
	Item findItem(String name) {
		for(Item item : items) {
			if(item.name.equals(name)) return item;
		}
		return null;
	}
	
	void addItem(Item item) {
		items.add(item);
	}
	
	void removeItem(String name) {
		Item item = findItem(name);
		if(item != null) {
			items.remove(item);
			System.out.println("ITEM REMOVED");
			return;
		}
	}
	
	void updatePrice(String name, double price) {
		Item item = findItem(name);
		if(item != null) {
			item.price = price;
			System.out.println("PRICE UPDATED");
		}
	}
	
	void updateStock(String name, int stock) {
		Item item = findItem(name);
		if(item != null) {
			item.quantity = stock;
			System.out.println("QUANTITY UPDATED");
		}
	}
}