import java.util.ArrayList;

public class Juice {
    MenuUI menuUI = new MenuUI();
    ArrayList<String> ingredients = new ArrayList<>();
    String name;
    double price;
    
    Juice(String name, double price, ArrayList<String> ingredients) {
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
    }
    
    void displayInfo() {
        menuUI.separator();
        System.out.println("Name       : " + name);
        System.out.printf("Price      : $%.2f\n", price);
        System.out.print("Ingredients: ");
        for(String ingredient : ingredients) {
            String result= "";
            result += ingredient + ", ";
            result.trim();
            System.out.print(result);
        }
        System.out.println();
        menuUI.separator();
    }
}