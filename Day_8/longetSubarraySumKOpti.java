//Time Complexity: O(n) where n is the size of the array
//Space Complexity: O(1)    
 import java.util.*;
class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int i=0,j=0;
        int max=Integer.MIN_VALUE;
        int n=arr.length;
        int sum=0;
        while(j<n)
        {
            sum+=arr[j];
            if(sum<k)
               j++;
            else if(sum==k)
            {
                max=Math.max(max,j-i+1);
                j++;
            }
            else if(sum>k)
            {
                while(sum>k)
                {
                    sum-=arr[i];
                    i++;
                }
                if(sum==k)
                {
                    max=Math.max(max,j-i+1);
                }
                j++;
            }
        }
        return max;
 
        
        // int n=arr.length;
        // Map<Integer, Integer>res=new HashMap<>();
        // res.put(0,-1);//start su 0 at index=-1
        // int max=0;
        // int pre=0;
        // for(int i=0;i<n;i++)
        // {
        //     pre+=arr[i];
        //     if(res.containsKey(pre-k))
        //     {
        //         max=Math.max(max,i-res.get(pre-k));
        //     }
        //     if(!res.containsKey(pre))
        //     {
        //         res.put(pre,i);
        //     }
        // }
        // return max;
        
        
    }
}
