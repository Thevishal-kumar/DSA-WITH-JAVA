import java.util.*;
    
public class HashSetIteration{

public static void main(String args[]) {
  HashSet<String> cities = new HashSet<>();
  cities.add("delhi");
  cities.add("mumbai");
  cities.add("nodia");
  cities.add("bengaluru");

//   Iterator it = cities.iterator();
//   while(it.hasNext()){
//     System.out.println(it.next());
//   }

for(String city : cities){
    System.out.println(city);
}

}
}