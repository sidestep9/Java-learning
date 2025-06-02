public class Customer {
	String name;
	double balance;
	double total;
	
	Customer(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}
	
	double addToCart(double item1, double item2, double item3) {
		this.total = item1 + item2 + item3;
		
		return total;
	}
	
	void checkout() {
		double finalPrice = total * 1.05;
		
		if(balance >= finalPrice) {
			System.out.printf("%s bought 3 items with total costs of %.2f$. Her remaining balance is %.2f$", name, finalPrice, balance - finalPrice);
		}		
		else {
			System.out.printf("%s didn't have enough money to buy the items\n", name);
		}
	}
}