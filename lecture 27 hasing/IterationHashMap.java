import java.util.*;
    
public class IterationHashMap{

public static void main(String args[]) {
        HashMap<String, Integer>hm = new HashMap<>();
        hm.put("india", 100);
        hm.put("china", 150);
        hm.put("us", 50);
        hm.put("indonesia", 6);
        hm.put("nepal", 5);

        //iterate
        Set<String>keys = hm.keySet();
        System.out.println(keys);

        for(String k : keys){
            System.out.println("keys = "+ k +", value = "+hm.get(k));
        }

}
}