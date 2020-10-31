/*Given a read only array of n + 1 integers between 1 and n, find one number that 
repeats in linear time using less than O(n) space and traversing the stream 
sequentially O(1) times.*/

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int repeatedNumber(final List<Integer> A) {
        HashMap<Integer, Integer> h=new HashMap<>();
        for(int i=0;i<A.size();i++){
            if(h.containsKey(A.get(i)){
                return A.get(i);
            }
            else{
                
            }
        }
    }
}