public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int isScramble(final String a, final String b) {
        if(a.length()!=b.length())
            return 0;
        if(a.length()==0 || a.equals(b))
            return 1;
        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(!new String(arr1).equals(new String(arr2)))
            return 0;
        int n=a.length();
        for(int i=1;i<n;i++){
            if(isScramble(a.substring(0,i),b.substring(n-i,n))==1 && isScramble(a.substring(i,n),b.substring(0,n-i))==1)
                return 1;
            else if(isScramble(a.substring(0,i),b.substring(0,i))==1 && isScramble(a.substring(i,n),b.substring(i,n))==1)
                return 1;
            else
                return 0;
        }
        return 1;
    }
}
