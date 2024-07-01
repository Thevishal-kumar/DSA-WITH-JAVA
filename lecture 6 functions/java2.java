// import java.util.*;


// public class java2{ 
//     public static void calculatorSum(int num1 , int num2 ){
        
//         int sum = num1 + num2;
//         System.out.println("sum is:"+ sum);


//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         calculatorSum(a,b);
        
        
        
//     }
// }   



// OR
import java.util.*;


public class java2{ 
    public static int calculatorSum(int num1 , int num2 ){
        
        int sum = num1 + num2;
        return sum;


    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
       int sum=  calculatorSum(a,b);
        System.out.println("sum is:"+ sum);
        
        
    }
}   