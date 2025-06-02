import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        
        
      Scanner scanner = new Scanner(System.in);
      
     //resources      
     int playerGold = 500;
     String itemName = "Health Potion";
     int itemPrice = 50;
     int itemStock = 5;
     String itemName2 = "Mana Potion";
     int itemPrice2 = 75;
     int itemStock2 = 5;
     char currency = 'G';
      
      
      //interaction
      System.out.println("\"Welcome adventurer! May I have the honor of knowing your name?\"");
      System.out.print("Type your name: ");
      String name = scanner.nextLine();
      System.out.println("\"Well met, " + name + ". What bussiness do you have in my humble store?\"");
      System.out.println("[I need some potions.]");
      System.out.println("\"Splendid! a " + itemName + " is " + itemPrice + currency + " and a " + itemName2 + " is " + itemPrice2 + currency + ".\"");
      System.out.println("\"How many do you need?\"");
      
      System.out.print("Health potion: ");
      int itemBuy = scanner.nextInt();
      System.out.print("Mana potion: ");
      int itemBuy2 = scanner.nextInt();
      
      int itemCost = itemPrice * itemBuy;
      int itemCost2 = itemPrice2 * itemBuy2;
      
      if (playerGold >= itemCost + itemCost2 && itemStock > itemBuy && itemStock2 > itemBuy2) {
          System.out.println("\"" + itemBuy + " " + itemName + " and " + itemBuy2 + " " + itemName2 + " would be " + (itemCost + itemCost2) + currency + ".\"");
          
          playerGold -= (itemCost + itemCost2);
          itemStock -= itemBuy;
          itemStock2 -= itemBuy2;
      }
      else if (playerGold < itemCost || playerGold < itemCost2) {
          System.out.println("\"My apologies, dear customer. But it seems that you do not have enough money.\"");
      }
      else if (itemStock <= 0 || itemStock2 <= 0 && itemStock + itemStock2 <= 8) {
          System.out.println("\"My apologies, dear customer. it appears that we are out of stock.\"");
      }
      
      if (itemBuy + itemBuy2 >= 2) {
          System.out.println("\"\nYou're well prepared.\"");
      }
      else {
          System.out.println("\"\nThank you for your patronage.\"");
      }
      
      System.out.println("\nYou have " + playerGold + currency + " left in your pocket.");
      
      scanner.close();  
        
        
    }
}