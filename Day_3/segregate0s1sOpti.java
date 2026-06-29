//Time complexity: O(n)
//space complexity: O(1)
class Solution {
    void segregate0and1(int[] arr) {
        // code here
        // Arrays.sort(arr);
        int ind=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                int t=arr[i];
                arr[i]=arr[ind];
                arr[ind]=t;
                ind++;
            }        
        }  
        
    }
}
