#include <bits/stdc++.h>
#include <vector>
using namespace std;
class Solution {
  public:
    /*Function to count even and odd elements in the array
     * arr : Array with its elements
     */
    pair<int, int> countOddEven(vector<int> &arr) {
        // your code here
        int  n=arr.size();
        int cnt1=0,cnt2=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2!=0)
            {
               cnt1++;
            }
            else if(arr[i]%2==0)
            {
               cnt2++;
            }
        }
        return {cnt1,cnt2};
        
    }
};