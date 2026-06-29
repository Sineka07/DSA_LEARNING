//Time Complexity: O(logN)
//Space Complexity: O(1)
class Solution {
    public int findFloor(int[] arr, int x) {
        // code here
        int n=arr.length;
        int st=0,ed=n-1;
        int ans=-1;
        while(st<=ed)
        {
            int mid=st+(ed-st)/2;
            if(arr[mid]<=x)
            {
                ans=mid;
                st=mid+1;
            }
            else
            {
                ed=mid-1;
            }
        }
        return ans;
    }
}
