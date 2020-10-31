/*You are given an n x n 2D matrix representing an image.
Rotate the image by 90 degrees (clockwise).*/


public class Solution {
    public void rotate(ArrayList<ArrayList<Integer>> a) {
        int n=a.size();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int t=a.get(i).get(j);
                a.get(i).set(j,a.get(j).get(i));
                a.get(j).set(i,t);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int t=a.get(i).get(j);
                a.get(i).set(j,a.get(i).get(n-j-1));
                a.get(i).set(n-j-1,t);
            }
        }

    }
}
