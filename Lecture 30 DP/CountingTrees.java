public class CountingTrees{
    public static int countingTrees(int n){
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;

        for(int i=2;i<n+1;i++){
            for (int j=0;j<i;j++){
                int left = dp[j];
                int right= dp[i-j-1];
                dp[i] += left*right;
            }
        }
        return dp[n];
    }
    public static void main(String args[]){
        int n=4;
        System.out.println(countingTrees(n));

    }
}