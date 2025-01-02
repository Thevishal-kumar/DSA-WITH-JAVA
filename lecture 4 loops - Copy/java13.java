// CONTINUE STATEMENT


import java.util.*;

public class java13{
    public static void main (String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter your number : " );
            int i = sc.nextInt();
         
      for( int a = 0 ; a<=i; a++ ) 
      {

        if(a==3){
            continue;
        }
        System.out.println(a);
      }
       }
    }
