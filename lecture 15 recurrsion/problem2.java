// print numbers from 1 to n(INCRESING ORDER)

public class problem2{

    // public static void printIec(int n){
    //     if(n==10){
    //         System.out.println(10);
    //         return;
    //     }
    //     System.out.print(n+" ");
    //     printDec(n+1);
    // }

// method 2

public static void printInc(int n){
    if(n==1){
        System.out.print(n+" ");
        return;
    }
    printInc(n-1);
    System.out.print(n+" ");
}
    public static void main(String args[]){
             int n=10;
             printInc(n);
    }
}

