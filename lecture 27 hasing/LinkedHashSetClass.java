import java.util.*;
    
public class LinkedHashSetClass{

public static void main(String args[]) {
  HashSet<String> cities = new HashSet<>();
  cities.add("delhi");
  cities.add("mumbai");
  cities.add("nodia");
  cities.add("bengaluru");
  System.out.println(cities);

    LinkedHashSet<String> lhs = new LinkedHashSet<>();
    lhs.add("Delhi");
    lhs.add("mumbai");
  lhs.add("nodia");
  lhs.add("bengaluru");
  System.out.println(lhs);
}
}