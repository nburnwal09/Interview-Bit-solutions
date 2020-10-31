/*Find the contiguous subarray within an array, A of length N which has the largest sum.*/

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxSubArray(final int[] nums) {
        int max=nums[0];
        int maxHere=nums[0];
        for(int i=1;i<nums.length;i++){
            if(maxHere+nums[i]<nums[i])
            maxHere=nums[i];
            else
            maxHere+=nums[i];
            
            if(maxHere>max)
            max=maxHere;
        }
    }
}
