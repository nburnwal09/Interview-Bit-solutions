public class Solution {
    HashMap<String, Integer> memo = new HashMap<>();
    public int solve(String s, int i, int j, boolean istrue){
        if(i>j)
        return 0;
        String key =i + " " + j + " " + istrue;
        if(memo.containsKey(key))
            return memo.get(key);
        if(i==j){
            if(istrue==true)
            return s.charAt(i)=='T'?1:0;
            else 
            return s.charAt(i)=='F'?1:0;
        }
            
        int ans=0;
        for(int k=i+1;k<j;k=k+2){
            int lt=solve(s,i,k-1,true);
            int lf=solve(s,i,k-1,false);
            int rt=solve(s,k+1,j,true);
            int rf=solve(s,k+1,j,false);
            if(s.charAt(k)=='&'){
                if(istrue==true)
                    ans+=(lt*rt);
                else
                    ans+=(lf*rt)+(lt*rf)+(lf*rf);
            }
            else if(s.charAt(k)=='|'){
                if(istrue==true)
                    ans+=(lt*rf)+(lf*rt)+(lt*rt);
                else
                    ans+=(lf*rf);
            }
            else{
                if(istrue==true)
                    ans+=(lt*rf)+(lf*rt);
                else
                    ans+=(lf*rf)+(lt*rt);
            }
        }
        memo.put(key, (ans % 1003));
        return (ans % 1003);
    }
    public int cnttrue(String A) {
        return solve(A,0,A.length()-1, true);
    }
}
