package Day_4;
//Time complexity: O(nlog2n)
//space complexity: O(n)

class Solution {
    void merge(int arr[],int start,int mid,int end)
    {
        int n=end-start+1;
        int i=start;
        int j=mid+1;
        int k=0;
        int temp[]=new int[n];
        while(i<=mid && j<=end)
        {
            if(arr[i]<=arr[j])
            {
                temp[k]=arr[i];
                i++;
            }
            else
            {
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid)
        {
            
            temp[k]=arr[i];
            i++;
            k++;
        }
        while(j<=end)
        {
            temp[k]=arr[j];
            j++;
            k++;
        }
        for(int r=0;r<n;r++)
        {
            arr[r+start]=temp[r];
        }
        
    }
    void mergeSort(int arr[], int l, int r) {
        // code here
        if(l>=r)
        {
            return;
        }
        int mid=l+(r-l)/2;   //to avoid the overflow
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
}