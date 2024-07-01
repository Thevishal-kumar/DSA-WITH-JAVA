public class java11{
    public static boolean isprime(int n ){
        if(n==2){
            return true;
        }

        for(int i=2;i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void primeinrange(int n){
        for(int i=2; i<=n;i++){ //true
            if(isprime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String args[]){
        primeinrange(20);
    }
}