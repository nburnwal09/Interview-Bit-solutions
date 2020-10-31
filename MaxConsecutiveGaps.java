/*Given an unsorted array, find the maximum difference between the successive 
elements in its sorted form.*/

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maximumGap(final List<Integer> a) {
        int s=a.size();
        if(s==1)
        return 0;
        Collections.sort(a);
        int diff=0;
        for(int i=0;i<s-1;i++){
            diff=Math.max(diff,a.get(i+1)-a.get(i));
        }
        return diff;
    }
}