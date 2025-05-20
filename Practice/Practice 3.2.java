import java.util.Scanner;

public class Main {

	public static void main (String[] args) {

		Scanner scanner = new Scanner(System.in);

		//resources
		int playerGold = 300;

		String itemName = "Arrow";
		int itemPrice = 10;
		int itemStock = 50;

		String itemName2 = "Torch";
		int itemPrice2 = 25;
		int itemStock2 = 10;

		char currency = 'G';
	    
		//end resources

		//out
		System.out.println("\"Well, well, well, if it isn't the rookie.\"");
		System.out.print("Though the shopkeeper may call you a rookie, you have an actual name. It's ");
		String name = scanner.nextLine();
		System.out.println(name + ", a pretty common name where you're from.");
		System.out.println("\n\"Well, whaddya need?\"");
		System.out.println("[Some arrows and torches.]");
		System.out.println("\"An arrow is " + itemPrice + currency + " and a torch is " + itemPrice2 + currency + ". How many do ya need?\"");
		
		System.out.println(itemName + " Stock: " + itemStock);
		System.out.print("How many do you buy? ");
		int itemBuy = scanner.nextInt();
		
		System.out.println(itemName2 + " Stock: " + itemStock2);
		System.out.print("How many do you buy? ");
		int itemBuy2 = scanner.nextInt();

		int itemCost = itemPrice * itemBuy;
		int itemCost2 = itemPrice2 * itemBuy2;
		
		if (playerGold >= itemCost + itemCost2 && itemStock >= itemBuy && itemStock2 >= itemBuy2) {
		    System.out.println("\n\"So, " + name + ", right? " + itemBuy + " " + itemName + (itemBuy == 1 ? "" : "s") + " and " + itemBuy2 + " " +  itemName2 + (itemBuy2 == 1 ? "" : "es") + " would be " + (itemCost + itemCost2) + currency + "\"");
		    System.out.println("Purchase successful.");
		    playerGold -= itemCost + itemCost2;
		    itemStock -= itemBuy;
		    itemStock2 -= itemBuy2;
		    System.out.println("Gold remaining: " + playerGold + currency + ".");
		}
		else if (playerGold < itemCost + itemCost2) {
		    System.out.println("\"You don't got enough money, kid.\"");
		}
		else if (playerGold >= itemCost + itemCost2 && itemStock < itemBuy || itemStock2 < itemBuy2) {
		    System.out.println("\"Sorry, I don't got that many of those.\"");
		}
		
		if (itemBuy == 0 && itemBuy2 == 0) {
		    System.out.println("\n\"Bah, don't waste my time, then.\"");
		}
		else {
		    System.out.println("\n\"Good doin' business with ya!\"");
		}

		scanner.close();
	}

}