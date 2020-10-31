public class Solution {
    public int anytwo(String A) {
        int n=A.length();
        String b=A;
        
        int[][] dp=new int[n+1][n+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<n+1;j++){
                if(i==0 || j==0)
                dp[i][j]=0;
                else if(i!=j && A.charAt(i-1)==b.charAt(j-1))
                dp[i][j]=1+dp[i-1][j-1];
                else
                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        if(dp[n][n]>=2)
        return 1;
        return 0;
    }
}
