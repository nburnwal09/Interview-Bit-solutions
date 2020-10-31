public class Solution {
    public int solve(String A, String B) {
        int la=A.length();
        int lb=B.length();
        int[][] a=new int[la+1][lb+1];
        for(int i=0;i<=la;i++){
            for(int j=0;j<=lb;j++){
                if(i==0 || j==0)
                    a[i][j]=0;
                else if(A.charAt(i-1)==B.charAt(j-1))
                a[i][j]=1+a[i-1][j-1];
                else
                a[i][j]=Math.max(a[i-1][j],a[i][j-1]);
            }
        }
        return a[la][lb];
    }
}
