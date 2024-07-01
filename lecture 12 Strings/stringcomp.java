public class stringcomp{
    public static void main(String args[]){
        String s1 = "tony";
        String s2 = "tony";
        String s3 = new String("tony");
         
         // if(s1==s2){
         //    System.out.println("strins are equal");
         // }
         // else{
         //    System.out.println("strins are not equal");
         // }

         // if(s1==s3){
         //    System.out.println("strins are equal");
         // }
         // else{
         //    System.out.println("strins are not equal");
         // }

         // use function for comparison 
         if(s1.equals(s3)){
    System.out.println("STTINGS ARE EQUALS");

         }
         else{
            System.out.println("strings are not equals");
         }
    }
}