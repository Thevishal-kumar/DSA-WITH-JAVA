import java.util.*;
    
public class Chocola{

public static void main(String args[]) {
    int n=4,m=6;
        Integer costVer[] = {2,1,3,1,4};
        Integer costHor[] = {4,1,2};


        Arrays.sort(costVer,Collections.reverseOrder());
        Arrays.sort(costHor,Collections.reverseOrder());

        int h=0, v=0; //horizontal and vertical cut
        int hp=1, vp=1; //horizontal and vertical pieces
        int cost=0;

        while(h<costHor.length && v< costVer.length){
            //vertical cost < horizontal cost
            if(costVer[v] <= costHor[h]){
                //hor cut
                cost += (costHor[h]*vp);
                hp++;
                h++;
            }else{
                //vert cut
                cost += (costVer[v]*hp);
                vp++;
                v++;
            }
        }
        while(h<costHor.length){
            //horizontal cut left
             cost += (costHor[h]*vp);
                hp++;
                h++;
        }

        while(v<costVer.length){
            //vertical cut left
            cost += (costVer[v]*hp);
                vp++;
                v++;
        }

        System.out.println("min cost = "+ cost);
}
}