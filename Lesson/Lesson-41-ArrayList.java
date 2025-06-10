import java.util.ArrayList;
import java.util.Collections;

public class Main {
    
    public static void main(String[] args) {
        // ArrayList = A resizeable array that stores object (if primitive = autoboxing)
        //             Array size is fixed, ArrayList size is dynamic
        
        ArrayList<String> foods = new ArrayList<>();
        
        foods.add("Pizza");
        foods.add("Chicken Alfredo");
        foods.add("Hamburger");
        foods.add("Grilled cheese");
        
        // foods.remove();
        // foods.set(0, "Mac and cheese");
        
        Collections.sort(foods);
        
        System.out.println(foods);
    }
    
}