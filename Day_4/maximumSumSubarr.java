//Time Complexity: O(n)
//Space Complexity: O(1)
class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int res=nums[0];
        int max=nums[0];
        for(int i=1;i<n;i++)
        {
            int sum=res+nums[i];
            res=Math.max(nums[i],sum);
            max=Math.max(max,res);
        }
        return max;
    }
}