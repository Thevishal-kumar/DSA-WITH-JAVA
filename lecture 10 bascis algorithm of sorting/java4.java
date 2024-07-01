import java.util.Arrays; //for inbuild arrays
import java.util.Collections; //for reverse order collections
public class java4{
    public static void printarr(Integer arr[]){ //for print arrays
        for(int i=0; i<arr.length ;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]){
             Integer arr[]={5,4,1,3,2};
            // Arrays.sort(arr);
            // Arrays.sort(arr, 0,4);
            // Arrays.sort(arr,Collections.reverseOrder());
            Arrays.sort(arr,0,4,Collections.reverseOrder());
            printarr(arr);
            
    }
}

