import java.util.HashMap;

public class Main {
    
    public static void main(String[] args) {
        // HASHMAP = a data structure that store key-value pairs
        //           Keys are unique, but values can be duplicated
        //           Does not maintain any order, but it's memory efficient
        //           HashMap<key, value>
        
        HashMap<String, Double> map = new HashMap<>();
    
        map.put("Pineapple", 1.25);
        map.put("Apple", 0.50);
        map.put("Banana", 0.25);
        map.put("Grapes", 1.50);
        
        //map.remove("Grapes");
        //map.get("Pineapple");
        //map.containsKey("Banana");
        //map.containsValue(1.50);
        //map.size();
        
        for(String key : map.keySet()) {
            System.out.println(key + ": $" + map.get(key));
        }
    }

}