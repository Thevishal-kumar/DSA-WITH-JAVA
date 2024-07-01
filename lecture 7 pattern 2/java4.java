    // FLOYD'S TRIANGLE 
    public class java4{

    public static void floyd_traingle(int n){
        // outer loop
        int counter = 1;
        for(int i=1 ;i<=n ; i++){
            // inner - how many times will counter be printed
            for(int j=1; j<=i  ; j++){
                System.out.print(counter + " ");
                counter++;
            }
System.out.println();
        }
    }
        public static void main(String args[]){
floyd_traingle(5);
        }
    }