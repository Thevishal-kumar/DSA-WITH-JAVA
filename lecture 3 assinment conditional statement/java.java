// QUESTION 1
// import java.util.*;
//  public class java{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         if( a < 0){
//             System.out.println("number is negative");
//         }else{
//             System.out.println("number is positive");
//         }



//     }
//  }




                        //  QUESTION 2

// import java.util.*;

// public class java{
//     public static void main(String args[]){
//   double temp = 13;
//   if(temp > 100){
//     System.out.println("you have fever");
//   }else{
//     System.out.println("you dont have fever");
//   }
//     }
// }



                            // QUESTION 3

// import java.util.*;
//  public class java{
//     public static void main(String args[]){
// Scanner sc = new Scanner(System.in);

//       int name = sc.nextInt();
//         switch(name){
//        case 1:System.out.println("monday");
//        break;
//        case 2:System.out.println("tuesday");
//        break;
//        case 3:System.out.println("wednesday");
//        break;
//        case 4:System.out.println("thursday");
//        break;
//        case 5:System.out.println("friday");
//        break;
//        case 6:System.out.println("saturday");
//        break;
//        case 7:System.out.println("sunday");
//        break;
//        default:System.out.println("not a week name");
//         }
//     }
//  }

                        // QUESTION 4

    // import java.util.*;

    // public class java{
    //     public static void main(String args[]){

    // int a = 63;
    
    // int b = 36;

    // boolean x =(a<b)?true:false;

    // int y = (a >b )?a:b;
    // System.out.println(x);
    //     System.out.println(y);
    //     }
        
    // }                       

                    // QUETSION 5 important question

    // import java.util.*;

    // public class java{
    //     public static void main(String args[]){

    //     Scanner sc = new Scanner(System.in);
    //     int year = sc.nextInt();
    //     // int leapyear = 2024;
        
    //     boolean x = (year %4 ) == 0;
    //     boolean y = (year%100)!=0;
    //     boolean z = ((year%100==0) && (year%400==0));


    //     if (x &&( y||z)){
    //         System.out.println(year + "is a leap year");
    //     }else{
    //         System.out.println(year + "is not a leap year");
    //     }
    //       }
    // }




    import java.util.*;
 public class java{
    public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("enter your first number: ");
int a = sc.nextInt();
System.out.print("enter your second number: ");
int b = sc.nextInt();
System.out.print("enter operator: ");

      char number = sc.next().charAt(0);
        switch(number){
       case '+':System.out.println(a+b);
       break;
       case '-':System.out.println(a-b);
       break;
       case '*':System.out.println(a*b);
       break;
       case '/':System.out.println(a/b);
       break;
       case '%':System.out.println(a%b);
       break;
       
       default:System.out.println("error");
        }
    }
 }