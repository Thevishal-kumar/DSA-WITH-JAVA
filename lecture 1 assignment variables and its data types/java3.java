// Question3 
import java.util.*;

public class java3{
    public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   float pencil = sc.nextFloat();
   float pen = sc.nextFloat();
   float eraser = sc.nextFloat();
   float sum = pencil + pen + eraser;
   System.out.println(sum);

   float gst = sum*18/100;
   System.out.println(gst);
   float sumfinal = gst + sum ;
   System.out.print(sumfinal);
    }
}