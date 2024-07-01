public class update{

     public static int setithbit(int n, int i){
   int bitmask = 1<<i;
   return n| bitmask;
    }
    public static int clearithbit(int n , int i){
        int bitmask = ~(1<<i);
        return n& bitmask;
    }
    public static int updateithbit(int n, int i , int newbit){
        // if(newbit == 0){
        //     return clearithbit(n,i);
        // }else{
        //     return setithbit(n,i);
        // }

     n = clearithbit(n,i);
        int BitMask= newbit<<i;
        return n|BitMask;

    }
    public static void main(String args[]){
        System.out.println(updateithbit(10,2,8));
        
    }
}