public class divideandconquer{
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void mergesort(int arr[],int si, int ei){
        //base case
        if(si>=ei){
            return;
        }
            //kaam
    int mid = si +(ei - si)/2;
    mergesort(arr,si,mid);//left part
    mergesort(arr,mid+1,ei);//right part

    merge(arr,si,mid,ei);
    }

    public static void merge(int arr[],int si,int mid, int ei){
        //left(0,3)=4 right(4,6)=3 ->6-0+1
            int temp[]=new int[ei-si+1];
            int i=si; //iterartor for left part
            int j= mid+1;//iterator fot right part
            int k = 0; //iterator for temp arr

            while(i<=mid &&j<=ei){
                if(arr[i] < arr[j]){
                    temp[k]=arr[i];
                    i++;
                    
                }else{
                    temp[k]=arr[j];
                    j++;
                   
                }
                k++;
            }
            //left part me agar kuch bacha hai
            while(i <= mid){
                temp[k++] = arr[i++];
            }

            //right part me agar kuch bach gaya hai
            while(j<=ei){
                temp[k++] = arr[j++];
            }

            //copytemp to original arr
            for(k=0,i=si;k<temp.length;k++,i++){
                arr[i] = temp[k];

            }
    }
    public static void main(String args[]){
            int arr[]= {6,3,9,5,2,8};
            mergesort(arr,0,arr.length-1);
            printArr(arr);
    }
}
