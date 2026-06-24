//Time Complexity: O(n)
//Space Complexity: O(1)

class Solution {
    public int firstOccurs(int arr[], int k)
    {
        int n=arr.length;
        int i=0;
        int j=n-1;
        int ans=-1;
        while(i<=j)
        {
            int mid=i+(j-i)/2;
            if(arr[mid]==k)
            {
                ans=mid;
                j=mid-1;
            }
            else if(k<arr[mid])
            {
                j=mid-1;
            }
            else
            {
                i=mid+1;
            }
        }
        return ans;
    }
    public int secondOccurs(int arr[], int k)
    {
        int n=arr.length;
        int i=0,j=n-1;
        int ans=-1;
        while(i<=j)
        {
            int mid=i+(j-i)/2;
            if(arr[mid]==k)
            {
                ans=mid;
                i=mid+1;
            }
            else if(k<arr[mid])
            {
                j=mid-1;
            }
            else
            {
                i=mid+1;
            }
        }
        return ans;
    }
    int countFreq(int[] arr, int target) {
        // code here
        int  n=arr.length;
        int cnt=0;
        int first=firstOccurs(arr, target);
        if(first==-1) return 0;
        int last=secondOccurs(arr, target);
        int ans=last-first+1;
        return ans;
    }
}

// class Solution {
//     int countFreq(int[] arr, int target) {
//         // code here
//         int  n=arr.length;
//         int i=0;
//         int cnt=0;
//         while(i<n)
//         {
//             if(arr[i]==target)
//             {
//                 cnt++;
//             }
//             i++;
//         }
//         return cnt;
//     }
// }
