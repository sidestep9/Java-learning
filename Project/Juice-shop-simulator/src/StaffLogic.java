import java.util.ArrayList;

public class StaffLogic {
    JuiceLogic juiceLogic = new JuiceLogic();
    
    void addJuice(String name, double price, ArrayList<String> ingredients) {
        juiceLogic.juices.add(new Juice(name, price, ingredients));
        System.out.println("New juice added");
    }
    void removeJuice(Juice juice) {
        juiceLogic.juices.remove(juice);
        System.out.println("Juice deleted");
    }
    
    void editName(Juice juice, String name) {
        juice.name = name;
        System.out.println("Name changed");
    }
    void editPrice(Juice juice, int price) {
        juice.price = price;
        System.out.println("Price changed");
    }
}