//Time complexity: O(n)
//space complexity: O(1)
class Solution {
    public void sort012(int[] arr) {
        // code here
        int n=arr.length;
        int i=0;
        int mid=0;
        int j=n-1;
        while(mid<=j)
        {
            if(arr[mid]==0)
            {
                int t=arr[mid];
                arr[mid]=arr[i];
                arr[i]=t;
                i++;
                mid++;
            }
            else if(arr[mid]==1)
            {
                mid++;
            }
            else
            {
                int t=arr[mid];
                arr[mid]=arr[j];
                arr[j]=t;
                j--;
            }
        }
        
    }
}