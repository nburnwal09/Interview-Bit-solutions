/*Give a N*N square matrix, return an array of its anti-diagonals. Look at the example for more details.
Eg. Input: 	
1 2 3
4 5 6
7 8 9
Return the following :
[ [1],
  [2, 4],
  [3, 5, 7],
  [6, 8],
  [9] ]*/


public class Solution {
    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
        int l=A.size();
        ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
        int s=2*A.get(0).size()-1;
        for(int k=0;k<s;k++){
            ArrayList<Integer> temp=new ArrayList<Integer>();
            for(int i=0;i<l;i++){
                for(int j=0;j<l;j++){
                    if(i+j==k)
                    temp.add(A.get(i).get(j));
                }
            }
            ans.add(temp);
        }
        return ans;
    }
}