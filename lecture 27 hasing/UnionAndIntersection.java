import java.util.*;
    
public class UnionAndIntersection{

public static void main(String args[]) {
    int arr[] = {7,3,9};
    int arr2[]= {6,3,9,2,9,4};

    HashSet<Integer>set = new HashSet<>();

    //union
    for(int i=0;i<arr.length;i++){
        set.add(arr[i]);
    }

    for(int i=0;i<arr2.length;i++){
        set.add(arr2[i]);
    }

    System.out.println("union = "+ set.size());
    System.out.println("union = "+ set);

    //intersection

    set.clear();
       for(int i=0;i<arr.length;i++){
        set.add(arr[i]);
    }

    int count =0;
    for(int i=0;i<arr2.length;i++){
        if(set.contains(arr2[i])){
       
            count++;
                 System.out.println("intersection = "+ set);
            set.remove(arr2[i]);
           
        }
    }
System.out.println("intersection = " + count);

}
}