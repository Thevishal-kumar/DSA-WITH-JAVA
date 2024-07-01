import java.util.*;
 public class java4{
    public static void main(String args[]){
        int age = 1;
        if(age>=18) {
            System.out.println("adult: Drive, Vote");

        }
        else if (age >13 && age<18){
            System.out.print(
                "Tennager");
        }
        else{
            System.out.println("not adult");
        }
    }
 }