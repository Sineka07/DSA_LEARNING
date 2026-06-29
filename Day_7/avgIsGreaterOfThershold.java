//Time Complexity: O(n)
 //Space Complexity: O(1)   
class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n=arr.length;
        int i=0,j=0;
        int sum=0,max=Integer.MIN_VALUE;
        int cnt=0;
        while(j<n)
        {
            sum+=arr[j];
            if((j-i+1)<k)
            {
                j++;
            }
            else if((j-i+1)==k)
            {
                if(sum>=k*threshold)
                {
                    cnt++;
                }
                sum-=arr[i];
                i++;
                j++;
            }
        }
        return cnt;
        
    }
}
