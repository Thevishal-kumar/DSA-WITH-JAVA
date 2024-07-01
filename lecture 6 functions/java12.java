// BINARY TO DECIMAL 

public class java12{
    public static void bintodec( int binnum){
        int mynum = binnum;
        int pow=0;
        int decnum = 0; 
        while(binnum>0){
            int lastdigit = binnum%10;
            decnum = decnum + (lastdigit*(int)Math.pow(1,2));
            pow++;
            binnum= binnum/10;
        }

            System.out.println("decimal of " + mynum + " = "+ decnum);
    }
    public static void main(String args[]){
bintodec(101);
    
    }
}