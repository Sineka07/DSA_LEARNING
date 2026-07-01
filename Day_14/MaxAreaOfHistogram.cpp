#include <bits/stdc++.h>
#include <vector>
using namespace std;
class Solution {
    vector<int> nextSmallerLeft(vector<int>& height){
        int n=height.size();
        stack<pair<int,int>> st;
        vector<int> ans;
        for(int i=0;i<n;i++){
            int elem=height[i];
            if(st.empty()){
                ans.push_back(-1);
            }else if(!st.empty()&&st.top().first<elem){
                ans.push_back(st.top().second);
            }else if(!st.empty()&& st.top().first>=elem){
                while(!st.empty()&&st.top().first>=elem){
                    st.pop();
                }
                if(st.empty()){
                    ans.push_back(-1);
                }else{
                    ans.push_back(st.top().second);
                }
            }
            st.push({elem,i});
        }
        return ans;
    }
    
    vector<int> nextSmallerRight(vector<int>& height){
        int n=height.size();
        stack<pair<int,int>> st;
        vector<int> ans;
        for(int i=n-1;i>=0;i--){
            int elem=height[i];
            if(st.empty()){
                ans.push_back(n);
            }else if(!st.empty()&&st.top().first<elem){
                ans.push_back(st.top().second);
            }else if(!st.empty() && st.top().first>=elem){
                while(!st.empty() && st.top().first>=elem){
                    st.pop();
                }
                if(st.empty()){
                    ans.push_back(n);
                }else{
                    ans.push_back(st.top().second);
                }
            }
            st.push({elem,i});
        }
        reverse(ans.begin(),ans.end());
        return ans;
    }
    
public:
    int getMaxArea(vector<int> &arr) {
        if (arr.empty()) return 0;
        
        vector<int> nsl = nextSmallerLeft(arr);
        vector<int> nsr = nextSmallerRight(arr);
       
        int max_area = 0; 
        for(int i = 0; i < arr.size(); i++){
            int width = nsr[i] - nsl[i] - 1;
            int ht = arr[i];
            int area = width * ht;
            max_area = max(area, max_area);
        }
        return max_area;
    }
};
