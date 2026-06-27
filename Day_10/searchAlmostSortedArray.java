//Time Complexity: O(log n)
//Space Complexity: O(1)
class Solution {
    public int findTarget(int arr[], int target) {
        // code here
        int n=arr.length;
        int s=0;
        int e=n-1;
        int ans=-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(arr[mid]==target)
                return mid;
            else if(mid+1<=e && arr[mid+1]==target)
            {
                return mid+1;
            }
            else if(mid-1>=s && arr[mid-1]==target)
            {
                return mid-1;
            }
            else if(arr[mid]<target)
            {
                s=mid+2;
            }
            else
            {
                e=mid-2;
            }
        }
        return ans;
        
    }
}
