// check if number is prime or not by making funtion 

// public class java9{

//     public static boolean isprime(int n){
//         boolean isprime= true; //we aaaume number is prime
//         for(int i=2;i<=n-1;i++){   //completely dividing
//             if(n% i==0){
//                 isprime = false;
//                 break;
//             }
//         }
//         return isprime;

//     }
//     public static void main(String args[]){                                                                                            
//         System.out.println(isprime(12));

//     }
// }


// or 
// public class java9{

//     public static boolean isprime(int n){
//         for(int i=2;i<=n-1;i++){   //completely dividing
//             if(n% i==0){
        
//                 return false;
//             }
//         }
//         return true;

//     }
//     public static void main(String args[]){                                                                                            
//         System.out.println(isprime(3));

//     }
// }

// here does not check further after retrun statement true
public class java9{

    public static boolean isprime(int n){
        // corner case
        // 2
        if(n==2){
            return true;
        }
        for(int i=2;i<=n-1;i++){   //completely dividing
            if(n% i==0){
        
                return false;
            }
        }
        return true;

    }
    public static void main(String args[]){                                                                                            
        System.out.println(isprime(8));

    }
}