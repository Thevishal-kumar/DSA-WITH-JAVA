import java.util.ArrayList;

public class arraylists{
    public static void main(String args[]){
  ArrayList<Integer>list  = new ArrayList<>();
  ArrayList<String>list2  = new ArrayList<>();
  ArrayList<Boolean>list3  = new ArrayList<>();

  list.add(1);
  list.add(2);
  list.add(3);
  list.add(4);

  list.add(1,9);
  System.out.println(list);


  //get operation
//   int element = list.get(2);
//   System.out.println(element);

  //delete
//   list.remove(2);
//   System.out.println(list);

  //set operation

//   list.set(2,10);
//     System.out.println(list);


    // //contains
    //   System.out.println(list.contains(1));
    //   System.out.println(list.contains(11));



            // ARRAY SIZE
            System.out.println(list.size());
            //print the aaraylist
            for(int i=0; i<list.size(); i++){
                System.out.print(list.get(i));
            }


    }

}