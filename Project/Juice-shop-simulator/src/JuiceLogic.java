import java.util.ArrayList;
import java.util.Arrays;

public class JuiceLogic {
    ArrayList<Juice> juices = new ArrayList<>();
    
    // temp
    void temp() {
        juices.add(new Juice("Green Delish", 4.99, new ArrayList<>(Arrays.asList("Avocado", "Sweet Condensed Milk", "Chocolate Syrup"))));
        juices.add(new Juice("Pink Princess", 1.25, new ArrayList<>(Arrays.asList("Strawberry", "Sweet Condensed Milk", "Chocolate Syrup"))));
        juices.add(new Juice("Sweet Tropical", 1.99, new ArrayList<>(Arrays.asList("Mango", "Sweet Condensed Milk", "Chocolate Syrup"))));
        juices.add(new Juice("Refreshing Beach", 2.99, new ArrayList<>(Arrays.asList("Watermelon", "Sweet Condensed Milk", "Chocolate Syrup"))));
        juices.add(new Juice("Summer Heat", 2.5, new ArrayList<>(Arrays.asList("Lemon", "Sweet Condensed Milk", "Chocolate Syrup"))));
    }
    
    Juice searchJuice(String name) {
        for(Juice juice : juices) {
            if(juice.name.equals(name)) {
                return juice;
            }
        }
        return null;
    }
    
    void showJuice() {
        for(Juice juice : juices) {
            juice.displayInfo();
        }
    }
}