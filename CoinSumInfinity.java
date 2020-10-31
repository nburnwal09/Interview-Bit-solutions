public class Solution {
    public int coinchange2(int[] A, int B) {
        int n=A.length;
        int[][] dp=new int[n+1][B+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<B+1;j++){
                if(j==0)
                dp[i][j]=1;
                else if(i==0)
                dp[i][j]=0;
                else if(A[i-1]<=j)
                dp[i][j]=(dp[i-1][j]+dp[i][j-A[i-1]])% 1000007;
                else
                dp[i][j]=dp[i-1][j]% 1000007;
            }
        }
        return dp[n][B]% 1000007;
    }
}
