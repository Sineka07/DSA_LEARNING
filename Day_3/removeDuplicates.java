//Time complexity: O(n) 
//space complexity: O(1)
class Solution {
    public int removeDuplicates(int[] nums) {
            int ind=0;
            int i=1;
            while(i<nums.length)
            {
                 if(nums[i]!=nums[i-1])
                 {
                    ind++;
                    nums[ind]=nums[i];
                 }
                 i++;
            }
            return ind+1;
           
    }
}