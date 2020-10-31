/*Given an unsorted integer array, find the first missing positive integer.*/

public class Solution {
    public int firstMissingPositive(ArrayList<Integer> A) {
        Collections.sort(A);
        int s=A.size();
        int c=1;
        for(int i=0;i<s;i++){
            if(A.get(i)>=1){
                if(A.get(i)==c)
                c=c+1;
            else
            return c;
        }
        else
        c=1;
        }
        return c;
    }
}