public class lastbit{

    public static int clearlastithbit(int n , int i){
        int bitmask = (~0)<<i;
        return n & bitmask;
    }
    public static void main(String args[]){
      System.out.println(clearlastithbit(15,2));
    }
}