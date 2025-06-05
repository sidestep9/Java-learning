
public class MenuUI {
    
    MenuUI() {
        
    }
     
     public static void divider() {
         String symbol = "*".repeat(31);
         System.out.println(symbol);
     }
     
     public static void separator() {
         String symbol = "-".repeat(31);
         System.out.println(symbol);
     }
     
     int showMenu(String title, String prompt, String... options) {
         System.out.println(title);
         System.out.println();
         for(String option : options) {
             System.out.println(option);
         }
         divider();
         return InputUtil.inputInt(prompt);
     }
}