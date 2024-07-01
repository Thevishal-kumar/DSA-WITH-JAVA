//   ARRAYS 
 import java.util.*;
public class java{
     public static void main(String args[]){
            int marks[]= new int[100];
            Scanner sc = new Scanner(System.in);
            marks[0] = sc.nextInt();
            marks[1] = sc.nextInt();
            marks[2] = sc.nextInt();
            System.out.println("phy : " + marks[0] );
            System.out.println("maths : " + marks[0] );
            System.out.println("chem : " + marks[0] );

            // update 
            // marks[2]= 100;
            // System.out.println("chem : " + marks[2]);

            int percenatge =(marks[0] + marks[1] + marks[2])/3;
            System.out.println("perecnatge : " + percenatge + "%");
            System.out.println(marks.length); //for length of arrays
            
    }
}