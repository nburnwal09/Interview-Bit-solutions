public class Solution {
    public int perfectPeak(int[] A) {
        int l=A.length;
        int[] max=new int[l];
        max[0]=A[0];
        for(int i=1;i<l;i++)
        max[i]=Math.max(max[i-1],A[i]);
        
        int[] min=new int[l];
        min[l-1]=A[l-1];
        for(int i=l-2;i>=0;i--)
        min[i]=Math.min(min[i+1],A[i]);
        
        for(int i=1;i<l;i++)
        if(A[i]>max[i-1] && A[i]<min[i+1])
        return 1;
        
        return 0;
    }
}