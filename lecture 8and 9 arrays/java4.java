// largest and smallest numbers 

public class java4{
    public static int getlargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0 ; i<numbers.length ; i++){
            if(largest <numbers[i]){
                largest = numbers[i];
            }
            if(smallest >numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("smallest value is :" + smallest); //as fuction se ek hi baar return ho skta hai 
        return largest;
    }
    public static void main(String args[]){
        int numbers[]={1,2,6,3,5};
        System.out.println("largest value is : " + getlargest(numbers));
    }
}