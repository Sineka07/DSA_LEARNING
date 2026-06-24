//Time Complexity: O(log n)
//Space Complexity: O(1)
class Solution {
  public:
  
    int binarySearch(vector<int>&arr,int start,int end,int key){
        int n=arr.size();
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==key) return mid;
            else if(arr[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    int search(vector<int>& arr, int key) {
        // Code Here
        int n=arr.size();
        int pivot=0;
        int start=0,end=n-1;
        while(start<=end){
            if(arr[start]<=arr[end]){
                pivot=start;
                break;
            }
            int mid=start+(end-start)/2;
            int prev=(mid-1+n)%n;
            int next=(mid+1)%n;
            
            if(arr[mid]<=arr[prev]&&arr[mid]<=arr[next]){
                pivot=mid;
                break;
            }
            
            if(arr[start]<=arr[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        int ans1=binarySearch(arr,0,pivot,key);
        if(ans1!=-1)
        {
            return ans1;
        }
        return binarySearch(arr,pivot,n-1,key);
        
    }
};class Solution {
  public:
  
    int binarySearch(vector<int>&arr,int start,int end,int key){
        int n=arr.size();
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==key) return mid;
            else if(arr[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    int search(vector<int>& arr, int key) {
        // Code Here
        int n=arr.size();
        int pivot=0;
        int start=0,end=n-1;
        while(start<=end){
            if(arr[start]<=arr[end]){
                pivot=start;
                break;
            }
            int mid=start+(end-start)/2;
            int prev=(mid-1+n)%n;
            int next=(mid+1)%n;
            
            if(arr[mid]<=arr[prev]&&arr[mid]<=arr[next]){
                pivot=mid;
                break;
            }
            
            if(arr[start]<=arr[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        int ans1=binarySearch(arr,0,pivot,key);
        if(ans1!=-1)
        {
            return ans1;
        }
        return binarySearch(arr,pivot,n-1,key);
        
    }
};