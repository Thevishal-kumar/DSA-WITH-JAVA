import java.util.*;
    
public class TreeHashSetClass{

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

  TreeSet<String>ts = new TreeSet<>();
  ts.add("delhi");
    ts.add("mumbai");
  ts.add("nodia");
  ts.add("bengaluru");
  System.out.println(ts);
}
}