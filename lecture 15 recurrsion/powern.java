// public class powern{
//     public static int power(int x , int n){
//         if(n==0){
//             return 1;
//         }
//         // int xnm1 = power(x,n-1); //store in xnm1
//         // int xn= x*xnm1;
//         // return xn;
//         return x*power(x,n-1);
//     }

//     public static void main(String args[]){

//     }
// }



// OPTIMISED CODE
public class powern{
    public static  int optimisedPower(int a , int n){
        if(n==0){
            return 1;
        }
        //  int halfPowersq = optimisedPower(a,n/2)*optimisedPower(a,n/2);
        int halfPower = optimisedPower(a,n/2);
        int halfPowersq = halfPower*halfPower;
         

         // n is odd
         if(n%2 !=0){
            halfPowersq = a*halfPowersq;
         }
         return halfPowersq;
    }
    public static void main(String args[]){
        int a =2;
        int n=10;
        System.out.println(optimisedPower(a,n));                     

    }
}

  