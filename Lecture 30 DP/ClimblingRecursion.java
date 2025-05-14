public class ClimblingRecursion{
    public static int climbingStairs(int n){
        if(n<0){
            return 0;
        }
        if(n==0){
            return 1;
        }
    
        return climbingStairs(n-1)+climbingStairs(n-2);
    }

    public static void main(String args[]){
        int n=5;
        // int f[]=new int[n+1];
        // System.out.println(fib(n,f));
        System.out.println(climbingStairs(n));
    }
}