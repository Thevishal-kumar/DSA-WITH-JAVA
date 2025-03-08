import java.util.*;

public class FloodFill{

    public void helper(int [][]image,int sr,int sc,int color,boolean vis[][],int orgCol){

        if(sr<0 || sc<0 || sr>=image.length || sc>=image[0].length || vis[sr][sc] || image[sr][sc]!=orgCol){
            return;
        }
        image[sr][sc]=color
        //left
        helper(image[sr][sc]=color,sr,sc-1,color,vis,orgCol);
        //right
        helper(image[sr][sc]=color,sr,sc+1,color,vis,orgCol);
        //up
        helper(image[sr][sc]=color,sr-1,sc,color,vis,orgCol);
        //down
        helper(image[sr][sc]=color,sr+1,sc,color,vis,orgCol);


    }
    public int[][] floodFill(int [][]image,int sr,int sc,int color){
        boolean vis[][]=new boolean[image.length][image[0].length];
        hepler(image,sr,sc,color,vis,image[sr][sc]);
        return image;
    }
    public static void main(String args[]){

    }
}
