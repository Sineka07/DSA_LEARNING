
//Time Complexity: O(nlogm) where n is the number of piles and m is the maximum number of bananas in a pile
//Space Complexity: O(1)
class Solution {
    long calculateHours(int[] arr, int h)
    {
        int n=arr.length;
        long tot=0;
        for(int i=0;i<n;i++)
        {
            int banana=arr[i];
            tot+=Math.ceil((double)banana/(double)h);
        }
        return tot;

    }
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int s=1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            int banana=piles[i];
            if(banana>max)
            {
                max=banana;
            }
        }
        int e=max;
        int ans=-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            long tothr=calculateHours(piles,mid);
            if(tothr<=h)
            {
                ans=mid;
                e=mid-1;
            }
            else
            {
                s=mid+1;
            }
            
        }
        return ans;
    }
}