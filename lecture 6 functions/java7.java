// FUCNTTION OVERLODAING USING PARAMTERS


public class java7{
    // funtion to calculte sum of two numbers

    public static int sum(int a,int b){
        return a+b;


    }

    // function to calculate three numbers
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String args[]){
//    for call the function 
System.out.println(sum(3,5));
System.out.println(sum(3,5,4));
          
    }
}