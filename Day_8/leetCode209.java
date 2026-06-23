//Time Complexity: O(n) where n is the size of the array
//Space Complexity: O(1)
import java.util.*;
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int sum=0;
        int min=Integer.MAX_VALUE;
        int i=0,j=0;
        while(j<n)
        {
            sum+=nums[j];
            if(sum<target)
            {
                j++;
            }
            else if(sum>=target)
            {
                while(sum>=target)
                {
                    min=Math.min(min,j-i+1);
                    sum-=nums[i];
                    i++;
                }
                j++;
            }
        }
        if(min==Integer.MAX_VALUE)
           return 0;
        else
          return min;
    }
}