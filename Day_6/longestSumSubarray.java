//Time Complexity: O(n)
//Space Complexity: O(n)
class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int n=arr.length;
        Map<Integer, Integer>res=new HashMap<>();
        res.put(0,-1);//start su 0 at index=-1
        int max=0;
        int pre=0;
        for(int i=0;i<n;i++)
        {
            pre+=arr[i];
            if(res.containsKey(pre-k))
            {
                max=Math.max(max,i-res.get(pre-k));
            }
            if(!res.containsKey(pre))
            {
                res.put(pre,i);
            }
        }
        return max;
        
    }
}

