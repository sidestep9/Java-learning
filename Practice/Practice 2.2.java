public class Main {
    public static void main (String[] args) {
        //player
        int playerGold = 2000;
        
        //items
        String itemName = "Health Potion";
        int itemPrice = 300;
        int itemStock = 4;
        
        String itemName2 = "Mana Potion";
        int itemPrice2 = 1000;
        int itemStock2 = 2;
        
        String itemName3 = "Ring of Vigor";
        int itemPrice3 = 3000;
        int itemStock3 = 1;
        
        //checks
        boolean itemBuy = playerGold >= itemPrice && itemStock > 0;
        
        //others
        char currency = 'G';
        
        //output
        System.out.println("Money: " + playerGold + currency);
        System.out.println("\n" + itemName + "\n" + "Price: " + itemPrice + currency + "\n" + "Stock: " + itemStock);
        System.out.println("\n" + itemName2 + "\n" + "Price: " + itemPrice2 + currency + "\n" + "Stock: " + itemStock2);
        System.out.println("\n" + itemName3 + "\n" + "Price: " + itemPrice3 + currency + "\n" + "Stock: " + itemStock3);
        
        System.out.println("\n----------------------");
        
         if (itemBuy) {
        System.out.println("\n Purchase successful.");
        playerGold = playerGold - itemPrice;
        itemStock = itemStock - 1;
         }
         else {
            if (itemStock < 1) {
                System.out.print("\n Out of stock.");
            }
            else {
                System.out.print("\n Not enough money.");
            }
         }
         
         
         boolean itemBuy2 = playerGold >= itemPrice2 && itemStock2 > 0;
         if (itemBuy2) {
        System.out.println("\n Purchase successful.");
        playerGold = playerGold - itemPrice2;
        itemStock2 = itemStock2 - 1;
         }
         else {
            if (itemStock2 < 1) {
                System.out.print("\n Out of stock.");
            }
            else {
                System.out.print("\n Not enough money.");
            }
         }
         
         boolean itemBuy3 = playerGold >= itemPrice3 && itemStock3 > 0;
         if (itemBuy3) {
        System.out.println("\n Purchase successful.");
        playerGold = playerGold - itemPrice3;
        itemStock3 = itemStock3 - 1;
         }
         else {
            if (itemStock3 < 1) {
                System.out.print("\n Out of stock.");
            }
            else {
                System.out.print("\n Not enough money.");
            }
         }
         
         System.out.println("\n----------------------");
         
         System.out.println("Money: " + playerGold + currency);  
         System.out.println("\n" + itemName + "\n" + itemPrice + currency + "\n" + "Stock: " + itemStock);
         System.out.println("\n" + itemName2 + "\n" + itemPrice2 + currency + "\n" + "Stock: " + itemStock2);
         System.out.println("\n" + itemName3 + "\n" + itemPrice3 + currency + "\n" + "Stock: " + itemStock3);
            
            //end
    }
}