// KEEP ENETREING A NUMBER TILL USER ENTERS A MULTIPLE OF 10
// FOR LOOP 
// import java.util.*;

// public class java12{
//     public static void main (String args[]){
//             Scanner sc = new Scanner(System.in);
//             System.out.print("enter your number : ");
//             int i = sc.nextInt();5
         
//       for( int a = 0 ; a<=i; a++ ) 
//       {

//         if(i%10==0){
//             break;
//         }
//         System.out.println(a);
//       }
//        }
//     }
    


// do while loop 
import java.util.*;

public class java12{
    public static void main (String args[]){
            Scanner sc = new Scanner(System.in);
            do{
                System.out.print("enter your number:");
                int n = sc.nextInt();

                if (n%10==0){
                    break;
                }
                System.out.println(n);
            }while(true);
            
      }
       }
    
