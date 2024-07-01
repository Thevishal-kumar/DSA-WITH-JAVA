// method 1  

// import java.util.*;
//  public class java5{
//     public static void main(String args[]){
//         Scanner sc= new Scanner(System.in);
//         int income = sc.nextInt();
//         // int tax;

//          if(income <500000){
//             System.out.println("NOTAX:" + "TAX=" + 0);
//          }
//          else if(income<1000000 && income>500000){
//             System.out.println("20%TAX:" +  "TAX=" + income*(0.2));
//          }
//          else{
//             System.out.println("30TAX:" +  "TAX=" + income*(0.3));
//          }
//     }
//  }

//  method 2nd 
import java.util.*;
 public class java5{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int income = sc.nextInt();
        int tax;

         if(income <500000){
           tax = 0;
         }
         else if(income<1000000 && income>500000){
            tax = (int)(income*0.2);
         }
         else{
             tax = (int)(income*0.3);
         }
         System.out.println("your tax is :" + tax);
    }
 }
