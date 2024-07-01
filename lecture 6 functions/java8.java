// FUNCTION OVERLOADING USING DATA TYPES


public class java8{

    public static int sum(int a ,int b){
        return a+b;
    }
    public static float sum(float a, float b){
        return a+b;
    }
    public static void main(String args[]){

        System.out.println(sum(2,3));
        System.out.println(sum(2.6f,3.4f));

    }
}