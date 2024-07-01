//  o-1 TRAINGLE 
public class java5{ 

            public static void traingle(int n){
                for(int i=1; i<=n ;i++){
                    for(int j=1; j<=i ;j++){
                        if((i+j)%2==0){
                            System.out.print("1");

                        }else{
                            System.out.print("0");
                        }
                    }
                    System.out.println();
                }
            }


    public static void main(String args[]){
traingle(8);
    }
}