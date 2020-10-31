public class Solution {
    public int solve(String a) {
        int n=a.length();
        String b="";
        for(int i=n-1;i>=0;i--)
        b+=a.charAt(i);
        
        int[][] dp=new int[n+1][n+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<n+1;j++){
                if(i==0 || j==0)
                dp[i][j]=0;
                else if(a.charAt(i-1)==b.charAt(j-1))
                dp[i][j]=1+dp[i-1][j-1];
                else
                dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        return dp[n][n];
    }
}
