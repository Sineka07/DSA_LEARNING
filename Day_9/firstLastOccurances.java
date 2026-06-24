//Time Complexity: O(log n)
//Space Complexity: O(1) 
class Solution {
    int firstOccurence(int arr[],int k)
    {
        int n=arr.length;
        int ans=-1;
        int s=0,e=n-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==k){
                ans=mid;
                e=mid-1;
            }else if(k<arr[mid]){
                 e=mid-1;
            }else{
               s=mid+1;
            }
        }
        return ans;
    }
    int lastOccurence(int arr[],int k)
    {
        int n=arr.length;
        int ans=-1;
        int s=0,e=n-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==k){
                ans=mid;
                s=mid+1;
            }else if(k<arr[mid]){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int first=firstOccurence(nums,target);
        int last=lastOccurence(nums,target);
        return new int[]{first,last};
    }
}