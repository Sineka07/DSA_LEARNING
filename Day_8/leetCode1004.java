//Time Complexity: O(n) where n is the size of the array    
//Space Complexity: O(1)
import java.util.*;
class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int i=0,j=0;
        int max=Integer.MIN_VALUE;
        int cnt=0;
        int sum=0;
        while(j<n)
        {
             if(nums[j]==0)
             {
                cnt++;
             }
             if(cnt<=k)
             {
                max=Math.max(max,j-i+1);
                j++;
             }
             else if(cnt>k)
             {
                while(cnt>k)
                {
                    if(nums[i]==0)
                    {
                        cnt--;
                    }
                    i++;
                }
                max=Math.max(max,j-i+1);
                j++;
                
             }
        }
        return max;
    }
}