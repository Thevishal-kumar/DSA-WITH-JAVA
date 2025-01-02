import java.util.*;
    
public class HashOperation{

public static void main(String args[]) {
       //create

       HashMap<String,Integer>hm = new HashMap<>();

       //insert -0(1)
       hm.put("india",1000);
       hm.put("china",150);
       hm.put("us",50);

       System.out.println(hm);

       //GET -O(1)
        int population = hm.get("india");
        System.out.println(population);

        System.out.println(hm.get("america"));

        //Containskey

        System.out.println(hm.containsKey("us"));
        System.out.println(hm.containsKey("america"));

        //remove
        System.out.println(hm.remove("india"));
         System.out.println(hm);


        // size
         System.out.println(hm.size());

         //isEmpty
          System.out.println(hm.isEmpty());

          //clear
          hm.clear();
            System.out.println(hm.isEmpty());
}
}