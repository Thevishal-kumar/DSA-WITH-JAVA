import java.util.*;

public class problem3{
    public static int fact(int n){
        if(n==0){ //base case
            return 1;
        }
        int fnm1= fact(n-1);
        int fn= n*fact(n-1);
        return fn;
    }
    public static void main(String args[]){
             Scanner sc= new Scanner(System.in);
             System.out.print("Enter the number: ");
             int n= sc.nextInt();
            System.out.print(fact(n));
             

    }
}
