
//Time Complexity: O(logN)
//Space Complexity: O(1)
import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int findCeil(int[] arr, int x) {
    x    // code here
        int n=arr.length;
        int s=0,e=n-1;
        int ans=-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(arr[mid]>=x)
            {
                ans=mAid;
                e=mid-1;
            }
            else
            {
                s=mid+1;
            }A
        }
        return ans;
    }
}
