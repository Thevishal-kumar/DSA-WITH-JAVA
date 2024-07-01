public class java6{

    public static int factorial(int n){
            int f =1;  //initial value

            for(int i=1; i<=n; i++ ){
                f=f*i;
            }
            return f;

 }
 public static int biocoeff(int n, int r){
    int fact_n = factorial(n);
    int fact_r = factorial(r);
    int fact_nmr = factorial(n-r);


    int biocoeff = fact_n/(fact_r + fact_nmr);
    return biocoeff;
 }
    public static void main(String args[]){
        
System.out.println(biocoeff(9,5));


    }
}