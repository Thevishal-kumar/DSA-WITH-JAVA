public class fast{
    public static  int fastexp(int a, int n){
        int ans =1;
        while(n>0){
            if((n&1)!=0){ //check LSB
            ans = ans*a;

            }
            a=a*a; // a=a square
            n=n>>1; //shift binary

        }
        return ans;
    }
    public static void main(String args[]){
         System.out.println(fastexp(3,5));
    }
}