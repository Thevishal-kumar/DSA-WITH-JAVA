public class java4{
    public static void main(String args[]){
        int n =6;
        char ch ='A';
        // OUTER LOOP
        for(int line=1;line<=n;line++){
        // INNERLOOP
        for(int chars=1;chars<=line;chars++){
            System.out.print(ch);
            
            ch++;
        }
        System.out.println();
        }

    }
}