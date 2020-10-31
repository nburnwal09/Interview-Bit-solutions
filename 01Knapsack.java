public class Solution {
    public int solve(int[] A, int[] B, int C) {
        int n=A.length;
        int[] dp=new int[s+1];
    for(int i=0;i<n;i++)
        for(int j=s;j>=B[i];j--)
            dp[j]=max(dp[j],dp[j-B[i]]+A[i]);
    return dp[s];
    }
}
