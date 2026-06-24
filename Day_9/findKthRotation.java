//Time Complexity: O(logN)  
//Space Complexity: O(1)
class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        int n=arr.length;
        int s=0;
        int e=n-1;
        while(s<=e)
        {
            if(arr[s]<=arr[e])
            {
                return s;
            }
            int mid=s+(e-s)/2;
            int prev=(mid-1+n)%n;
            int nxt=(mid+1)%n;
            if(arr[mid]<=arr[prev] && arr[mid]<=arr[nxt])             
            {
                 return mid;
            }
            else if(arr[s]<=arr[mid])
            {
                s=mid+1;
            }
            else
            {
                e=mid-1;
            }
        }
        return -1;
    }
}