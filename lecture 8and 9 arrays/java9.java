// MAXIMUM SUBARRAYS 
public class java9{
    public static boolean maxsubarrays(int arr[]){
       for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
           
        }
        return false;
        

       }
    public static void main(String args[]){
            int arr[]={2,4,6,2,10};
            System.out.print(maxsubarrays(arr));
    }
}