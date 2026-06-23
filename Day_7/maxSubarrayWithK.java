//Time Complexity: O(n)
//Space Complexity: O(1)
import java.util.*;
class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int n=arr.length;
        int i=0,j=0;
        int sum=0,max=Integer.MIN_VALUE;
        while(j<n)
        {
            sum+=arr[j];
            if((j-i+1)<k)
            {
                j++;
            }
            else if((j-i+1)==k)
            {
                max=Math.max(max,sum);
                sum-=arr[i];
                i++;
                j++;
            }
            
        }
        return max;
     
    }
}