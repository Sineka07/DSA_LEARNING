//Time Complexity: O(n)
//Space Complexity: O(1)
class Solution {
    // Function to find equilibrium point in the array.
    int suffix[]=new int[]{100000};
    int prefix[]=new int[]{100000};
    public static int findEquilibrium(int arr[]) {
        // code here
        int n=arr.length;
        int tot=0;
        for(int i=0;i<n;i++){
            
            tot+=arr[i];
        }
        int left_sum=0;
        int right_sum=0;
        for(int i=0;i<n;i++){
            
            right_sum=tot-left_sum-arr[i];
            if(left_sum==right_sum){
                return i;
            }
            left_sum+=arr[i];
        }
            
        return -1;
    }
}

