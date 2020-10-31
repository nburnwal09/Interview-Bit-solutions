public class Solution {
    public int solve(ArrayList<Integer> A) {
        int s=A.size();
        int sum=0;
        for(int i=0;i<s;i++){
            sum+=A.get(i);
        }
        
        boolean[][] dp=new boolean[s+1][sum+1];
        int reqSum=0;
        for(int i=0;i<s+1;i++){
            for(int j=0;j<sum+1;j++){
                if(j==0)
                dp[i][j]=true;
                else if(i==0)
                dp[i][j]=false;
                else if(A.get(i-1)<=j)
                dp[i][j]=dp[i-1][j]||dp[i-1][j-A.get(i-1)];
                else
                dp[i][j]=dp[i-1][j];
                
                if(i==s && j<=sum/2 && dp[i][j]==true)
                reqSum=j;
            }
        }
        return sum-2*reqSum;
    }
}
