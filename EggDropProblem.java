public class Solution {
    public int solve(int A, int B) {
        int[][] dp=new int[A+1][B+1];
        for(int i=0;i<=A;i++)
        dp[i][1]=1;
        
        for(int i=0;i<=B;i++)
        dp[1][i]=i;
        
        for(int i=2;i<=A;i++){
            for(int j=2;j<=B;j++){
                int min=Integer.MAX_VALUE;
                for(int f=1;f<=j;f++){
                    int cnt=Math.max(dp[i-1][f-1],dp[i][j-f]);
                    if(cnt<min)
                    min=cnt;
                }
                dp[i][j]=1+min;
            }
        }
        return dp[A][B];
    }
}
