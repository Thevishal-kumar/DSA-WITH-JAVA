// print number from 1 to n except multiple of 10


// import java.util.*;

// public class java14{
//     public static void main (String args[]){
//             Scanner sc = new Scanner(System.in);
//             System.out.println("enter your number : " );
//             int i = sc.nextInt();
         
//       for( int a = 0 ; a<=i; a++ ) 
//       {

//         if(a%10==0){
//             continue;
//         }
//         System.out.println(a);
//       }
//        }
//     }


// DO WHILE LOOP 
// display all numbers entered by user except multiple of 10

import java.util.*;

public class java14{
    public static void main (String args[]){
            Scanner sc = new Scanner(System.in);
           do{
            System.out.print("enter your number: ");
            int i = sc.nextInt();
            if(i%10==0){
                continue;
            }
            System.out.println(i);

           }while(true);
      
      }
       }
    
