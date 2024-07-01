// ARRAYS AS A FUNCTION ARGUMENTS 

import java.util.*;

public class java2{
    public static void update(int marks[] , int noncahangeable){
        noncahangeable =10;
        for(int i=1 ;i< marks.length; i++){
            marks[i]= marks[i] + 1;
        } 
    }
    public static void main(String args[]){
        int marks[]={97,98,99};
        int noncahangeable =5;
        update(marks ,noncahangeable);
        System.out.println(noncahangeable);

        // for verify
        // print our marks

        for(int i=0 ; i<marks.length;i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}