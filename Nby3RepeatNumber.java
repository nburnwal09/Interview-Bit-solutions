public class Solution {
    // DO NOT MODIFY THE LIST
    public int repeatedNumber(final List<Integer> a) {
        int n=a.size();
        HashMap<Integer, Integer> count=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            if(count.containsKey(a.get(i))){
                count.put(a.get(i),count.get(a.get(i))+1);
            }
            else
                count.put(a.get(i),1);
            if(count.get(a.get(i))>(float)n/3)
            return a.get(i);
        }
        return -1;
    }
}