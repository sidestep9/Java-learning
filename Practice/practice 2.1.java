public class Main {
    
    public static void main (String[] args) {
        
        String itemName = "Bag of Holding";
        int itemPrice = 2400;
        int stock = 1;
        String itemName2 = "Amulet of Health";
        int itemPrice2 = 800;
        int stock2 = 1;
        String itemName3 = "Buckler";
        int itemPrice3 = 300;
        int stock3 = 10;
        
        int playerGold = 1500;
        char currency = 'G';
        
        boolean canBuy = true;
        
        
        System.out.println ("Money: " + playerGold + currency + "\n");
        
        System.out.println (itemName + " " + itemPrice + currency);
        
        if (playerGold >= itemPrice) {
            
            System.out.println ("Purchase successful!");    
            playerGold = playerGold - itemPrice;
            stock = stock - 1;
        }
        else {
            System.out.println ("Not enough gold.\n");
        }
        
        System.out.println (itemName2 + " " + itemPrice2 + currency);
        
        if (playerGold >= itemPrice2) {
            
            System.out.println ("Purchase successful!");    
            playerGold = playerGold - itemPrice2;
            stock = stock2 - 1;
        }
        else {
            System.out.println ("Not enough gold.");
        }
        
        System.out.println ("\nMoney: " + playerGold + currency);
    }
    
}