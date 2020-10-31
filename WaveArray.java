/*Arrange the elements into a sequence such that a1 >= a2 <= a3 >= a4 <= a5.....*/

public class Solution {
    public int[] wave(int[] A) {
        Arrays.sort(A);
        for(int i=0;i<A.length-1;i+=2){
            int val=A[i];
            A[i]=A[i+1];
            A[i+1]=val;
        }
        return A;
    }
}