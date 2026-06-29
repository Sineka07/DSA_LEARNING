//Time complexity: O(n)
//space complexity: O(n)
#include <bits/stdc++.h>
using namespace std;
class Solution {
    void segregate0and1(int[] arr) {
        // code here
        // Arrays.sort(arr);
       
        int n=arr.size();
        vector<int> temp1;
        vector<int> temp2;
        
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                temp1.push_back(arr[i]);
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                temp2.push_back(arr[i]);
            }
        }
        int a=0;
        for(int i=0;i<temp1.size();i++){
            arr[a]=temp1[i];
            a++;
        }
        for(int i=0;i<temp2.size();i++){
            arr[a]=temp2[i];
            a++;
        }
        
    }
}

