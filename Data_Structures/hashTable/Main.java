import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Hashtable<Integer, String> table = new Hashtable<>(10);

        table.put(100, "Orioles");
        table.put(123, "Yankees");
        table.put(321, "Blue Jays");
        table.put(555, "Red Sox");
        table.put(777, "Rays");

        // calculate index number by doing key.hashCode() % capacity = index

        for (Integer key : table.keySet()) {
            System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + table.get(key));
        }
    }
}